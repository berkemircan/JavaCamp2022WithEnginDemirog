package Entities;

public class Instructor {
	private int InstructorId;
	private String InstructorName;
	private String InstructorLastName;
	private double InstructorSalary;
	
	
	





	public  Instructor( int InstructorId , String InstructorName , String InstructorLastName , double InstructorSalary) {
		
		this.InstructorId = InstructorId ;
		this.InstructorName = InstructorName ;
		this.InstructorLastName = InstructorLastName ;
		this.InstructorSalary = InstructorSalary ;
		
		
		
		
	} ;

		
		
	

	public int getInstructorId() {
		return InstructorId;
	}

	public void setInstructorId(int instructorId) {
		InstructorId = instructorId;
	}

	public String getInstructorName() {
		return InstructorName;
	}

	public void setInstructorName(String instructorName) {
		InstructorName = instructorName;
	}

	public String getInstructorLastName() {
		return InstructorLastName;
	}

	public void setInstructorLastName(String instructorLastName) {
		InstructorLastName = instructorLastName;
	}

	public double getInstructorSalary() {
		return InstructorSalary;
	}

	public void setInstructorSalary(double instructorSalary) {
		InstructorSalary = instructorSalary;
	}

}
