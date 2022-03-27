package houmwork_11new;

import java.util.Scanner;

import static java.lang.reflect.Array.getLength;

public class Array {
    public static void main(String[] args) {
        //В массиве [20] определить индексы элементов, значение которых не меньше заданного минимума и не больше
        // заданного максимума.
        Scanner scanner = new Scanner(System.in);
        int length = getLength(scanner);
        int[] arrays = new int[length];
        System.out.println("Enter length: ");// вводим длину 20
        int numberMin = scanner.nextInt();
        System.out.println("Enter numberMin: ");//указываем минимальное число
        int numberMax = scanner.nextInt();
        System.out.println("Enter numberMax: ");//указываем максимальное число
        int max = arrays[0];
        int min = arrays[0];

        for (int i : arrays) {
            if (arrays[i] > numberMin & arrays[i] < numberMax) {
                i++;
            }
            System.out.println(arrays[i]);

        }
    }


}
}
