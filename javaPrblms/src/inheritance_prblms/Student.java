package inheritance_prblms;

public class Student 
{
	private int studentId;
	private String studentName;
	private double totalMarks;
	private String studentAddress;
	public Student( int studentId,String studentName,double totalMarks,String studentAddress)
	{
		super();
		this.studentId=studentId;
		this.studentName=studentName;
		this.totalMarks=totalMarks;
		this.studentAddress=studentAddress;
	}
	@Override
	public String toString() {
		return super.toString();
	}
	public int getStudetId()
	{
		return studentId;
	}
}

	