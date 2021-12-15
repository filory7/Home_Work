package Home_Work_2.Array;
/*
2.1.1. Написать метод public static int[] arrayFromConsole() рядом с main. Данный метод размер массива и
каждый его элемент запрашивает у пользователя через консоль.
			2.1.1.1. Пример int[] container = arrayFromConsole(). Результат: В методе arrayFromConsole будет
			запрошена информация у пользователя, пользователь вводит размер (3) и его элементы по порядку {4, 17, 32}.
			Соответсвенно будет создан массив размером 3 с элементами {4, 17, 32} и сохранён в переменную container.

 */
import java.util.Scanner;

public class arraysUtils {
   // public static void main(String[] args) {

        //System.out.println(java.util.Arrays.toString(arrayFromConsole()));

  //  }

    public static int[] arrayFromConsole () {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int[] container = new int[in.nextInt()];

        for (int i = 0; i < container.length; i++) {
            System.out.println("Введите число");
            container[i] = in.nextInt();
        }
        return container;

    }
}
