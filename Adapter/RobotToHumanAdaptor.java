public class RobotToHumanAdaptor implements Human {
	
	/*
	 * The real instance that executes operations.
	 */
	Robot littleBot;

	public RobotToHumanAdaptor(Robot bot) {
		littleBot = bot;
	}

	@Override
	public void speak() {
		System.out.println("This is a bot speaking like a human.");
		littleBot.makeSound();
	}

	@Override
	public void run() {
		System.out.println("This is a bot running like a human.");
		littleBot.moveAround();
	}

	public static void main(String[] args) {
		System.out.println("*** Rebot ***");
		Robot eva = new Robot();
		bot.makeSound();
		bot.moveAround();

		System.out.println("*** Person ***");
		Person alice = new Person();
		alice.speak();
		alice.run();

		System.out.println("*** Rebot with adaptor to Person ***");
		RobotToHumanAdaptor humanAdaptor = new RobotToHumanAdaptor(eva);
		humanAdaptor.speak();
		humanAdaptor.run();
	}
}