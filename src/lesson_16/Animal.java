package lesson_16;
//понятно, что животноу обладает достаточным количеством качеств/возможностей, но,
//например, в нашей задаче достаточно такого поля, как вес и такого, как
//ЭТО И ЕСТЬ ПРИМЕНЕНИЕ АБСТРАКЦИИ - мы абстрагировались и вычеркнули  другие параметры (пол, порода и др.)
public class Animal {
    int weight;

    public void voice(){System.out.println("some voice");}
}
