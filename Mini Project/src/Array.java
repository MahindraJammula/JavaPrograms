import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel deletepos;
	private JTextField length;
	private JTextField element;
	private JTextField textField;
	private JTextField insertposition;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 600);
		deletepos = new JPanel();
		deletepos.setBackground(new Color(128, 128, 64));
		deletepos.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(deletepos);
		
		JLabel lblNewLabel_1 = new JLabel(" Enter Array Length");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 12));
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		deletepos.add(lblNewLabel_1);
		
		length = new JTextField();
		deletepos.add(length);
		length.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Array Data Structure");
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 14));
		deletepos.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Create Array");
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("Enter An Integer Element");
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 14));
		deletepos.add(lblNewLabel_2);
		
		element = new JTextField();
		deletepos.add(element);
		element.setColumns(10);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		deletepos.add(insert);
		deletepos.add(btnNewButton);
		
		insertposition = new JTextField();
		deletepos.add(insertposition);
		insertposition.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("DELETE POSITION");
		lblNewLabel_3.setFont(new Font("Constantia", Font.BOLD, 14));
		deletepos.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("POSITION");
		lblNewLabel_4.setFont(new Font("Constantia", Font.BOLD, 14));
		deletepos.add(lblNewLabel_4);
		
		JButton delete = new JButton("DELETE");
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		deletepos.add(delete);
		
		textField = new JTextField();
		deletepos.add(textField);
		textField.setColumns(10);
	}
}
