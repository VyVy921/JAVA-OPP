package lab07_2;

import java.security.SecureRandom;

public class Dog extends Animal {
    @Override
    public final int getMaxSpeed() {
        final int random = new SecureRandom().nextInt(50);
        return random;
    }

    @Override
    public String getAnimalName() {
        return "Dog";
    }
}
