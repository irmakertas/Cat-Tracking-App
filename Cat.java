package CatTrackingApplication;

public class Cat {
    private String name;
    private int age;
    private double weight;
    private Nutrition nutrition;
    private Health health;

    public Cat(String name, int age, double weight, Nutrition nutrition, Health health) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.nutrition = nutrition;
        this.health = health;
    }

    public void showInfo(){
        System.out.println("Cat's name: " + name);
        System.out.println("Cat's age: " + age);
        System.out.println("Cat's weight: " + weight);
        nutrition.showNutritionInfo();
        health.showHealthStatus();
    }

    public String getName() {
        return name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setNutrition(Nutrition nutrition) {
        this.nutrition = nutrition;
    }

    public void setHealth(Health health) {
        this.health = health;
    }
}
