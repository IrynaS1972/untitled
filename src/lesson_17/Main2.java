package lesson_17;
//Классу из ‘1' добавьте статическое приватное поле text = "Hello from static".
// Создайте в этом же классе метод,который бы выводил на экран это поле и метод,
// при помощи которого можно изменить значение этого поля.В другом классе, с методом main создайте
// несколько экземпляров класса из 'Task 1'. В одном из них измените значение поля 'text'
// и затем выведите на экран поле 'text' у всех созданных классов. Подумайте почему так.
public class Main2 {
    public static void main(String[] args) {

        Person[]persArray = {new Person(31,"Max"), new Person(15,"Dima"), new Person()};
        System.out.println(countEquals(persArray));
    }
    public int countEquals(Person[] persArray){
     int counter = 0;
     int tmp=1;
     for (int i=0; i<persArray.length;i++){
         for (int j=i+1; j<persArray.length; j++){
             if (persArray[i].equals(persArray[j])){
                 counter++;
             }
         }
     }
     return counter;
    }
}
