package Home_Work_1;

import java.util.Scanner;

public class ExercizeSix {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите номер из 10 цифр ");
        String name = in.nextLine();     //scaner Для ввода цифр
        in.close();

        if (name.length() == 10) {   //if для того что бы было 10 символов только

            StringBuffer name1Buffer = new StringBuffer(name);    //меняем стринг на стринг бафер для того что бы можно было рабоать с ним
            name1Buffer.insert(0, "(");
            name1Buffer.insert(4, ")");
            name1Buffer.insert(5, " ");         //добавляем символы, не разобрался ли возможно или как сделать в 1 строку
            name1Buffer.insert(9, "-");
            System.out.println(name1Buffer);
        }
            else {
            System.out.println("Вы ввели неправильное количество цифр, попробуйте еще раз");

        }

    }
}