package nLayeredApp.business.abstracts;

import nLayeredApp.core.arrayLists.MyArrayList;
import nLayeredApp.entities.concretes.Category;

public interface CategoryService {

	void add(Category category);
	void update(Category category);
	void delete(Category category);
	MyArrayList<Category> getArrayAll();
}
