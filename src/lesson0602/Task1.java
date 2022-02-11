package lesson0602;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//создать массив строк с помощью сканера; заполнить массив с помощью сканера; вывести значение массива

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        String[]strArray=new String[size];
        for (int i=0; i< strArray.length; i++){
       //     заполнить массив с помощью сканера;
       strArray[i] = scanner.nextLine();
        }
       //вывести значение массива

        for (int i = 0; i<size; i++) {
            System.out.println(strArray[i]);
        }

        //как создать двумерный массив
        //creation
        int[][] twoDimIntArray;
        byte[][] twoDimByteArray;
        String[][] twoDimStrArray;
        //initialization
        twoDimIntArray = new int[2][3];
        int [][] directInit = {{1, 2,3},{1, 2,17}};
        //printing (after next slide)
        for (int i = 0; i < directInit.length; i++){  //бегаем по строкам (узнаем кол-во массивов)
            for (int j = 0; j < directInit[i].length; j++){ // бегает по столбцам (забирает длину конкретного массива)
                System.out.println(directInit[i][j] + "\t");
            }
            System.out.println();
        }

        //двумерные массивы, длина
        int [][] twoDimArray = {{5,7,3,17},{7,0,0,12},{8,1,2,3}}; //длина большого массива - 3
        //twoDimArray[0].length;      //обращение к первому массиву
        System.out.println(twoDimArray.length);
    }
}
