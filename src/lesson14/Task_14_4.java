package lesson14;

import java.util.Scanner;

//есть массив строк, вывести на экран все строки, длина которых больше N символов
public class Task_14_4 {
    public static void main(String[] args) {
        String text = "Olya has a pencil,\n" +
                "\n" +
                "Olya has a pen,\n" +
                "\n" +
                "She draws with a pencil,\n" +
                "\n" +
                "She writes with a pen.";
        String[] massLines = devisionString(text);
        Scanner scanner = new Scanner(System.in);
        int length = initLength(scanner);
        inputLines(massLines, length);
    }

    private static void inputLines(String[] massLines, int lenght) {
        for (String line : massLines) {
            if (line.length() > lenght) {
                System.out.println(line);
            }
        }
    }

    static String[] devisionString(String massLines) {
        String[] words = massLines.split("\n");
        for (String word : words) {
        }
        return words;
    }

    public static int initLength(Scanner scan) {
        System.out.print("Enter length: ");
        return scan.nextInt();
    }

    static void inputLines();

}
