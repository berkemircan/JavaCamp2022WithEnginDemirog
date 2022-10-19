package DataAccess;

import Entities.Instructor;

public class HiberNateInstructorDao implements InstructorDao {

	@Override
	public void Add(Instructor instructor) {

		System.out.println("HiberNate ile instructor getirildi : "  + instructor.getInstructorId() + " " + instructor.getInstructorName());
		
	}

}
