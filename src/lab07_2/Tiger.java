package lab07_2;

import java.security.SecureRandom;

public class Tiger extends Animal {

    @Override
    public final int getMaxSpeed() {
        int random = new SecureRandom().nextInt(70);
        return random;
    }

    @Override
    public String getAnimalName() {
        return "Tiger";
    }
}
