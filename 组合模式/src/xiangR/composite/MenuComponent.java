package xiangR.composite;

import java.util.Iterator;

public abstract class MenuComponent {
	   
	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}
  
	
	public String getName() {
		throw new UnsupportedOperationException();
	}
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	public boolean isVegetarian() {
		
		// 这里本是 抛出错误  然后由子类来继承 但是却不能运行于是我改为了 return true
		 throw new UnsupportedOperationException();
		//return true;
	}
  
	public void print() {
		throw new UnsupportedOperationException();
	}
	
	public Iterator<MenuComponent> createIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
