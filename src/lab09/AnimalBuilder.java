package lab09;

import java.security.SecureRandom;

public class AnimalBuilder {

    private String name;
    private int speed;
    private boolean flyable;

    protected AnimalBuilder(Builder builder) {
        this.name = builder.name;
        this.speed = builder.speed;
        this.flyable = builder.flyable;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyable() {
        return flyable;
    }

    //inner class
    public static class Builder {
        private String name;
        private int speed;
        private boolean flyable;

        //Write only
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSpeed(int speed) {
            final int speedRandom = new SecureRandom().nextInt(speed);
            this.speed = speedRandom;
            return this;

        }

        public Builder setFlyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        public AnimalBuilder build() {
            return new AnimalBuilder(this);
        }
    }

    @Override
    public String toString() {
        return "AnimalBuilder{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", flyable=" + flyable +
                '}';
    }
}
