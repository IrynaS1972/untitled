package lesson14;

import java.util.Arrays;
import java.util.Scanner;

//посчитать количество слов в тексте
public class Task_14_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = initString(scanner).split(" \\w");
        System.out.println(Arrays.toString(str));
        int counterWord = str.length;
        System.out.println(counterWord);
    }

    static String initString(Scanner scanner) {
        return scanner.nextLine();
    }

}