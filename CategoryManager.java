package Business;

import DataAccess.CategoryDao;

import Entities.Category;
import Logging.Logger;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger[] Loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] Loggers) {
		this.categoryDao = categoryDao;
		this.Loggers = Loggers;

	}

	public void Add(Category category) throws Exception {
		Category[] categories = {new Category("1BEC2022" , "BackEndCamps2022" ) , new Category("1FEC2022", "FrontEndCamps2022")};
		
		for(Category category1:categories) {
			if(category.getCategoryName()== category1.getCategoryName()) {
				throw new Exception("Kategori ismi tekrar edilemez ");
			} else {
				System.out.println("Kategori başarıyla eklendi " + " " + category.getCategoryId() + " " + category.getCategoryName());
				
			}
		}
		
		categoryDao.Add(category);
		for(Logger logger : Loggers) {
			logger.log(category.getCategoryName());
		}

	}

}
