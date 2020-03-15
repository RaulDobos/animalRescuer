package org.fasttrackit;
import java.text.*;

public class Adopter {

    String name;
    int money;

    public Adopter(String passedNameParameter, int passedMoneyParameter){
        name = passedNameParameter;
        money = passedMoneyParameter;

        System.out.println("(constructor called)");
    }

    public void feed(Animal animal, AnimalFood food){

        boolean ok = false;

        if(animal.hungerLevel > 0){
            animal.hungerLevel = 0;
        }

        if(animal.favouriteFood.equals(food.name)){
            if(animal.hapinessLevel < 10){          // 10 should be the max hapiness level
                animal.hapinessLevel++;
                ok = true;
            }
        }

        System.out.println(this.name + " just gave some " + food.name + " to " + animal.name + ".");
        System.out.println("Hunger level: " + animal.hungerLevel);

        if(ok){
            System.out.println("Happiness level: " + animal.hapinessLevel + "\n");
        }

    }

    public void doActivity(Animal animal, Activity activity){

        if(animal.favouriteActivity.equals(activity.name)){
            if(animal.hapinessLevel < 9){                   //10 should be the max happiness level
                animal.hapinessLevel += 2;
            }
            else{
                animal.hapinessLevel = 10;
            }
        }
        else{
            if(animal.hapinessLevel < 10){
                animal.hapinessLevel++;
            }
        }

        System.out.println(this.name + " and " + animal.name + " did " + "\"" + activity.name + "\"" + " activity together.");
        System.out.println("Happiness level: " + animal.hapinessLevel);
    }

}
