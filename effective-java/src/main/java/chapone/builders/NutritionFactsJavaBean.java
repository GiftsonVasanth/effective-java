package chapone.builders;

public class NutritionFactsJavaBean {
    private int servingSize; // (mL) required
    private int servings; // (per container) required
    private int calories = 0; // optional
    private int fat = 0; // (g) optional
    private int sodium = 0;
    private int carbohydrate = 0; // (g) optional

    public NutritionFactsJavaBean() {
    }

    // setters
    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }
}
