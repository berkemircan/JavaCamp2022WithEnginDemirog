import Business.CategoryManager;
import Business.CourseManager;
import Business.InstructorManager;
import DataAccess.CategoryDao;
import DataAccess.HiberNateCategoryDao;
import DataAccess.JDBCCategoryDao;
import DataAccess.JDBCKursDao;
import DataAccess.HiberNateKursDao;
import DataAccess.KursDao;
import Entities.Category;
import Entities.Course;
import Entities.Instructor;
import DataAccess.InstructorDao;

import DataAccess.JDBCInstructorDao;
import Logging.ConsoleLogger;
import Logging.DataBaseLogger;
import Logging.FileLogger;
import Logging.Logger;
import Logging.MailLogger;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] Loggers = { new DataBaseLogger(), new FileLogger(), new MailLogger(), new ConsoleLogger() };

		Category category1 = new Category("1MDC2022", "MobileDevelopingCategory2022");
		CategoryManager categoryManager = new CategoryManager(new HiberNateCategoryDao(), Loggers);
		categoryManager.Add(category1);

		

		System.out.println("---------------");

		Instructor ınstructor1 = new Instructor(121245, "Ahmet", "Yılmaz ", 27500);

		InstructorManager ınstructorManager = new InstructorManager(new JDBCInstructorDao(), Loggers);
		ınstructorManager.Add(ınstructor1);
		
		
		System.out.println("------------------");
		Course course1 = new Course("2345BEC", "JavaCamp2022", 2234, 0);
		CourseManager courseManager = new CourseManager(new JDBCKursDao(), Loggers);
		courseManager.Add(course1);

		System.out.println("konsol kontrolü ");

	}

}
