package inheritance_prblms;

public class CompositionDemo {

	public static void main(String[] args) {
	Student s=new Student(1, "scott", 450, "hyderabad");
	Student s2 = new Student(2, "Smith", 410, "Ameerpet");
	Trainer.viewStudentProfile(s2);
	}

}
