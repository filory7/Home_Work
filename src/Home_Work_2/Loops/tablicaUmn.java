package Home_Work_2.Loops;
/*
 1.5. Вывести таблицу умножения в консоль. В консоли должно получиться также как и на картинке
 (динозаврика рисовать не надо): https://www.dropbox.com/s/ibakfuppvy2w32g/multiplication_table.jpeg?dl=0
 */

public class tablicaUmn {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8,9,10};
        int n = 2;

        int q;
        int w;
        int e;
        int r;
        int t = 2;
        int y = 3;
        int u = 4;
        int o = 5;

        for (int z = 0; z < 2; z++) {


        for (int i = 0; i < number.length; i++) {
            q = n++ * number[i];
            w = n++ * number[i];
            e = n++ * number[i];
            r = n++ * number[i];        //пока остановился волнение задания, подумаю как можно сократить строку вывода инфы
            n -= 4;
            System.out.printf("%-10s %-10s %-10s %-10s\n", t + "*" + number[i] + "=" + q , y + "*" + number[i] + "=" + w ,
                    u + "*" + number[i] + "=" + e , o + "*" + number[i] + "=" + r);
        }
        System.out.println();
        n = 6;
        t = 6;
        y = 7;
        u = 8;
        o = 9;
        }
    }
}

