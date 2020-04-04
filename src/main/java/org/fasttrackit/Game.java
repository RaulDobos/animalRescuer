package org.fasttrackit;

import java.time.LocalDate;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Game {

    private Adopter adopter;
    private Animal animal;
    private Vet vet;
    private List<AnimalFood> availableFood = new ArrayList<AnimalFood>();
    private Activity[] availableActivities = new Activity[3];
    final int min = 1;
    final int max = 9;


    public void start(){
        System.out.println("Welcome to the Animal Rescuer game!");

        initAdopter();

        initAnimal();

        nameAnimal();

        printAnimalProperties();

        initFood();

        initActivities();

        System.out.println("Feed and play with your " + animal.getType() + " until their hunger reaches 0 and happiness reaches 10.\n");

        System.out.println("\nHunger level: " + animal.getHungerLevel());

        while(animal.getHungerLevel() != 0){
            requireFeeding();
        }

        System.out.println("Your " + animal.getType() + " is not hungry anymore.");

        System.out.println("\nHappiness level: " + animal.getHapinessLevel());

        while(animal.getHapinessLevel() != 10){
            requireActivity();
        }

        animal.showHappiness();

        System.out.println("\nCongratulations! Your " + animal.getType() + " is happy. You have finished the game!");
    }

    private void initAnimal(){

        if(getAnimalTypeFromUser() == 1){
            animal = new Dog();
        }
        else{
            animal = new Cat();
        }

        animal.setAge(3);
        animal.setHealthLevel(getRandomIntegerValueInThisRange(1, 10));
        animal.setHungerLevel(getRandomIntegerValueInThisRange(5, 10));
        animal.setHapinessLevel(getRandomIntegerValueInThisRange(1, 5));
        animal.setFavouriteFood("Chappie");
        animal.setFavouriteActivity("petting");

    }

    private void printAnimalProperties(){
        System.out.println(animal.toString());
    }

    private int getAnimalTypeFromUser(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 1 to rescue a dog or 2 to rescue a cat.");
        int choice = 0;

        try{
            choice = scanner.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("You have entered a wrong value, try again.");
            return getAnimalTypeFromUser();
        }

        scanner.nextLine();

        if(choice == 1){
            return choice;
        }
        else if(choice == 2){
            return choice;
        }
        else{
            System.out.println("You can only enter 1 or 2. Try again.");
            getAnimalTypeFromUser();
        }

        return -1;
    }

    private void initAdopter(){
        adopter = new Adopter();

        adopter.setName(getAdopterNameFromUser());

        System.out.println("Your name is " + adopter.getName() + ".");

    }

    private String getAdopterNameFromUser(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert your name: ");
        String name = scanner.nextLine();

        return name;
    }

    private void nameAnimal(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert a name for your " + animal.getType() + ":");
        animal.setName(scanner.nextLine());
    }



    private void requireFeeding(){
        printAvailableFood();

        System.out.println("Choose a food between 1 and 3: ");

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();

        adopter.feed(animal, availableFood.get(choice - 1));

    }

    private void requireActivity(){
        printAvailableActivities();

        System.out.println("Choose an activity between 1 and 3: ");

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        scanner.nextLine();

        adopter.doActivity(animal, availableActivities[choice - 1]);
    }

    private void initFood(){

//        private String name;
//        private int price;
//        private int weight;
//        private LocalDate expirationDate;
//        private int stock;
//        private String flavour;

        AnimalFood food1 = new AnimalFood("Pedigree");
        food1.setPrice(8);
        food1.setWeight(300);
        food1.setExpirationDate(LocalDate.of(2020, 4, 20));
        food1.setStock(4);
        food1.setFlavour("beef");
        availableFood.add(food1);

        AnimalFood food2 = new AnimalFood("Chappie");
        food2.setPrice(10);
        food2.setWeight(350);
        food2.setExpirationDate(LocalDate.of(2020, 4, 20));
        food2.setStock(7);
        food2.setFlavour("chicken");
        availableFood.add(food2);

        AnimalFood food3 = new AnimalFood("Dog Chow");
        food1.setPrice(9);
        food1.setWeight(400);
        food1.setExpirationDate(LocalDate.of(2020, 4, 20));
        food1.setStock(3);
        food1.setFlavour("pork");
        availableFood.add(food3);
    }

    private void printAvailableFood(){
        System.out.println("The available food brands for your pet are the following:");

        int index = 0;
        for(AnimalFood food : availableFood){
            if(food != null){
                System.out.println((index + 1) + ". " + food.getName());
                index++;
            }
        }
    }

    private void initActivities(){
        availableActivities[0] = new Activity("running");

        availableActivities[1] = new Activity("petting");

        availableActivities[2] = new Activity("walking");
    }

    private void printAvailableActivities(){
        System.out.println("The available activities for your pet are the following: ");

        for(int index = 0; index < availableActivities.length; index++){
            if(availableActivities[index] != null){
                System.out.println((index + 1) + ". " + availableActivities[index].getName());
            }
        }
    }

    private int getRandomIntegerValueInThisRange(int x, int y){
        return (int) Math.floor((Math.random() * (y - x)) + x);
    }

    public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public Animal getDog() {
        return animal;
    }

    public void setDog(Animal dog) {
        this.animal = dog;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }
}
