package lab09;

import lab07_2.Animal;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

//import static lab09.AnimalBuilder.Builder;

public class TestAnimal {

    public static void main(String[] args) {

        AnimalBuilder.Builder builder = new AnimalBuilder.Builder();
        //method chaining
        AnimalBuilder tiger = builder.setName("Tiger").setSpeed(100).setFlyable(false).build();
        AnimalBuilder horse = builder.setName("Horse").setSpeed(75).setFlyable(false).build();
        AnimalBuilder eagle = builder.setName("Eagle").setSpeed(75).setFlyable(true).build();

//        System.out.println(tiger);
//        System.out.println(horse);
//        System.out.println(eagle);

        new TestAnimal().findMaxSpeed(Arrays.asList(tiger, horse, eagle));
    }

    public void findMaxSpeed(List<AnimalBuilder> animalList) {

        int maxSpeed = animalList.get(0).getSpeed();
        String name = animalList.get(0).getName();

        for (int index = 0; index < animalList.size(); index++) {
            if (animalList.get(index).isFlyable()) {
                System.out.println(animalList.get(index).getName() + " can not attend ");
            } else {
                if (animalList.get(index).getSpeed() >= maxSpeed) {
                    maxSpeed = animalList.get(index).getSpeed();
                    name = animalList.get(index).getName();
                }else continue;
            }
        }
            System.out.println("Max speed: " + maxSpeed + " is " + name);

        // view speed
        for (AnimalBuilder animal : animalList) {
            System.out.println("All speed: " + animal.getSpeed());
        }
    }
}
