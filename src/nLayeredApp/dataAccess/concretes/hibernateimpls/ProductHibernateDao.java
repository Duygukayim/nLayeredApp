package nLayeredApp.dataAccess.concretes.hibernateimpls;

import nLayeredApp.core.arrayLists.MyArrayList;
import nLayeredApp.dataAccess.abstracts.ProductDao;
import nLayeredApp.entities.concretes.Product;

public class ProductHibernateDao implements ProductDao {

	MyArrayList<Product> products = new MyArrayList<Product>();
	private int index=0;

	public ProductHibernateDao() {
		super();
	}

	public ProductHibernateDao(MyArrayList<Product> products) {
		super();
		this.products = products;
	}

	@Override
	public void add(Product product) {
		this.products.add(product);
		System.out.println("Ürün: " + product.getName() + " Hibernate ile eklendi.");

	}

	@Override
	public void update(Product product) {
		products.update(product.getId(), product);
		System.out.println("Ürün: " + product.getName() + " Hibernate ile güncellendi.");
	}

	@Override
	public void delete(Product product) {
		if (index == product.getId()) {
			products.remove(index);
			System.out.println("Ürün: " + product.getName() + " Hibernate ile silindi.");
		}
	}
	@Override
	public MyArrayList<Product> getAll(Product entity) {
		
		return this.products;
	}
}