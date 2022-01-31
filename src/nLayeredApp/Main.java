package nLayeredApp;

import nLayeredApp.business.concretes.CategoryManager;
import nLayeredApp.business.concretes.ProductManager;
import nLayeredApp.dataAccess.concretes.hibernateimpls.CategoryHibernateDao;
import nLayeredApp.dataAccess.concretes.hibernateimpls.ProductHibernateDao;
import nLayeredApp.entities.concretes.Category;
import nLayeredApp.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		CategoryManager category = new CategoryManager(new CategoryHibernateDao());

		Category category1 = new Category(1, "Meyve");
		Category category2 = new Category(2, "Sebze");
		Category category3 = new Category(3, "Ýçecek");

		ProductManager product = new ProductManager(new ProductHibernateDao());

		Product product1 = new Product(1, "Elma", 20);
		Product product2 = new Product(2, "Üzüm", 25);
		Product product3 = new Product(3, "Portakal", 15);

		product.add(product1);
		product.add(product2);
		product.update(new Product(2, "Mandalina", 18));
		product.add(product3);
		product.delete(product2);
		product.getArrayAll();
	}

}
