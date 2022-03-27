package lesson14;

public class Stringbuffer {
    public static void main(String[] args) {
        //creation
        String str = "Java";
        String str2 = "C++";
        StringBuffer strBuffer = new StringBuffer(str);

        strBuffer.replace(start: 0, str.length(), str2);
        System.out.println(strBuffer);

        //stringbuilder - работает быстрее, потому что он не потокобезопасный
        //Benchmark(test) - позволяют определить скорость работы программы

    }
}
