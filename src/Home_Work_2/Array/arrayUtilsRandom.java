package Home_Work_2.Array;

import java.util.Random;

/*
2.1.2. Написать метод public static int[] arrayRandom(int size, int maxValueExclusion) рядом с main.
Данный метод принимает два аргумента. Первый (size) указывает размер массива который мы хотим получить.
Второй (maxValueExclusion) указывает до какого числа генерировать рандомные числа.
	    2.1.2.1. Пример: int[] container = arrayRandom(5, 100). Результат: В методе arrayRandom будет создан массив
	    размером 5 с числами от 0 до 99 (использовать класс Random) и сохранён в переменную container.
 */
public class arrayUtilsRandom {
    public static void main(String[] args) {

    }
        public static int[] arrayRandom(int size, int maxValueExclusion){

        int[] container = new int[size];
        Random random = new Random();

        for (int j = 0; j < container.length; j++) {
            int k = random.nextInt(maxValueExclusion + 1);
            container[j] = k;
        }
        return container;
        }
}
