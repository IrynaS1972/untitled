package lesson14;

import java.util.Scanner;

//1)	Реализовать следующую программу:
//	Пользователю заполняет массив слов
//•	Отсортировать массив слов по алфавиту (лексикографически)
//•	Пользователю предоставляется возможность ввести букву. Вместо этой буквы теперь будет рандомное число
// (String.valueOf(randomNumber))
public class Ekzamen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int array[] = new int[size];
        initAarrayOfWords


    public static Object scan1;
        String (Scanner scan1) {
            System.out.println("Enter array length: ");
            return scan.nextWorld();
        }

    public static World (Scaner scan1) {
        System.out.println("Insert array world:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print ("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            System.out.print (" " + array[i]);
        }
        System.out.println();





        public static String initStrings (Scanner scan1){
            System.out.println("Enter array length: ");
            return scan1 nextLine
        }
        public static void initVowelArray(char[] arrayOfLetter, char[] upperCaseVowel) {
            int j = 0;
            char space = ' ';
            for (int i = 0; i < upperCaseVowel.length; i++) {
                arrayOfLetter[j] = upperCaseVowel[i];
                j++;
                arrayOfLetter[j] = (char) (upperCaseVowel[i] + 32);
                j++;
            }
        }

        public static int amountOfVowel(String sourceString, char[] arrayOfVowelLetters) {
            int amountOfVowel = 0;
            System.out.print("Vowels letters: ");
            for (int i = 0; i < sourceString.length(); i++) {
                if (isVowel(sourceString.charAt(i), arrayOfVowelLetters)) {
                    amountOfVowel++;
                    System.out.print(sourceString.charAt(i) + " ");
                }
            }
            System.out.println();
            return amountOfVowel;
        }

        public static boolean isVowel(char symbol, char[] arrayOfLetters) {
            for (int i = 0; i < arrayOfLetters.length; i++) {
                if (arrayOfLetters[i] == symbol) {
                    return true;
                }
            }
            return false;
        }



    }
}
