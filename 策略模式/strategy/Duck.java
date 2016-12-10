package strategy;

/**
 * 定义的抽象的Duck的模型   其具有 fly/quack 两个接口的实例
 * 为Duck的实例构造方法（给子类继承） 
 * @author xiangrui
 *
 */
public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
		public Duck() {
		
	}
	
	public abstract void display();
	
	public void performQuack() { 
		quackBehavior.quack();
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void swim() {
		System.out.println("All duck can swim!");
	}
	

	/**
	 * 为Duck增加一个更改其 行为的方法
	 * @param flyBehavior
	 */
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}


}
