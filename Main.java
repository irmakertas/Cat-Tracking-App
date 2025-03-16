package CatTrackingApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static final ArrayList<Cat> cats = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("1-Add new cat:");
            System.out.println("2-List cats:");
            System.out.println("3-Update cat info:");
            System.out.println("4-Exit:");
            int choice  = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1 -> addNewCat();
                case 2 -> listCats();
                case 3 -> updateCats();
                case 4 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    private static void addNewCat(){
        System.out.println("Enter the cat's name:");
        String name = scanner.next();

        System.out.println("Enter the cat's age:");
        int age = scanner.nextInt();

        System.out.println("Enter the cat's weight:");
        double weight = scanner.nextDouble();

        System.out.println("Enter the cat's food type:");
        String foodType = scanner.next();

        System.out.println("Enter the cat's daily meal count:");
        int dailyMealCount = scanner.nextInt();

        System.out.println("Enter the cat's vaccination status:");
        boolean vaccinationStatus = scanner.nextBoolean();

        System.out.println("Enter the cat's last vet visit:");
        String lastVetVisit = scanner.next();

        Nutrition nutrition = new Nutrition(foodType, dailyMealCount);
        Health health = new Health(vaccinationStatus, lastVetVisit);

        Cat newCat = new Cat(name, age, weight, nutrition, health);
        cats.add(newCat);
    }

    public static void listCats(){
        if(cats.isEmpty()){
            System.out.println("No registered cats!");
            return;
        }

        System.out.println("Registered cats:");
        for (int i = 0; i < cats.size(); i++) {
            System.out.println("Cat " + (i + 1) + ":");
            cats.get(i).showInfo();
        }
    }

    public static void updateCats(){
        listCats();
        System.out.println("Enter the number of the cat to update:");
        int choice = scanner.nextInt();

        if (choice < 1 || choice > cats.size()){
            System.out.println("Invalid choice");
            return;
        }

        Cat selectedCat = cats.get(choice - 1);

        System.out.println("Enter the new weight:");
        double newWeight = scanner.nextDouble();
        scanner.nextLine();
        selectedCat.setWeight(newWeight);

        System.out.println("Enter the new food type:");
        String newFoodType = scanner.next();

        System.out.println("Enter the new daily meal count:");
        int newMealCount = scanner.nextInt();
        scanner.nextLine();
        selectedCat.setNutrition(new Nutrition(newFoodType, newMealCount));
    }
}
