package xiangR.state;

/**
 * 出售状态
 * @author xiangrui
 *
 */
public class SoldState implements State {

	GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("bor 现在已经是售出状态了");
	}

	public void ejectQuarter() {
		System.out.println("对不起，已经准备售出了不能再退回了");
	}

	public void turnCrank() {
		System.out.println("大兄弟，你可不能投一个硬币得到两个糖果");
	}

	public void dispense() {
		gumballMachine.releaseBall();
		
		if(gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("天呐，糖果已经卖完了");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

}
