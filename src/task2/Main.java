package task2;

public class Main {

    public static void main(String[] args) {
        Apple apple = new Apple(1.0f);       // создадим яблоки
        Orange orange = new Orange(1.5f);    // создадим апельсины

        Box box1 = new Box("коробка 1");   // создадим коробку 1
        box1.addFruits(apple, 10);          // и добавим в нее 10 яблок
        System.out.println(box1);                   // выведем содержимое 1 коробки

        Box box2 = new Box("коробка 2");  // создадим коробку 2
        box2.addFruits(orange, 20);         // и добавим в нее 20 апельсинов

        System.out.println(box2);                   // выведем содержимое 2 коробки

        String compareResult = box1.compare(box2) ? "тяжелее" : "легче";
        // сравним коробки и выведем результат
        System.out.println("Коробка " + box1.getBoxName() + " " + compareResult + " чем " + box2.getBoxName());

        Box box3 = new Box("коробка 3");  // создадим коробкку 3
        box3.addFruits(apple, 15);          // и добавим в нее 15 яблок
        System.out.println(box3);                   // выведем содержимое 3 коробки

        System.out.println("Перегрузим 1 в 3");
        box1.replaceFruits(box3);                   // перегрузим яблоки из 1 в 3 коробку

        System.out.println(box1);                   // выведем содержимое 1 коробки
        System.out.println(box3);                   // выведем содержимое 3 коробки
    }
}
