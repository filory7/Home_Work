package Home_Work_2.Loops;

/*
 1.3. Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число
 которое мы будем возводить, Второе число это степень в которую возводят первое число.
 Степень - только положительная и целая. Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
		1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
		1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25
 */
import java.util.Scanner;

public class vStepen {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        double a = in.nextDouble();
        System.out.println("В какую степень возвести");
        int b = in.nextInt();
        double c = a;

        if (b < 0) {
            System.out.println("Ввели некоректно попробуйте еще раз, только положительные целые числа");
        } else {
            for (int i = 0; i < b - 1; i++) {
                c *= a;
            }
            System.out.println(c);

        }
    }
}
