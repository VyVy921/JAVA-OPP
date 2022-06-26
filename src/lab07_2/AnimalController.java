package lab07_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalController {
    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal tiger = new Tiger();
        Animal horse = new Horse();

        new AnimalController().findMaxSpeed(Arrays.asList(dog, tiger, horse));

    }

    public void findMaxSpeed(List<Animal> animalList) {

        int maxSpeed = animalList.get(0).getMaxSpeed();
        String name = animalList.get(0).getAnimalName();

        for (int index = 0; index < animalList.size(); index++) {
            if (animalList.get(index).getMaxSpeed() >= maxSpeed) {
                maxSpeed = animalList.get(index).getMaxSpeed();
                name = animalList.get(index).getAnimalName();
            }
        }
        System.out.println("Max speed: " + maxSpeed + " is " + name);

    }
}
