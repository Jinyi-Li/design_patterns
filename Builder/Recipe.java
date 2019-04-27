/*
 * The class Recipe customizes instances via its static nested class RecipeBuilder.
 */
public class Recipe {

	public static class RecipeBuilder {
		private double onion;
		private boolean salt;
		private boolean pepper;
		private String description;

		private RecipeBuilder() {		
		}

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

	public static RecipeBuilder builder() {
		return new RecipeBuilder();
	}

	private double onion;
	private boolean salt;
	private boolean pepper;
	private String description;

	private Recipe(RecipeBuilder builder) {
		onion = builder.onion;
		salt = builder.salt;
		pepper = builder.pepper;
		description = builder.description;
	}

}
