package CatTrackingApplication;

public class Nutrition {
    private String foodType;
    private int dailyMealCount;

    public Nutrition(String foodType, int dailyMealCount) {
        this.foodType = foodType;
        this.dailyMealCount = dailyMealCount;
    }

    public void showNutritionInfo(){
        System.out.println("Food Type: " + foodType);
        System.out.println("Meal Count: " + dailyMealCount);
    }
}
