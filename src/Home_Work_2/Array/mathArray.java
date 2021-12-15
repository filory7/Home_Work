package Home_Work_2.Array;

import java.util.Arrays;

import static Home_Work_2.Array.arrayUtilsRandom.arrayRandom;


    /*
    2.4 Задачи взяты с сайта https://taskcode.ru/array. На сайте есть пояснения по каждой из этих задач.
    Все задачи в одном классе, в отдельных методах. Для создания массивов использовать ранее созданный arrayRandom.
		2.4.1. Сумма четных положительных элементов массива +++
		2.4.2. Максимальный из элементов массива с четными индексами
		2.4.3. Элементы массива, которые меньше среднего арифметического
		2.4.4. Найти два наименьших (минимальных) элемента массива
		2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
		2.4.6. Сумма цифр массива
     */

public class mathArray {

    static int[] container = arrayRandom(5,100);//

    public static void main(String[] args) {
        System.out.println("Массив; " + Arrays.toString(container));
        System.out.println("**************************");
        one();
        two();
        three();
        four();
        fife();
        six();
    }


    static void one(){  //Сумма четных положительных элементов массива
        int k = 0;

        for (int i = 0; i < container.length; i++) {
            if (container[i] % 2 == 0 & container[i]>0) {
            k += container[i];
            }
        }
        System.out.println("Сумма четных положительных элементов массива = " + k);
        System.out.println("**************************");
    }
    static void two(){       // Максимальный из элементов массива с четными индексами
        int k = 0;           // В задаче не коректно указанно (максимальнЫЙ = 1 и четныМИ индексаМИ) но максимальный только 1))

        for (int i = 0; i < container.length; i++) {
            if (container[i] % 2 == 0 & container[i]>0 & container[i] > k) {
                k = container[i];
            }
        }
        System.out.println("Максимальный, четный элемент массива = " + k);
        System.out.println("**************************");

    }
    static void three(){
        int k = 0;
        double b = 0;
        for (int i = 0; i < container.length; i++) {
                k += container[i];
        }
        b = k /container.length;
        System.out.println("Среднее значение массива = " + b);
        for (int i = 0; i < container.length; i++) {
            if (container[i]<b){
                System.out.print(container[i] + ";");
            }
        }
        System.out.println("\n**************************");
    }
    static void four(){     //Найти два наименьших (минимальных) элемента массива
        if (container.length < 1){
            System.out.println("Мало чисел в массиве");
        }
        int k;
        int l;
        if (container[0] > container[1]) {
            k = container[0];
            l = container[1];
        } else{
            k = container[1];
            l = container[0];
        }
        for (int i = 2; i < container.length; i++) {

            if (container[i] < k | container[i] < l  ) {
                if (container[i] < k){
                    if (l > container[i] & l > k) {
                        l = k;
                        k = container[i];

                    }else{
                        k = container[i];
                    }
                } else  if (container[i] < l){
                    l = container[i];
                }
            }
        }
        System.out.println("Два наименьших элемента массива: " + k + ";" + l + ";");
        System.out.println("**************************");

    }
    static void fife(){         //Сжать массив, удалив элементы, принадлежащие интервалу
        int a = 25;             //есть какое то ощущение что что то не так...hm
        int b = 50;
        int[] containerr = new int[container.length] ;
        System.arraycopy(container,0,containerr,0,container.length);
        for (int i = 0; i < containerr.length; i++) {   //скопировал массив так как если запускать все методы вместе в сл методе принимались
                                                        //значения с внесенными изменениями в данном методе
            if (containerr[i] >= a && containerr[i] <= b){
                containerr[i] = 0;
            }
            System.out.print(containerr[i] + ";" );
        }
        System.out.println("\n**************************");
    }
    static void six(){      //сумма массива
        int l = 0;
        int k = 0;
        for (int i = 0; i < container.length; i++) {
            k = container[i];
            while (k > 0){
                l += k % 10;
                k /= 10;
            }
        }
        System.out.println( "Сумма цифр массива = " + l);
    }

}
