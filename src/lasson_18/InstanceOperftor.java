package lasson_18;

public class InstanceOperftor { //наседуются сам класс и родители
    public static void main(String[] args) {
        String name = "James";
        boolean result = name instanceof String;// following will return true since name is type of String
        System.out.println(result);
        Vehicle vehicle = new Car();
        System.out.println(vehicle instanceof Car);
    }
}
public abstract class Person {//абстрактный класс (имеет слово abstract) (обычный класс, однако нельзя создать объект,
    // а создается только для наследования) Если в классе есть хоть один абстрактный метод, то он абстрактный
    private String name;

    public String getName() {
        return name;
    }

    public Person(String name) {//имеет конструктор, но вызввать его не может, через него вызывают конструктор другие классы
        this.name = name;
    }

    public abstract void display();
}
//интерфейс
//интерфейс реализуем, от классов наследуем