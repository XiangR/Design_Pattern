package xiangR.state;

import java.util.Random;

/**
 * 有硬币的状态
 * @author xiangrui
 *
 */
public class HasQuarterState implements State{

	GumballMachine gumballMachine;
	Random randomWinner = new Random(System.currentTimeMillis());
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("机器里面已经有硬币了");
	}

	public void ejectQuarter() {
		System.out.println("退回硬币中");
		gumballMachine.setState(gumballMachine.getNoQuarterState());
	}

	public void turnCrank() {
		System.out.println("请稍候啊");
		int winner = randomWinner.nextInt(10);
		if(winner == 0 && gumballMachine.getCount() > 1) {
			gumballMachine.setState(gumballMachine.getWinnerState());
		} else {
			gumballMachine.setState(gumballMachine.getSoldState());
		}
	}

	public void dispense() {
		System.out.println("没有糖果可以给你");
	}

}
