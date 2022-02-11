package lesson0602;

import java.awt.*;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //вывести в консоль массив {{5,7,3,17},{7,0,0,12},{8,1,2,3}};

        int[][] massiv = {{5, 7, 3, 17}, {7, 0, 0, 12}, {8, 1, 2, 3}};
        //printing (after next slide)
        for (int i = 0; i < massiv.length; i++) {  //бегаем по строкам (узнаем кол-во массивов)
            for (int j = 0; j < massiv[i].length; j++) { // бегает по столбцам (забирает длину конкретного массива)
                System.out.print(massiv[i][j] + "\t");
            }
            System.out.println();

//пользователь вводит размерность двумерного массива (квадратный, т.е. число строк=числу столбцов) и заполняет (через сканер)
//            int[][] massiv = {{5, 7, 17}, {7, 0, 12}, {8, 1, 3}};
//            Scanner scanner=new Scanner(System.in);
//            System.out.println("Enter length array:");
//            int size = scanner.nextInt();
//            System.out.println("Enter array:");
//            int[][] array = new int [size][size];
//            for (int i = 0; i < array.length; i++){
//                for (int j = 0; j < array[i].length; j++){
//                    array[i][j]=scanner.nextInt();
//                }
            }
            //пользователь




        }
    }
