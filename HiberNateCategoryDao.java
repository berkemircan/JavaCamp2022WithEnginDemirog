package DataAccess;

import Entities.Category;

public class HiberNateCategoryDao implements CategoryDao {

	
	public void Add(Category category) {
		

		System.out.println("HiberNate ile Kategori Getirildi : " + category.getCategoryId() + " " + category.getCategoryName());
	}

}
