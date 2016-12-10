package Single_Pattern;

public class Single {
	// 饿汉式
	
	// 私有的成员变量 使其变得可控
	private static Single single_obj = new Single();
	
	// 私有的构造方法
	private Single() {
	}
	
	public static Single getInstance() {
		return single_obj;
	}

	// 用于测试的语句
	private int num;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}
