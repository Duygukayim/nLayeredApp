package nLayeredApp.dataAccess.concretes.jdbcimpls;

import nLayeredApp.core.arrayLists.MyArrayList;
import nLayeredApp.dataAccess.abstracts.ProductDao;
import nLayeredApp.entities.concretes.Product;

public class ProductJdbcDao implements ProductDao {

	private MyArrayList<Product> products = new MyArrayList<Product>();
	private int index;

	public ProductJdbcDao() {
		super();
	}

	public ProductJdbcDao(MyArrayList<Product> products) {
		super();
		this.products = products;
	}

	@Override
	public void add(Product product) {
		this.products.add(product);
		System.out.println("Ürün: " + product.getName() + " Jdbc ile eklendi.");
	}

	@Override
	public void update(Product product) {
		products.update(product.getId(), product);
		System.out.println("Ürün: " + product.getName() + " Jdbc ile güncellendi.");
	}

	@Override
	public void delete(Product product) {
		if (index == product.getId()) {
			products.remove(index);
			System.out.println("Ürün: " + product.getName() + " Jdbc ile silindi.");
		}
	}

	@Override
	public MyArrayList<Product> getAll(Product entity) {
		
		return this.products;
	}

}
