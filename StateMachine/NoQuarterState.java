public class NoQuarterState implements State {
	GumballMachine gumballMachine;

	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("You insert a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	public void ejectQuarter() {
		System.out.println("You have not inserted a quarter");
	}

	public void turnCrank() {
		System.out.println("You turned, but no gumball dispensed");
	}

	public void dispense() {
		System.out.println("You need to pay first");
	}
}