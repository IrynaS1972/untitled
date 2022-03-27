package houmwork_17;

// Создайте зоопарк. У вас есть животные, которые там находятся.
// У каждого животного есть имя. Также есть метод, который возвращает звук этого животного.

public class Zoo {
    public static void main(String[] args) {

        private int count;
        private Animal[] animalsArray = new Animal[10];//до 10 животных

public Zoo() {
            this.count = 0;
            this.animalsArray = new Animal[10];//до 10 животных
        }
        public void addAnimal (Animal animal){
            animalsArray[count] = animal;
            count++;
        }
        public void sound ("Кол-во ж-х" + count);
        for (Animal animal : animalsArray) {
            animal.sound();
        }
    }

}
