package xiangR.state;

/**
 * 售空状态
 * @author xiangrui
 *
 */
public class SoldOutState implements State {

	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("对不起，已经没有糖果了");
	}

	public void ejectQuarter() {
		System.out.println("你还没有添加硬币");
	}

	public void turnCrank() {
		System.out.println("已经没有糖果了");
	}

	public void dispense() {
		System.out.println("已经没有糖果了");
	}

}
