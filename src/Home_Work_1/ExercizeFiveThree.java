package Home_Work_1;

import java.util.Scanner;

public class ExercizeFiveThree {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);  //запускаем сканер для ввода данных
        System.out.print("Кто здесь? ");   //спрашиваем
        String name = in.nextLine();  //для ввода данных
        in.close();  //закрываем сканер

        switch (name) {  //открываем switch и указываем переменную которую будем сравнивать
            case "Вася":  //указываем в кейсе первое условие строки(то что вводим в консоль)
                System.out.println("Привет " + name + "!");
                System.out.println("Я тебя так долго ждал.");
                break;  //закрываем кейс что бы закрыть, если условие выполниться свитч закончиться
            case "Анастасия":
                System.out.println("Я тебя так долго ждал " + name + "!");
                break;
            default: //если не одно из условий не выолниось выполняеться default
                System.out.println("Добрый день "+ name + ", а ты кто?");


        }

    }
}
