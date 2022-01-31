package nLayeredApp.business.concretes;

import nLayeredApp.business.abstracts.CategoryService;
import nLayeredApp.core.arrayLists.MyArrayList;
import nLayeredApp.dataAccess.abstracts.CategoryDao;
import nLayeredApp.entities.concretes.Category;

public class CategoryManager implements CategoryService{
	
	private CategoryDao categoryDao;

	public CategoryManager(CategoryDao categoryDao) {
		super();
		this.categoryDao = categoryDao;
	}

	@Override
	public void add(Category category) {
		this.categoryDao.add(category);
		System.out.println("Kategori eklendi.");
	}

	@Override
	public void update(Category category) {
		this.categoryDao.update(category);
		System.out.println("Kategori güncellendi.");
	}

	@Override
	public void delete(Category category) {
		this.categoryDao.delete(category);
		System.out.println("Kategori silindi.");
	}

	@Override
	public MyArrayList<Category> getArrayAll() {
		
		return this.categoryDao.getAll(null);
	}

}
