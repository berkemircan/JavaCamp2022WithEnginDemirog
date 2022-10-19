package Business;

import DataAccess.InstructorDao;

import Entities.Instructor;
import Logging.Logger;

public class InstructorManager {
	
	private InstructorDao ınstructorDao ;
	
	private Logger[] Loggers ;
	
	
    public InstructorManager(InstructorDao ınstructorDao , Logger[] Loggers) {
    	
    	this.ınstructorDao = ınstructorDao ;
    	this.Loggers = Loggers ; 
    	
    }
    
    public void Add(Instructor ınstructor) {
    	
    	Instructor[] ınstructors = {
    			new Instructor( 123456 , " Engin " , "Demiroğ " , 55000) , 
    			new Instructor(4363747 , " Levent " , " Sapcı " , 22000) , 
    			new Instructor(456547 , "Gizem " , " Fidan " , 24546),
    			} ;
    	
    	ınstructorDao.Add(ınstructor);
    	for(Logger logger : Loggers) {
    		logger.log(ınstructor.getInstructorId() + ınstructor.getInstructorName() + ınstructor.getInstructorLastName());
    	}
    }
	

}
