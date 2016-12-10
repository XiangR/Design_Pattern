package strategy;

/**
 * 继承自 Duck 
 * 所以直接继承 Duck 中定义的 fly quack 接口的实例  在对象创建的时候  为接口的实例初始化
 * 我们可以定义出OtherDuck extends Duck 同时为其分配合适的方法  
 * @author xiangrui
 *
 */
public class MallardDuck extends Duck{
	
	public MallardDuck() { 
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("I am really a duck");
	}


	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
	}
}
