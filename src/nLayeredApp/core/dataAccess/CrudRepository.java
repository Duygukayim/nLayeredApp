package nLayeredApp.core.dataAccess;

import nLayeredApp.core.arrayLists.MyArrayList;
import nLayeredApp.core.entities.Entity;

//Repository Pattern
public interface CrudRepository <T extends Entity>{

	void add(T entity);
	void update(T entity);
	void delete(T entity);
	MyArrayList<T> getAll(T entity);
}
