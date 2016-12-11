package xiangR.state;

public class GumballMachine {
	
	State soldOutState;
	State soldState;
	State noQuarterState;
	State HasQuarterState;
	State WinnerState;
	
	// 初始的默认状态
	State state = soldOutState;
	private int count = 0;
	
	public GumballMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		soldState = new SoldState(this);
		noQuarterState = new NoQuarterState(this);
		HasQuarterState = new HasQuarterState(this);
		
		this.count = numberGumballs;
		if(count > 0) { 
			state = noQuarterState;
		}
	}
	
	public void insertQuarter() {
		state.insertQuarter(); 
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void releaseBall() {
		System.out.println("A gumball comes rolling out the solt");
		this.count --;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return HasQuarterState;
	}
	
	public State getWinnerState() {
		return WinnerState;
	}

	public int getCount() {
		return this.count;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
