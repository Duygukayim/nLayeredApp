package nLayeredApp.core.arrayLists;

import java.util.Arrays;

import nLayeredApp.core.entities.Entity;

public class MyArrayList<T extends Entity> {

	private Entity[] objects = {};
	private Entity[] newObject;
	private int size = 0;

	public void add(T entity) {
		if (size == objects.length) {
			int newSize = objects.length + 1;
			objects = Arrays.copyOf(objects, newSize);
		}
		objects[size++] = entity;
	}

	public void update(int id, T entity) {
		if (objects[0] != null) {
			for (int i = 0; i < objects.length; i++) {
				if (objects[i].getId() == id) {
					objects[i] = entity;
				}
			}
		} else {
			System.out.println("Güncellenecek eleman bulunamadý!");
		}
	}

	public void remove(int index) {
		if (objects.length != 1) {
			int j = 0;
			newObject = new Entity[objects.length - 1];
			for (int i = 0; i < objects.length; i++) {
				if (objects[i].getId() != index) {
					newObject[j] = objects[i];
					j++;
				}
			}
			objects = newObject;
		}
	}

	public boolean contains(T entity) {
		for (int i = 0; i < objects.length; i++) {
			if (objects[i] == entity) {
				return true;
			}
		}
		return false;
	}

	public int size() {
		return objects.length;
	}

	public void getArrayAll() {
		for (int i = 0; i < objects.length; i++) {
			System.out.println(objects[i] + " ");
		}
	}

}
