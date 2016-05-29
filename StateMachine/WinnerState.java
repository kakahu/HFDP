public class WinnerState implements State {
	GumballMachine gumballMachine;

	public WinnerState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("Please turn crank before you insert again");
	}

	public void ejectQuarter() {
		System.out.println("You cannot eject after you turned");
	}

	public void turnCrank() {
		System.out.println("you already turned.");
	}

	public void dispense() {
		System.out.println("You are a Winner");
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("Oops, out of balls");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}
}