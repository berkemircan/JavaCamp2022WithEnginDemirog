package Logging;

import Entities.Course;

public class ConsoleLogger implements Logger {

	
	public void log(String  data) {

		System.out.println("kurs loglandı : " + data);
	}
	
	

}
