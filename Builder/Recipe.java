/*
 * The class Recipe customizes instances via its static inner class RecipeBuilder.
 */
public class Recipe {
	/*
	 * RecipeBuilder customizes and builds Recipe instances, only serving for the outer class.
	 */
	public static class RecipeBuilder {
		/*
		 * The customizable members of the outer class. 
		 */
		private double onion;
		private boolean salt;
		private boolean pepper;
		private String description;
		
		/*
 		 * Construct builders for the outer class.
		 */
		private RecipeBuilder() {		
		}

		/*
		 * Update requirements and return the builder itself.
		 */
		public RecipeBuilder addOnion(double theOnion) {
			onion = theOnion;
			return this;
		}

		public RecipeBuilder withSalt() {
			salt = true;
			return this;
		}

		public RecipeBuilder withPepper() {
			pepper = true;
			return this;
		}

		public RecipeBuilder addDescription(String theDesc) {
			description = theDesc;
			return this;
		}
		
		public Recipe build() {
			return new Recipe(this);
		}
	}

	/*
	 * Create a builder to start customization. It exposes the inner class instances to the world.
	 */
	public static RecipeBuilder builder() {
		return new RecipeBuilder();
	}

	/*
	 * Some customizable members.
	 */
	private double onion;
	private boolean salt;
	private boolean pepper;
	private String description;

	/*
	 * Some not customizable members.
	 */
	private Mapper recipeMapper;

	/*
	 * Do not expose constructors to public as part of an effort to
	 * enforce the Builder Pattern -- only build instances via builder.
	 */
	private Recipe(RecipeBuilder builder) {
		onion = builder.onion;
		salt = builder.salt;
		pepper = builder.pepper;
		description = builder.description;
	}

	/*
	 * Show how users may create a recipe using a builder.
	 */
	public static void main(String[] args) {
		Recipe myNewRecipe = Recipe.builder().addOnion(3.14).withPepper().build();		
	}

}
