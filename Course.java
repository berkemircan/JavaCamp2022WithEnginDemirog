package Entities;

public class Course {


	private String CourseId ;
	private String CourseName ;
	private int CourseStudentAmount;
	private double CoursePrice;
	
	public Course(String CourseId , String CourseName, int CourseStudentAmount , int CoursePrice ) {
		this.CourseId = CourseId ;
		this.CourseName = CourseName ;
		this.CourseStudentAmount = CourseStudentAmount ;
		this.CoursePrice = CoursePrice ;
		
	}

	public String getCourseId() {
		return CourseId;
	}

	public void setCourseId(String courseId) {
		CourseId = courseId;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public int getCourseStudentAmount() {
		return CourseStudentAmount;
	}

	public void setCourseStudentAmount(int courseStudentAmount) {
		CourseStudentAmount = courseStudentAmount;
	}

	public double getCoursePrice() {
		return CoursePrice;
	}

	public void setCoursePrice(double coursePrice) {
		CoursePrice = coursePrice;
	}
	
}
