package task2;

public abstract class Fruit {
    private float weight;
    private String name = "яблоки";

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
