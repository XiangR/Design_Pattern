package xiangR.composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {

	// 栈里用来放置迭代器
	Stack<Iterator<MenuComponent>> stack = new Stack<Iterator<MenuComponent>>();
	
	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}
	
	public boolean hasNext() {
		if(stack.isEmpty()) {
			return false;
		} else {
			Iterator<MenuComponent> iterator = (Iterator<MenuComponent>) stack.peek();
			if(!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}

	public MenuComponent next() {
		if(hasNext()) {
			Iterator<MenuComponent> iterator = (Iterator<MenuComponent>) stack.peek();
			MenuComponent component = (MenuComponent) iterator.next();
			if(component instanceof Menu) {
				stack.push(((Menu) component).createIterator());
			}
			return component;
		} else {
			return null;
		}
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

}
