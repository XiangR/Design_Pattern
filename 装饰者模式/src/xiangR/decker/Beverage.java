package xiangR.decker;

/**
 * 定义 最顶层的 饮料 类
 * @author xiangrui
 *
 */
public abstract class Beverage {
	
	public String description = "Unkonwn Beverage";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cast();

}
