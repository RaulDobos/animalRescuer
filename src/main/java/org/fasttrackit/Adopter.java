package org.fasttrackit;

public class Adopter {

    String name;
    int money;

    public Adopter(String passedNameParameter, int passedMoneyParameter){
        name = passedNameParameter;
        money = passedMoneyParameter;

        System.out.println("(constructor called)");
    }

    public void feed(Animal animal, AnimalFood food){

        if(animal.hungerLevel > 0){
            animal.hungerLevel = 0;
        }

        System.out.println(this.name + " just gave some " + food.name + " to " + animal.name + ".");
        System.out.println("Hunger level: " + animal.hungerLevel + "\n");

    }

    public void doActivity(Animal animal, Activity activity){

        if(animal.hapinessLevel + activity.grantedHapiness > 10){
            animal.hapinessLevel = 10;
        }
        else{
            animal.hapinessLevel += activity.grantedHapiness;
        }

        System.out.println(this.name + " and " + animal.name + " did " + "\"" + activity.name + "\"" + " activity together.");
        System.out.println("Hapiness level: " + animal.hapinessLevel);
    }

}
