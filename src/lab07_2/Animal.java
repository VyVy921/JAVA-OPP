package lab07_2;


public class Animal {

    private  int maxSpeed;
    private String animalName;

    public Animal() {
    }

    public Animal(final int maxSpeed, String animalName) {
        this.maxSpeed = maxSpeed;
        this.animalName = animalName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getAnimalName() {
        return animalName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "maxSpeed=" + maxSpeed +
                ", animalName='" + animalName + '\'' +
                '}';
    }
}
