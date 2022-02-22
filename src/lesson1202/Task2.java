package lesson1202;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //заполнить двумерный массив с помощью сканера
        //вывести на консоль
        //найти все четные и нечетные
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[][] = new int[size][size];
        int evenNum = 0;
        int oddNum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
                if (array[i][j] % 2 == 0) {
                    evenNum++;
                } else {
                    oddNum++;
                }
            }
        }
        int[] evenArray = new int[evenNum];
        int[] oddArray = new int[oddNum];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
                if (array[i][j] % 2 == 0) {


                    System.out.println(Arrays.deepToString(array));
                }
            }
        }
    }}
