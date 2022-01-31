package nLayeredApp.business.concretes;

import nLayeredApp.business.abstracts.ProductService;
import nLayeredApp.core.arrayLists.MyArrayList;
import nLayeredApp.dataAccess.abstracts.ProductDao;
import nLayeredApp.entities.concretes.Product;

public class ProductManager implements ProductService{
	
    private ProductDao productDao;
    
    public ProductManager (ProductDao productDao) {
        super ();
        this.productDao = productDao;
    }
        
    @Override
   public void add(Product product) {
        //Business rules
        if(product.getUnitPrice()>0) {
            this.productDao.add(product);
            System.out.println("Ürün eklendi.");
        }
    }   //call logger
        
    @Override
    public void update(Product product) {
    	this.productDao.update(product);
        System.out.println("Ürün güncellendi.");
    }
    
    @Override
    public void delete(Product product) {
    	this.productDao.delete(product);
    	System.out.println("Ürün silindi.");
    }
    
    @Override
	public MyArrayList<Product> getArrayAll() {
		
		return this.productDao.getAll(null);
	}
           
}