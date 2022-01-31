package nLayeredApp.dataAccess.concretes.jdbcimpls;

import nLayeredApp.core.arrayLists.MyArrayList;
import nLayeredApp.dataAccess.abstracts.CategoryDao;
import nLayeredApp.entities.concretes.Category;

public class CategoryJdbcDao implements CategoryDao {

	private MyArrayList<Category> categories = new MyArrayList<Category>();
	private int index;

	public CategoryJdbcDao() {
		super();
	}

	public CategoryJdbcDao(MyArrayList<Category> categories) {
		super();
		this.categories = categories;
	}

	@Override
	public void add(Category category) {
		this.categories.add(category);
		System.out.println("Kategori: " + category.getName() + " Jdbc ile eklendi.");

	}

	@Override
	public void update(Category category) {
		categories.update(category.getId(), category);
		System.out.println("Kategori: " + category.getName() + " Jdbc ile güncellendi.");
	}

	@Override
	public void delete(Category category) {
		if (index == category.getId()) {
			categories.remove(index);
			System.out.println("Kategori: " + category.getName() + " Jdbc ile silindi.");
		}
	}

	@Override
	public MyArrayList<Category> getAll(Category entity) {

		return this.categories;
	}
}
