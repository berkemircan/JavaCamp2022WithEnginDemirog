package DataAccess;

import Entities.Instructor;

public class JDBCInstructorDao  implements InstructorDao{

	public void Add(Instructor instructor) {
		System.out.println("JDBC ile instructor getirildi : "  + instructor.getInstructorId() + " " + instructor.getInstructorName());
		
	}
	
	

}
