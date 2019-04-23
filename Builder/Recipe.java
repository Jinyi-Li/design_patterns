public class Recipe {
	private double onion;
	private double tomato;
	private double potato;
	private double garlic;
	private double pear;
	private double lemon;

	private boolean salt;
	private boolean blackPepper;
	private boolean whitePepper;
	private boolean soy;
	
	private String description;

	private Recipe(){
		// just initialize an instance which is only accessible inside class Recipe.		
	}

	public static class RecipeBuilder {
		private Recipe recipe;

		
	}
}