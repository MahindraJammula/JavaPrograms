
public class TrainerApp {

	public static void main(String[] args) {
		Trainer t1= new Trainer();
		t1.id=1234;
		t1.name="mahi";
		t1.subject="java";
		System.out.println("id="+t1.id+"name="+t1.name+"subject="+t1.subject);
		t1.teach();
		t1.takeattendance();
	}

}
