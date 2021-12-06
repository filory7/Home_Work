package Home_Work_1;

import java.util.Scanner;

public class ExercizeFiveOne {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);  //запускаем сканер для ввода данных
        System.out.print("Кто здесь? ");   //спрашиваем
        String name = in.nextLine();  //для ввода данных
        in.close();  //закрываем сканер
        String name1 = "Вася";
        String name2 = "Анастасия";

            if (!name1.equalsIgnoreCase(name)) //сравниваем переменные методом equals, так как он сравнивает именно последовательность символов и строк
                if (!name2.equalsIgnoreCase(name)){
                System.out.println("Добрый день "+ name + ", а ты кто?");
                }
                    if (name1.equalsIgnoreCase(name)) {
                        System.out.println("Привет!");
                        System.out.println("Я тебя так долго ждал "+ name + "!");
                    }
                        if (name2.equalsIgnoreCase(name)) {
                            System.out.println("Я тебя так долго ждал " + name + "!");
                        }



    }
}
