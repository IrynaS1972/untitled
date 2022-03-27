package lesson13;

import java.sql.Array;

public class String {
    public static void main(String[] args) {

    }
    String str1="text";
    String str2=new String (new char[]{'t','e','x','t'});
    System.out.println(str1);
    System.out.println (str2);
    System.out.println(str1.lenght());
    char[]charArray=str1.toCharArray();
    System.out.println(Array.toString(charArray));
    //immutable - неизменяемое (нельзя изменить строку, не создав новую; когда совершаются операции со строкой
    // создается новая, так как изменить строку нельзя
    String s = " ";
    System.out.println (s.length ()); //0
    System.out.println (s.isEmpty ());//true

    String s1=null;
    if (s1 != null && !s1.isEmpty () {
        System.out.println(s1.lenght ());
    }
    //concatenation
    java.lang.String str3 = "Java";
    java.lang.String str4 = "Нello";
    str3 += str4;
    //вместо использования + можно использовать способ concat
    str3.concat (str4);// так неправильно
    java.lang.String str6 = str3.concat (str4);//так правильно
    System.out.println("str5 = "+ str5);
    System.out.println("str3 = "+ str3);
    System.out.println("str6 = "+ str6);

    String str7 = str1 + '2';
    System.out.println ("Str 7 = " + str7);

    String str8 = String.join (delimiter: ", ", str3, str4)
    String.join(delimiter: ", ", str3, str4);
    System.out.println (str8);
    System.out.println (str9);
 //когда сравниваем через == - сравниваются ссылки  - Для стринга == НЕЛЬЗЯ использовать!!!
    // используется equals либо equalsIgnorCase

    //compareTo

    //index() - метод, который находит индекс первого вхождения в строку
    //startsWith () - начинается ли с такого то символа
    // endsWith () -

    //replase ()  позволяет заменить в строке одну последовательность символов (слов) на другую последовательность

    //trim ()   - обрезать (убирает пробелы первый и последний)

    //substring() - возвращает новую строку, которая является подстрокой данной строки

    //toUpperCase () toLowerCase переводит в нижний (верхний) регистр

    //split() - разбивает массив по буквам (пробелам,символам)

}
