package lesson_17;

import java.util.Objects;

//Создайте класс, у которого будут поля имя и возраст (на англ), обязательно сделайте их приватными.
public class Person {
    private int age;
    private String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;

    }

    Person() {
        //Добавьте методы, при помощи которых можно получить имя и возраст.
        // Создайте метод show(), чтобы он выводил на экран имя и возраст в читаемом формате
        age = 15;
        name = "Max";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println("Age: " + age + name);
    }

    @Overrideр
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
    public void changeTxt(String newText){
    text=newText;
    }
    public void printText (){
        System.out.println(text);
    }
}
