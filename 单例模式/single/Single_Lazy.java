package Single_Pattern;

public class Single_Lazy {

	// 这是一种懒汉式
	
	private static Single_Lazy single_obj = null;
	
	private Single_Lazy() {
		
	}
	
	/*
	 * 这个是对懒汉式的一个线程的改进 
	 */
	public static Single_Lazy getInstance() { 
	
		if(single_obj == null) {
			
			synchronized(Single_Lazy.class){
				if(single_obj == null) {
					single_obj = new Single_Lazy();
				}
			}
		}
		
		return single_obj;
	}
	
	
	/*
	 *  normal
	 * 
		public static Single_Lazy getInstance() {
			
			if(single_obj == null) {
				single_obj = new Single_Lazy();
			}
		    return single_obj;
		}
	*/
}
