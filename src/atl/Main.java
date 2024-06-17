package atl;

import atl.Human;
import atl.Pet;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet("dog", "Rock", 5, 75, new String[]{"eat", "drink", "sleep"});
        Pet cat = new Pet("cat", "Mittens", 3, 60, new String[]{"sleep", "play", "hunt"});

        Human mother = new Human("Jane", "Edward", 1950);
        Human father = new Human("Vito", "Edward", 1945);

        Human child1 = new Human("Michael", "Edward", 1977, 90, mother, father, new String[][]{
                {"Monday", "go to school"},
                {"Tuesday", "play football"}
        }, dog);

        Human child2 = new Human("Sara", "Edward", 1980, 85, mother, father, new String[][]{
                {"Monday", "go to gym"},
                {"Wednesday", "read books"}
        }, cat);

        System.out.println(child1.toString());
        System.out.println(child2.toString());

        child1.greetPet();
        child1.describePet();
        dog.eat();
        dog.respond();
        dog.foul();

        child2.greetPet();
        child2.describePet();
        cat.eat();
        cat.respond();
        cat.foul();
    }
}
