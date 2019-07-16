package demos;

public class Student {
	
	int studentId;
	String studentName;
	int studentMarks;
	int fees;
	
	public Student()
	{
		this.studentId= 222;
		this.studentName= "pooja";
		this.studentMarks= 87;
		this.fees= 120000;
		
		
		
	}

	public Student(int studentId, String studentName, int studentMarks, int fees) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
		this.fees = fees;
	}

	public Student(int studentId, String studentName) {
		
		this.studentId = studentId;
		this.studentName = studentName;
	}

	public Student(int studentId, String studentName, int studentMarks) {
	
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentMarks = studentMarks;
	}
	  public static void main(String[] args) {
		  
		  System.out.println("");
		
		  Student S1 = new Student();
		  Student S2 = new Student(223,"neha",88,28000);
		  Student S3 = new Student(676,"priya");
		  Student S4 = new Student(777,"divya",76);
		  
		  
		  
		  
				  
	}
	
	

}
