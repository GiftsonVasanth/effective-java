package chapone.builders;

public class Nutrition {
    private final int servingSize; // (mL) required
    private final int servings; // (per container) required
    private final int calories; // optional
    private final int fat; // (g) optional

    public Nutrition(NutritionBuilder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
    }

    public static NutritionBuilder builder() {
        return new NutritionBuilder();
    }

    public static class NutritionBuilder {
        private int servingSize; // (mL) required
        private int servings; // (per container) required
        private int calories = 0; // optional
        private int fat = 0; // (g) optional

        public NutritionBuilder servingSize(int servingSize) {
            this.servingSize = servingSize;
            return this;
        }
        public NutritionBuilder servings(int servings) {
            this.servings = servings;
            return this;
        }
        public NutritionBuilder calories(int calories) {
            this.calories = calories;
            return this;
        }
        public NutritionBuilder fat(int fat) {
            this.fat = fat;
            return this;
        }
        public Nutrition build() {
            return new Nutrition(this);
        }
    }
}
