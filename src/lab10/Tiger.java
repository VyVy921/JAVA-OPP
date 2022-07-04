package lab10;

import java.security.SecureRandom;

public class Tiger extends Animal {

    @Override
    public int getMaxSpeed() {
        final int random = new SecureRandom().nextInt(70);
        return random;
    }

    @Override
    public String getAnimalName() {
        return "Tiger";
    }
}
