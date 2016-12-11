package xiangR.state;

/**
 * 没有硬币的状态
 * @author xiangrui
 *
 */
public class NoQuarterState implements State {

	GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	public void insertQuarter() {
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	public void ejectQuarter() {
		System.out.println("你还没有添加硬币，怎么能空手套白狼");
	}

	public void turnCrank() {
		System.out.println("兄弟没有硬币，不给糖果");
	}

	public void dispense() {
		System.out.println("兄弟没有硬币，不给糖果");
	}

}

