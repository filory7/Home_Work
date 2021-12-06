package Home_Work_1;

public class ExerciseOneOne {
        public static void main(String[] args) {
            int a = 42;  // в двоичной системе 101010
            byte b = 15;   // в двоичной системе  1111
            System.out.println("побитовые операции для чисел a=" + a + ", b=" + b + ":" );
            System.out.println();
            System.out.println("числа в двоичной системе:a=" + Integer.toBinaryString(a) + ", b=" + Integer.toBinaryString(b) );

            int q = ~a;
            int w = ~b;
            System.out.println("оператор ~ для a : " + q + ", " + Integer.toBinaryString(q) + "; " +
                    "оператор ~ для b : " + w +", " + Integer.toBinaryString(w) + ";");
                        ///// в двоичной системе -43= 1010100; -16=101111

            int r = a & b;
            int s = a | b;
            int g = a ^ b;
            System.out.println("оператор & : " + r + ", " + Integer.toBinaryString(r) + "; оператор | : " + s + ", " + Integer.toBinaryString(s) +
                    "; оператор ^ : " + g + ", " + Integer.toBinaryString(g) + ";");
                // в двоичной системе 10=1010; 47=101111; 37=100101;

            int v = a << 2;
            int d = a >>> 2;
            int t = a >> 2;
            System.out.println("оператор << на 2 : " + v + "; оператор >>> на 2 : " + d + "; оператор >> на 2 : " + t + " для \"a\";");
                    // в двоичной системе 168=10101000;10=1010;

            int n = b << 2;
            int m = b >>> 2;
            int z = b >> 2;
            System.out.println("оператор << на 2 : " + n + "; оператор >>> на 2 : " + m + "; оператор >> на 2 : " + z + " для \"b\";");
                //// в двоичной системе: 60=111100;3=11

            int ddd = a &= b;
            a = 42;
            int sss = a |= b;
            a = 42;
            int aaa = a ^= b;
            a=42;
            System.out.println("переменная 'a' примит значение после операций присвоения:&=" + ddd +";|=" + sss + ";^=" + aaa);
            System.out.println("так же если поменять переменные места такие же значения примет переменная'b', так как эти операторы сравнивнивают два этих чиса вне зависимости от их местоположения в уравнение");

            int fff = a >>=2;
            a=42;
            int ggg = a >>>=2;
            a=42;
            int hhh = a <<=2;
            a=42;
            System.out.println("переменная 'a' примит значение после операций присвоения:>>=" + fff +";>>>=" + ggg + ";<<=" + hhh);

            int qqq = b >>=2;
            b = 15;
            int www = b >>>=2;
            b = 15;
            int eee = b <<=2;
            b = 15;
            System.out.println("переменная 'b' примит значение после операций присвоения:>>=" + qqq +";>>>=" + www + ";<<=" + eee);

        }
}
