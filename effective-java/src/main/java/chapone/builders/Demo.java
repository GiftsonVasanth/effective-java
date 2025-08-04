package chapone.builders;

public class Demo {

    public static void main(String[] args) {
        //using telescopic pattern
        NutritionFactsTelescopic nutritionFacts = new NutritionFactsTelescopic(10, 20);
        //using java bean pattern
        NutritionFactsJavaBean nutritionFactsJavaBean = new NutritionFactsJavaBean();
        nutritionFactsJavaBean.setServingSize(10);
        nutritionFactsJavaBean.setServings(20);
        nutritionFactsJavaBean.setCalories(100);
        nutritionFactsJavaBean.setFat(5);
        nutritionFactsJavaBean.setSodium(10);

        // problem here is object is in inconsistent state through its construction as it is split across multiple calls.

        NutritionFacts facts = new NutritionFacts.Builder(10, 20)
                .calories(100)
                .fat(5)
                .build();

        Nutrition nutrition = Nutrition.builder()
                .servingSize(10)
                .servings(20)
                .calories(100)
                .fat(5)
                .build();
    }
}
