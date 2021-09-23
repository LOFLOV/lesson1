package ru.geekbrains.lesson1;


public class MainApp {
    public static void main(String[] args) {
/* 8) *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й
        год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/
        int year = 2021;
        System.out.println("(Задание 8) Год : " + year);

        if (year % 400 == 0) {
            System.out.println("Высокосный год");
        } else if (year % 100 == 0) {
            System.out.println("Не высокосный год");
        } else if (year % 4 == 0) {
            System.out.println("Высокосный год");
        } else {
            System.out.println("Не высокосный год");
        }

/* 2) Создать переменные всех пройденных типов данных и инициализировать их значения.*/

        byte byte1 = (byte) 123;
        short short1 = (short) 100;
        int int1 = 200;
        long long1 = 30000000L;
        float float1 = 12.23f;
        double double1 = 123.123;
        char ch1 = '^';
        boolean bool1 = false;
        String string1 = "test";

//3) Строка для задания 3
        float res3 = calculateExpression(1.2f, 2.3f, 4.2f, 5.2f);

//4) Строка для задания 4
        boolean res4 = sumLimits(1, 5);

//5) Строка для задания 5
        positiveOrNegativeNumber(-2);

//6 Строка для задания 6
        checkPositiveOrNeg(-3);

//7 Строка для задания 7
        hiMyName("YAROSLAV");
    }


/* 3) Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
                где a, b, c, d – аргументы этого метода, имеющие тип float.*/

    public static float calculateExpression(float a, float b, float c, float d) {
        return (a * (b + (c / d)));
    }


/* 4) Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
                   (включительно), если да – вернуть true, в противном случае – false.*/
    public static boolean sumLimits(int a, int b) {
        int sum1 = a + b;
        return sum1 > 10 && sum1 <= 20;
    }

/* 5) Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
       положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.  */
    public static void positiveOrNegativeNumber(int a5) {
        if (a5 >= 0) {
            System.out.println("(Задание 5) Число: " + a5 + " положительное");
        } else {
            System.out.println("(Задание 5) Число: " + a5 + " отрицательное");
        }
    }

/* 6) Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    если число отрицательное, и вернуть false если положительное.*/

    public static boolean checkPositiveOrNeg(int a6) {
        if (a6 >= 0) {
            return true;
        } else {
            return false;
        }
    }


/* 7) Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль
    сообщение «Привет, указанное_имя!».    */

    public static void hiMyName(String name) {
        System.out.println("(Задание 7) Привет " + name + "!");
    }
}




