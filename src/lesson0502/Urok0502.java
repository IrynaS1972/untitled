package lesson0502;

import java.util.Scanner;

public class Urok0502 {
    public static void main(String[] args) {
//создать массив из 3 элементов.Вывксти сумму
//        int [] anArray;
//        anArray=new int [3];
//        anArray [0]=100;
//        anArray [1]=200;
//        anArray [2]=300;
//        int sum=0;
//        for (int i=0; i< anArray.length; i++) {
//            sum+=anArray [i];
//                    }
//        System.out.println(sum);

        //при помощи класса сканер и пользователя заполнить массив

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        double[] anArray = new double[size];
        double summa = 0; //добавили с учетом новой задачи
        for (int i = 0; i < size; i++) {
            System.out.println("Введите значение: ");
            anArray[i] = scanner.nextInt();
            summa += anArray[i];  //добавили с учетом новой задачи

        }
        int i = 0;
        while (i < size) {
            System.out.println(anArray[i]);
            i++;
        }
//        System.out.println(summa/size); //добавили с учетом новой задачи
        System.out.println("%.2f"); //сколько символов после запятой выводить
// есть массив чисел. Найти среднее арифметическое число элементов массива




    }
}
