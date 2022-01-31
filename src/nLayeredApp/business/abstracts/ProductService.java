package nLayeredApp.business.abstracts;

import nLayeredApp.core.arrayLists.MyArrayList;
import nLayeredApp.entities.concretes.Product;

public interface ProductService {

	void add(Product product);
	void update(Product product);
	void delete(Product product);
	MyArrayList<Product> getArrayAll();
}
