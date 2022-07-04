package lab10;

import java.security.SecureRandom;

public class Horse extends Animal {
    @Override
    public  int getMaxSpeed() {
        final int random = new SecureRandom().nextInt(100);
        return random;
    }

    @Override
    public String getAnimalName() {
        return "Horse";
    }
}
