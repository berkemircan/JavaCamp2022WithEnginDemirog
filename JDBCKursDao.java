package DataAccess;

import Entities.Course;



public class JDBCKursDao implements KursDao {

	@Override
	public void Add(Course course) {
		System.out.println("JDBC ile kurs eklendi :" + course.getCourseName() );
	}

}
