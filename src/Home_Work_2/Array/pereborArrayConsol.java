package Home_Work_2.Array;
/*
Перебор массива при помощи do....while, while, for, foreach. Элементы массива вводить используя ранее созданный arrayFromConsole.
Все задачи в одном классе, в отдельных методах. Должно получиться 3 метода (что такое метод https://metanit.com/java/tutorial/2.7.php):
		2.2.1. Вывести все элементы в консоль.
		2.2.2. Вывести каждый второй элемент массива в консоль.
		2.2.3. Вывести все элементы массива в консоль в обратном порядке.
 */


import java.util.Arrays;

import static Home_Work_2.Array.arraysUtils.arrayFromConsole;

public class pereborArrayConsol {

    private static  int[] container  = arrayFromConsole();

    public static void main(String[] args) {

        System.out.println(Arrays.toString(container));//не вижу смысла создавать метод для вывода массива, так как придаем значение ему 1 раз
                                                        // и можно вывести в мэйне, так же для его вывода не нужен цикл
        one();
        two();

        }

        static void one(){      //метод для вывода каждого 2 элемента массива
        int k = 1;
        int r = 1;
            if(container.length<2){
                System.out.println("Мало чисел в массиве");
            }
            else {
                for (int i = 1; i < container.length; i += 2) {
                    System.out.print(container[i] + ";");
                }
                System.out.println("\n**************************");
               // for(int a:container) {  // foreach не подходит для выполнения задачи

            do {
                System.out.print(container[k] + ";");
                k += 2;
            } while (k < container.length);
            k = 1;

                System.out.println("\n**************************");

            while (k < container.length){
                System.out.print(container[k] + ";");
                k += 2;
            }
            }
            System.out.println("\n**************************");
        }

        static void two(){      //вывод в консоль в обратном порядке
            int k = container.length-1;

            for (int i = 0; i < container.length; i++) {
                System.out.print(container[k] + ";");
                k--;
            }
            System.out.print("\nforeach в обратном порядке ");
            int[] containerr = new int[container.length] ;
            int l = -1;
            for (int j = 0; j < containerr.length; j++) {
                l++;
            }
            for (int i = 0; i < containerr.length; i++) {
                containerr[i] = container[l];
                l--;
            }
            for(int aaa:containerr) {       //некоректно использовать для данной задачи
                System.out.print(aaa + ";");
            }
            System.out.println("\n**************************");
            k = container.length - 1;
            do {
                System.out.print(container[k] + ";");
                k--;
            }while (k >= 0);
            System.out.println("\n**************************");
            k = container.length-1;
            System.out.println();
            while (k >= 0){
                System.out.print(container[k] + ";");
                k--;
            }
        }
}
