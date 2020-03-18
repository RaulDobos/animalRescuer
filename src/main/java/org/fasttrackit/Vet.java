package org.fasttrackit;

public class Vet {

    private String name;
    private String specialization;

    //additional properties
    boolean[] availability; // from 1 to 7, the Game should update this array every week

    public Vet(String passedNameParameter){
        name = passedNameParameter;

        System.out.println("(constructor called)");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public boolean[] getAvailability() {
        return availability;
    }

    public void setAvailability(boolean[] availability) {
        this.availability = availability;
    }
}
