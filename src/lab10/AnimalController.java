package lab10;

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
        Animal initWinner = animalList.get(0);

        for (int index = 0; index < animalList.size(); index++) {
            if (animalList.get(index).getMaxSpeed() >= animalList.get(0).getMaxSpeed()) {
                initWinner = animalList.get(index);
            } else continue;
        }
        System.out.printf("Winner is '%s' with speed: %d ", initWinner.getAnimalName(), initWinner.getMaxSpeed());

    }
}