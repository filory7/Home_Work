package Home_Work_1;

public class ExercizeThree {
    public static void main(String[] args) {

        double a = Math.abs(-10.3); //"abs" делают любое число положительным, работает с:int, double, float,long
        System.out.println(a);

        double b = Math.cbrt(40); //выводит корень числа, может быть целым или дробным
        System.out.println(b);

        int x = 147_483_647;
        int y = 200;
        System.out.println(Math.addExact(x, y));//складывает два чиса в пределах указанной переменной:int, long

        double s = Math.ceil(6.4);  //если правильно понял, округляет до целого числа в большую сторону
        System.out.println(s);

       // double qq = 3.56;
       // double ww = 7.898;                не понял
       // System.out.println(Math.copySign(qq, ww);
        int k = 1234;
        System.out.println(Math.decrementExact(k)); //уменьшает число на 1 работает в пределах указанной переменной, Int long

        System.out.println(Math.floorDiv (55,4));  //делит первое число на второе и возвращает целое чисо без остатка

        System.out.println(Math.max(15.232, 11.25));//выводи максимаьное число



    }

}
