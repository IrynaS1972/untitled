package houmwork0602;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //есть матрица. Найти в ней введенное пользователем число и вывести номер столбца и строки
        int[][] array = {{1, 2,5}, {3, 4,6}};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        for (int i = 0; i < array.length; i++) {
            int j;
//а где проверка введённого пользователем числа? Тут я вижу только заполнение массива, хотя он уже и так заполнен выше
            for (j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();

            }
            System.out.println(array[i][j] + "\t");



        }
    }
}

