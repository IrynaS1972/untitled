package houmwork1302;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        //Заполнить массив с консоли (предусмотреть исключительные ситуации) Если пользователь во время заполнения
        // массива вводит отрицательно число, то инициализацию массива прекратить, вывести сообщение и закончить
        // программу. Вывести полученный массив с помощью foreach

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int counter = 0;
        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % number == 0) {
                counter++;
                System.out.print(array[i] + " ");
            }
        }

        System.out.println();
        System.out.println("Counter " + counter);
    }
}





