package Home_Work_1;

import java.util.Scanner;

public class ExercizeFiveTwo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Кто здесь: ");
        String name = in.nextLine();
        in.close();

        String name1 = "Вася";
        String name2 = "Анастасия";

        if (name1.equalsIgnoreCase(name)) {     //указываем первое условие и проверяем его
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал "+ name + "!");
        }
            else if (name2.equalsIgnoreCase(name)){  //если не сработало первое условие проверяем второе условие
                System.out.println("Я тебя так долго ждал " + name + "!");
            }
                else  //если первые два услоивя не сработали выполяем else
                    System.out.println("Привет "+ name + ", а ты кто?");
    }
}