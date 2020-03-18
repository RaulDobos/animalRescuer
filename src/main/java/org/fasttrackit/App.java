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

        dog.setAge(2);
        dog.setHealthLevel(8);     //from 1 to 10
        dog.setHungerLevel(3);     //from 1 to 10
        dog.setHapinessLevel(5);   //from 1 to 10
        dog.setFavouriteActivity("playing with a ball");
        dog.setFavouriteFood("Pedigree");

        System.out.println("Dog properties are the following: ");
        System.out.println("Name: " + dog.getName());
        System.out.println("Age: " + dog.getAge());
        System.out.println("Health: " + dog.getHealthLevel());
        System.out.println("Hunger: " + dog.getHungerLevel());
        System.out.println("Hapiness: " + dog.getHapinessLevel());
        System.out.println("Favourite activity: " + dog.getFavouriteActivity());
        System.out.println("Favourite food: " + dog.getFavouriteFood());

        System.out.println();

        String adopterName = "Iulia";
        int money = 100;

        Adopter adopter = new Adopter(adopterName, money);

        System.out.println("Adopter properties are the following: ");
        System.out.println("Name: " + adopter.getName());
        System.out.println("Money: " + adopter.getMoney());

        System.out.println();

        String foodName = "Pedigree";
        int price = 10;

        DogFood food = new DogFood(foodName, price);

        food.setWeight(1000);     // 1 kg
        food.setFlavour("beef");
        food.setExpirationDate(LocalDate.of(2020, 3, 20));
        food.setStock(3);

        System.out.println();

        System.out.println(food.getName() + " food properties are the following: ");
        System.out.println("Name: " + food.getName());
        System.out.println("Price: " + food.getPrice());
        System.out.println("Weight: " + food.getWeight() + " g");
        System.out.println("Flavour: " + food.getFlavour());
        System.out.println("Expiration Date: " + food.getExpirationDate());
        System.out.println("Stock: " + food.getStock());

        foodName = "Chappie";
        price = 12;

        DogFood food2 = new DogFood(foodName, price);
        food2.setWeight(1000);
        food2.setFlavour("chicken");
        food2.setExpirationDate(LocalDate.of(2020, 3, 22));
        food2.setStock(5);

        System.out.println();
        System.out.println(food2.getName() + " food properties are the following: ");
        System.out.println("Name: " + food2.getName());
        System.out.println("Price: " + food2.getPrice());
        System.out.println("Weight: " + food2.getWeight() + " g");
        System.out.println("Flavour: " + food2.getFlavour());
        System.out.println("Expiration Date: " + food2.getExpirationDate());
        System.out.println("Stock: " + food2.getStock());


        System.out.println();

        Activity playing = new Activity();
        playing.setName("playing with a ball");

        Activity petting = new Activity();
        petting.setName("petting");

        Activity walking = new Activity();
        walking.setName("walking in the park");

        System.out.println("Available activities: " + playing.getName() + ", " + petting.getName() + ", " + walking.getName());

        System.out.println();

        String vetName = "Alex Popa";

        Vet vet = new Vet(vetName);
        vet.setSpecialization("Dermatology");

        System.out.println();
        System.out.println("Available Vets: ");
        System.out.println(vet.getName() + ", " + vet.getSpecialization());

        System.out.println();

        String weather = "rainy";
        int temperature = 20;

        Environment environment = new Environment(weather, temperature);

        System.out.println();
        System.out.println("Environment properties are the following: " + temperature + "°C, " + weather);
        System.out.println();

        Game game = new Game();
        game.setDog(dog);
        game.setAdopter(adopter);
        game.setVet(vet);

        adopter.feed(dog, food);

        adopter.doActivity(dog, playing);

    }
}
