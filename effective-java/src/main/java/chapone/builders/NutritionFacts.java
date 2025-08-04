package chapone.builders;

public class NutritionFacts {
    private final int servingSize; // (mL) required
    private final int servings; // (per container) required
    private int calories = 0; // optional
    private int fat = 0; // (g) optional
    public static class Builder {
        private final int servingSize; // (mL) required
        private final int servings; // (per container) required
        private int calories = 0; // optional
        private int fat = 0; // (g) optional
        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }
        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }
        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }

    }

    public NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
    }
}
