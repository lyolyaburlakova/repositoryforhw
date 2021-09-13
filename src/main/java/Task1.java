import java.util.Arrays;
public class Task1
{
    //посчитать факториал числа n
    //0.5 балла - если посчитаете в цикле
    //1 балл - если посчитаете рекурсией
    public static int fact(int n){
        int res = 1;
        if(n <= 1){
            res = 1;
        }
        else{
            res = n * fact(n-1);
        }
        return res;
    }

    //вывести таблицу умножения на экран - 1 балл
    //подсказка - использовать двойной for
    public static void table(){

        for(int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                System.out.print(j * i + " ");
            }
            System.out.println("");
        }

        //Ваше решение здесь
    }

    //посчитать сумму цифр числа
    //можно посчитать для трехзначного - 0.5 балла
    //для любого числа - 1 балл
    //подсказка - в случае для любого числа используйте while
    public static int sum(int n){
        int summ = 0;
        while(n>0){
            summ += n % 10;
            n = (n - (n % 10))/10;
        }
        n = summ;
        return n;
    }

    //определить, является ли год високосным
    //В високосном году - 366 дней, тогда как в обычном - 365.
    //Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
    //Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
    //Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
    //Годы 2100, 2200 и 2300 - не високосные.
    //за правильный ответ - 0.5 балла
    public static boolean isLeapYear(int year) {
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    return true;
                } else {
                    return false;
                }

            } else{
                return true;
            }
        } else {
            return false;
        }
        //return true;
    }

    //здесь вам нужно будет использовать результат прошлой задачи
    //и вывести, сколько дней в году
    //правильный ответ - 0.5 балла
    public static int daysInYear(int year) {
        int days = 0;
        if (isLeapYear(year)){
            days = 366;
        } else {
            days = 365;
        }
        return days;
    }

    //определить номер дня недели по строке
    //например: Понедельник - 1
    //правильный ответ - 1 балл
    public static int dayOfTheWeek(String n){
        int day = 0;
        if(n == "Понедельник"){
            day = 1;
        }
        if(n == "Вторник"){
            day = 2;
        }
        if(n == "Среда"){
            day = 3;
        }
        if(n == "Четверг"){
            day = 4;
        }
        if(n == "Пятница"){
            day = 5;
        }
        if(n == "Суббота"){
            day = 6;
        }
        if(n == "Воскресенье"){
            day = 7;
        }
        return day;
    }

    //вывести массив на экран в виде: [1, 5, 3, 7, 10, 2, 5]
    //правильное решение - 0.5 балла
    public static void printArray(int[] array){
        System.out.println(Arrays.toString(array));
    }

    //вывести двойной массив на экран в виде:
    // [1, 5, 3, 7, 10, 2, 5]
    // [1, 5, 3, 7, 10, 2, 5]
    // ...
    //правильное решение - 0.5 балла
    public static void printArray(int[][] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array[i]));
        }
    }

    //отсортировать одномерный массив в порядке возрастания
    //если не знаете, как сортировать, то подсказка -
    //метод пузырька (один из самых простых для понимания)
    //правильный ответ - 1 балл
    public static int[] sort(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < (array.length - i - 1); j++){
                if(array[j] > array[j+1]){
                    int a = array[j];
                    array[j] = array[j+1];
                    array[j+1] = a;
                }
            }
        }
        return array;
    }


    //здесь можете тестировать свои решения
    public static void main(String[] args){
        System.out.println("Факториал:");
        System.out.println(fact(5));

        System.out.println("Таблица умножения:");
        table();

        System.out.println("Сумма цифр числа:");
        System.out.println(sum(12345));

        System.out.println("Дней в году:");
        System.out.println(daysInYear(2019));

        System.out.println("День недели:");
        System.out.println(dayOfTheWeek("Понедельник"));

        int[] array1D = {1,5,3,7,10,2,5};
        System.out.println("Вывод отсортированного массива:");
        printArray(sort(array1D));

        System.out.println("Вывод двумерного массива:");
        int[][] array2D = {{1,5,3,7,10,2,5}, {1,5,3,7,10,2,5}};
        printArray(array2D);
    }
}