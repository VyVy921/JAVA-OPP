package lab10;

import java.security.SecureRandom;

public class Dog extends Animal {

    @Override
    public int getMaxSpeed() {
        final int random = new SecureRandom().nextInt(100);
        return random;
    }

    @Override
    public String getAnimalName() {
        return "Dog";
    }
}