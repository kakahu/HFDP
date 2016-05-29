public class SoldState implements State {
	GumballMachine gumballMachine;
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("Wait, we already are giving you a gumball");
	}

	public void ejectQuarter() {
		System.out.println("Sorry you already turned the crank/");
	}

	public void turnCrank() {
		System.out.println("Do not turn twice.");
	}

	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		} else {
			System.out.println("Out of storage");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
}