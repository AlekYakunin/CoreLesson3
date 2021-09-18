package task1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Integer array
        Integer[] array1 = {1, 2, 3, 4, 5};

        System.out.println("Integer array. Меняем 2 и 3 элементы");
        System.out.println(Arrays.toString(array1));

        ReplaceArrayElements(array1,1, 2);
        System.out.println(Arrays.toString(array1));

        //Cat array
        Cat[] array2 = new Cat[3];
        array2[0] = new Cat("Барсик", "черный", 1);
        array2[1] = new Cat("Мурка", "белая", 2);
        array2[2] = new Cat("Черныш", "рыжий", 3);

        System.out.println("Cat array. Меняем 1 и 2 элементы");
        System.out.println(Arrays.toString(array2));

        ReplaceArrayElements(array2,0, 1);
        System.out.println(Arrays.toString(array2));
    }

    public static <T> void ReplaceArrayElements(T[] inputArray, int firstElement, int secondElement) {
        T element = inputArray[firstElement];
        inputArray[firstElement] = inputArray[secondElement];
        inputArray[secondElement] = element;
    }
}
