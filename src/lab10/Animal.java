package lab10;


public abstract class Animal {

    private int maxSpeed;
    private String animalName;

    public Animal() {
    }

    public Animal(final int maxSpeed, String animalName) {
        this.maxSpeed = maxSpeed;
        this.animalName = animalName;
    }

    public abstract int getMaxSpeed();

    public String getAnimalName() {
        return animalName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalName='" + animalName + '\'' +
                '}';
    }
}
