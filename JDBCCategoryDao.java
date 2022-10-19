package DataAccess;

import Entities.Category;

public class JDBCCategoryDao implements CategoryDao{

	@Override
	public void Add(Category category) {

		System.out.println("JDBC ile kategori getirildi :" + " " + category);
	}

	
}
