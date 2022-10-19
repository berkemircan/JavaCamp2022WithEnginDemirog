package Business;


import DataAccess.KursDao;
import Entities.Course;
import Logging.Logger;

public class CourseManager {

	private KursDao kursDao;

	private Logger[] Loggers;

	public CourseManager(KursDao kursDao, Logger[] Loggers) {

		this.kursDao = kursDao;
		this.Loggers = Loggers;

	}

	public void Add( Course course) throws Exception {

		Course[] Courses = { new Course("1JC2022", "JavaCamps2022" , 2350 , 0), new Course("1SCOJ2022", " SeniorCampOfJava2022" , 256 , 0),
				new Course("1C+A2022", "C+AngularCamp2022" , 2340 , 0), new Course("1JS2022", "JavaScriptCamp2022" , 1500 , 0),
				new Course("1SOP2022", "StartingOfProgramming2022" , 3500 , 0), new Course("1J+R2022", "Java+ReactCamp2022" , 2250 , 0)

		};

		for (Course Course1 : Courses) {
			if (course.getCourseName() == Course1.getCourseName()) {
				throw new Exception("Kurs Adı birden fazla kez aynı olamaz : Kurs Adı girilemedi!");
			} else if (course.getCoursePrice() <= 0) {
				throw new Exception("kurs fiyatı 0 dan küçük olamaz");
			}
			else {
				System.out.println("Kurs Adı Geçerlidir : Kurs Adı girildi");
			} 

		}

		
		kursDao.Add(course);
		
		for(Logger logger : Loggers) {
			logger.log(course.getCourseName());
		}

	}

}
