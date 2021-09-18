package task2;

import java.util.ArrayList;

public class Box {

    private String boxName;
    private ArrayList<Fruit> fruits;

    public Box(String boxName) {
        this.boxName = boxName;
        this.fruits = new ArrayList<>();
    }

    public String getBoxName() {
        return boxName;
    }

    public void addFruits(Fruit fruit, int amount) {
        for (int i = 0; i < amount; i++) {
            fruits.add(fruit);
        }
    }

    public void removeFruit(int amount) {
        if (!fruits.isEmpty() && amount >= 0) {
            fruits.remove(amount - 1);
        }
    }

    public void removeFruits() {
        fruits.clear();
    }

    public double getWeight() {
        if (fruits.isEmpty()) {
            return 0.0;
        } else {
            Fruit fruit = fruits.get(0);
            return fruits.size() * fruit.getWeight();
        }
    }

    public boolean compare(Box box) {
        return getWeight() - box.getWeight() > 0.0001;
    }

    public void replaceFruits(Box box) {
        boolean canReplace = false; // можно ли перегрузить

        if (fruits.isEmpty()) {    // пустая 1 коробка, нечего грузить
            System.out.println("Нечего грузить!");
            return;
        }
        Fruit fruit1 = fruits.get(0);

        if (!box.fruits.isEmpty()) {    // непустая 2 коробка
            Fruit fruit2 = box.fruits.get(0);
            if (fruit1 instanceof Apple && fruit2 instanceof Apple || // и продукты в коробках одинаковые
                fruit1 instanceof Orange && fruit2 instanceof Orange) {
                canReplace = true;
            } else {
                System.out.println("Разные фрукты!");
            }
        } else {    // в пустую 2 можно грузить любой фрукт
            canReplace = true;
        }

        if (canReplace) {
            box.addFruits(fruit1, fruits.size()); // добавим во 2 коробку кол-во фруктов из 1
            fruits.clear(); // очистим 1 коробку
        }
    }

    @Override
    public String toString() {
        String ret = "";
        if (fruits.isEmpty()) {
            ret = "пустая";
        } else {
            Fruit fruit = fruits.get(0);
            ret = fruit.getName() + " " + getWeight() + " кг";
        }
        return boxName + ": " + ret;
    }
}
