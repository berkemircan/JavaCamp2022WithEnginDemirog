package DataAccess;

import  Entities.Course ;
public class HiberNateKursDao implements KursDao {

	@Override
	public void Add(Course course) {

		System.out.println("HiberNate ile kurs eklendi :  " + course.getCourseName());
	}

	
}
