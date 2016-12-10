package xiangR.composite;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem>{

	MenuItem[] items;
	int position = 0;
	
	public DinerMenuIterator(MenuItem[] menuItems) {
		this.items = menuItems;
	}
	
	public boolean hasNext() {
		if(position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	public MenuItem next() {
		MenuItem menuItem = items[position];
		position += 1;
		return menuItem;

	}

	public void remove() {
		if(position < 0) {
			throw new IllegalStateException
					("You can remove an item until you've done at least one next()");
		} 
		if(items[position - 1] != null) {
			for(int i = position-1; i < (items.length - 1); i ++) {
				items[i] = items[i+1];
			}
			items[items.length-1] = null;
		}
	}

}
