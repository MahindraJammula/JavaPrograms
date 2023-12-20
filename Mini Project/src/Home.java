import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class Home extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("CHOOSE A DATASTRUCTURE\r\n");
		lblNewLabel.setBounds(108, 11, 218, 19);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setToolTipText("");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setLabelFor(lblNewLabel);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		JButton array = new JButton("Array");
		array.setFont(new Font("Constantia", Font.BOLD, 12));
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE ARRAY WINDOW OPENIN CODE HERE
			}
		});
		array.setBounds(185, 51, 74, 23);
		contentPane.add(array);
		
		JButton stack = new JButton("Stack");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE STACK WINDOW OPENIN CODE HERE
			}
		});
		stack.setFont(new Font("Constantia", Font.BOLD, 12));
		stack.setBounds(71, 95, 74, 23);
		contentPane.add(stack);
		
		JButton queue = new JButton("Queue");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE QUEUE WINDOW OPENIN CODE HERE
			}
		});
		queue.setFont(new Font("Constantia", Font.BOLD, 12));
		queue.setBounds(304, 95, 74, 23);
		contentPane.add(queue);
		
		JButton cq = new JButton("CircularQueue");
		cq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE CIRCULARQUEUE WINDOW OPENIN CODE HERE
			}
		});
		cq.setFont(new Font("Constantia", Font.BOLD, 12));
		cq.setBounds(52, 156, 127, 23);
		contentPane.add(cq);
		
		JButton dll = new JButton("DoublyLinkedList");
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE DOUBLYLINKEDLIST WINDOW OPENIN CODE HERE
			}
		});
		dll.setFont(new Font("Constantia", Font.BOLD, 12));
		dll.setBounds(140, 218, 152, 23);
		contentPane.add(dll);
		
		JButton sll_1 = new JButton("SinglyLinkedList");
		sll_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE SINGLYLINKEDLIST WINDOW OPENIN CODE HERE
			}
		});
		sll_1.setFont(new Font("Constantia", Font.BOLD, 12));
		sll_1.setBounds(267, 156, 141, 23);
		contentPane.add(sll_1);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
		}
	}
}
