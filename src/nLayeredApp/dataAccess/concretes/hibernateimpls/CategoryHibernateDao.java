package nLayeredApp.dataAccess.concretes.hibernateimpls;

import nLayeredApp.core.arrayLists.MyArrayList;
import nLayeredApp.dataAccess.abstracts.CategoryDao;
import nLayeredApp.entities.concretes.Category;

public class CategoryHibernateDao implements CategoryDao {

	private MyArrayList<Category> categories = new MyArrayList<Category>();
	private int index;

	public CategoryHibernateDao() {
		super();
	}

	public CategoryHibernateDao(MyArrayList<Category> categories) {
		super();
		this.categories = categories;
	}

	@Override
	public void add(Category category) {
		this.categories.add(category);
		System.out.println("Kategori: " + category.getName() + " Hibernate ile eklendi.");

	}

	@Override
	public void update(Category category) {
		categories.update(category.getId(), category);
		System.out.println("Kategori: " + category.getName() + " Hibernate ile güncellendi.");
	}

	@Override
	public void delete(Category category) {
		if (index == category.getId()) {
			categories.remove(index);
			System.out.println("Kategori: " + category.getName() + " Hibernate ile silindi.");
		}
	}

	public MyArrayList<Category> getAll(Category entity) {

		return this.categories;
	}
}
