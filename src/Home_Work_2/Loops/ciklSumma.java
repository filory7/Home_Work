package Home_Work_2.Loops;


/*
1. Циклы. Для преобразования строки в число можно использовать http://proglang.su/java/numbers-parseint, если хотите можете
добавить проверки на корректность ввода данных. Число положительное, максимум long:
        1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
        Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю.
        Пример: Ввели 5, должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ
        1.1.1. Используя только цикл
*/


public class ciklSumma {
    public static void main(String[] args) {

        for (String as : args) {
            int a = Integer.parseInt(as);
            System.out.println("Введеное число : " + a);
            long s = 1;
            int q = 21;
            // long lon = 9_223_372_036_854_775_807L;  //использовал лонг, было другое гипотетическое решение которое не сработало
            // при сравнение long в if сравнение работало некоректно

            //цикл for
            if (a < q) {  //число 21 взял вручную после проверок, если умножать 21 раз то будет уже отрицательное число
                for (int i = 1; i <= a; i++) {
                    s *= i;
                    System.out.print(i);
                    if (i != a){
                        System.out.print(" * ");
                    }
                }
                System.out.println(" = " + s + "; for");
            } else {
                System.out.println("итоговое число слишком большое");
            }

            //цикл while
            long k = 1;
            long n = 1;
            if (a < q) {
                while (a >= n) {
                    System.out.print(n);
                    k *= n++;

                    if (n <= a){
                        System.out.print(" * ");
                    }
                }
                System.out.println(" = " + k + "; while");
            } else {
                System.out.println("итоговое число слишком большое");
            }

            //цикл do while
            long e = 1;
            long r = 1;
            if (a < q) {
                do {
                    System.out.print(r);
                    e *= r++;

                    if (r <= a){
                        System.out.print(" * ");
                    }
                }
                while (a >= r);

                System.out.println(" = " + s + "; dowhile");
            } else {
                System.out.println("итоговое число слишком большое");
            }

        }
    }
}
