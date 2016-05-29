public class SoldOutState implements State {
	GumballMachine gumballMachine;

	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("You inserted a quarter, but no gumball. Please eject quarter");
	}

	public void ejectQuarter() {
		System.out.println("You cannnot eject");
	}

	public void turnCrank() {
		System.out.println("You turned, no dispense.");
	}

	public void dispense() {
		System.out.println("Nothing dispensed");
	}
}