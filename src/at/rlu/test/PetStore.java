package at.rlu.test;

import java.util.ArrayList;
import java.util.List;

public class PetStore {

    private List<Animal> animals;


    public PetStore() {
        this.animals = new ArrayList<>();
    }


    public void addAnimal(Animal animal) {
        animals.add(animal);
    }


    public void printAllNamesOfAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }

    public static void main(){

        PetStore petStore = new PetStore();

        petStore.addAnimal(new Cat("Cat"));
        petStore.addAnimal(new Dog("Dog"));
    }

}
