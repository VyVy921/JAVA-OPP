package lab07_2;

import java.security.SecureRandom;

public class Horse extends Animal {
    @Override
    public final int getMaxSpeed() {
        final int random = new SecureRandom().nextInt(100);
        return random;
    }

    @Override
    public String getAnimalName() {
        return "Horse";
    }
}
