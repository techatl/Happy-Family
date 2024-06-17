package atl;

import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Human mother;
    private Human father;
    private Pet pet;
    private String[][] schedule;

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human father, Human mother) {
        this.name = name;
        this.surname = surname;
        this.father = father;
        this.mother = mother;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq,
                 Human mother,
                 Human father,
                 String[][] schedule,
                 Pet pet) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
        this.pet = pet;
    }


    public void greetPet() {
        System.out.println("Hello," + pet.getNickname());
    }

    public void describePet() {
        System.out.println(new StringBuilder().append("I have a ")
                .append(pet.getSpecies()).append(" he is " )
                .append(pet.getAge()).append(" years old, he is " )
                .append(sly()).toString());
    }

    public Object sly() {
        int num = pet.getTrickLevel();
        if (num > 50) {
            System.out.println(" very sly ");
        }
        else {
            System.out.println(" almost not sly ");
        }
        return null;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", mother=" + mother +
                ", father=" + father +
                ",pet=" + pet +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }
}
