package org.fasttrackit;

import java.time.LocalDate;
import java.util.*;
import java.text.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println();

        System.out.println("Give a name to your dog:");

        Scanner scanner1 = new Scanner(System.in);
        String dogName = scanner1.nextLine();

        System.out.println("You entered the name " + dogName);

        Dog dog = new Dog(dogName);

        dog.age = 2;
        dog.healthLevel = 8;     //from 1 to 10
        dog.hungerLevel = 3;     //from 1 to 10
        dog.hapinessLevel = 5;   //from 1 to 10
        dog.favouriteActivity = "playing with a ball";
        dog.favouriteFood = "Pedigree";

        System.out.println("Dog properties are the following: ");
        System.out.println("Name: " + dog.name);
        System.out.println("Age: " + dog.age);
        System.out.println("Health: " + dog.healthLevel);
        System.out.println("Hunger: " + dog.hungerLevel);
        System.out.println("Hapiness: " + dog.hapinessLevel);
        System.out.println("Favourite activity: " + dog.favouriteActivity);
        System.out.println("Favourite food: " + dog.favouriteFood);

        System.out.println();

        String adopterName = "Iulia";
        int money = 100;

        Adopter adopter = new Adopter(adopterName, money);

        System.out.println("Adopter properties are the following: ");
        System.out.println("Name: " + adopter.name);
        System.out.println("Money: " + adopter.money);

        System.out.println();

        String foodName = "Pedigree";
        int price = 10;

        DogFood food = new DogFood(foodName, price);

        food.weight = 1000;     // 1 kg
        food.flavour = "beef";
        food.expirationDate = LocalDate.of(2020, 3, 20);
        food.stock = 3;

        System.out.println();
        System.out.println(food.name + " food properties are the following: ");
        System.out.println("Name: " + food.name);
        System.out.println("Price: " + food.price);
        System.out.println("Weight: " + food.weight + " g");
        System.out.println("Flavour: " + food.flavour);
        System.out.println("Expiration Date: " + food.expirationDate);
        System.out.println("Stock: " + food.stock);

        foodName = "Chappie";
        price = 12;

        DogFood food2 = new DogFood(foodName, price);
        food2.weight = 1000;
        food2.flavour = "chicken";
        food2.expirationDate = LocalDate.of(2020, 3, 22);
        food2.stock = 5;

        System.out.println();
        System.out.println(food2.name + " food properties are the following: ");
        System.out.println("Name: " + food2.name);
        System.out.println("Price: " + food2.price);
        System.out.println("Weight: " + food2.weight + " g");
        System.out.println("Flavour: " + food2.flavour);
        System.out.println("Expiration Date: " + food2.expirationDate);
        System.out.println("Stock: " + food2.stock);


        System.out.println();

        Activity playing = new Activity();
        playing.name = "playing with a ball";

        Activity petting = new Activity();
        petting.name = "petting";

        Activity walking = new Activity();
        walking.name = "walking in the park";

        System.out.println("Available activities: " + playing.name + ", " + petting.name + ", " + walking.name);

        System.out.println();

        String vetName = "Alex Popa";

        Vet vet = new Vet(vetName);
        vet.specialization = "Dermatology";

        System.out.println();
        System.out.println("Available Vets: ");
        System.out.println(vet.name + ", " + vet.specialization);

        System.out.println();

        String weather = "rainy";
        int temperature = 20;

        Environment environment = new Environment(weather, temperature);

        System.out.println();
        System.out.println("Environment properties are the following: " + temperature + "°C, " + weather);
        System.out.println();

        Game game = new Game();
        game.dog = dog;
        game.adopter = adopter;
        game.vet = vet;

        adopter.feed(dog, food);

        adopter.doActivity(dog, playing);

    }
}
