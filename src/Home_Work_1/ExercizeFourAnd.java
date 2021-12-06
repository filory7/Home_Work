package Home_Work_1;

public class ExercizeFourAnd {
    public static boolean sleepIn(boolean weekday, boolean vacation) {  //указываем две переменные типа boolean

        if (!weekday || vacation) {  //проевряем условие, так как оператор отрицание меняем значение на противоположное, далее проверяем условие
            return true;                                        //если есть 1 true тогда получаем ture, если нет не 1 true получаем false
        }                                                   //если условие выполняеться возвращаем true
        return false;           //если условие в if не выполняеться выполняем false
    }
    public static void main(String[] args) {
        boolean a = sleepIn(true, false);      //проверяем метод sleepIn в зависимости от поступаемых переменных
        if (a == true) {                             //проверяем условие
            System.out.println("спим дальше");  //если а = true печатаем спим дальше
        } else {   //если условие не сработало печатаем пора на работу
            System.out.println("Пора на работу");
        }
    }
}



