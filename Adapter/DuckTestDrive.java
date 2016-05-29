public class DuckTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		WildTurkey wildTurkey = new WildTurkey();

		TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);
		turkeyAdapter.quack();
		turkeyAdapter.fly();
	}
}