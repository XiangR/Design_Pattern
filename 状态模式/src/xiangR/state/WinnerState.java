package xiangR.state;

public class WinnerState implements State {

	GumballMachine gumballMachine;
	
	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	
	public void insertQuarter() {
		System.out.println("小伙子，你已经加入过硬币了");
	}

	public void ejectQuarter() {
		System.out.println("小伙子，已经生产糖果了不能退回了");
	}

	public void turnCrank() {
		System.out.println("正在生产中");
	}

	public void dispense() {
		System.out.println("你是Winner， 我们将作为两个糖果返还给你");
		gumballMachine.releaseBall();
		
		if(gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			if(gumballMachine.getCount() == 0) {
				System.out.println("天呐，糖果已经卖完了");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			} else {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			}
		}
	}

}
