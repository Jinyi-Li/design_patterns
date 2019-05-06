public class Person implements Human {
	
	@Override
	public void speak() {
		System.out.println("Hi, nice to meet you.");
	}

	@Override
	public void run() {
		System.out.println("Running fast");
	}
}