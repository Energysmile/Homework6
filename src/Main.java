public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }

        //Задание 2
        System.out.println("Задание 2");
        for (int a = 10; a > 0; a--) {
            System.out.println(a);
        }

        //Задание 3
        System.out.println("Задание 3");
        for (int a = 0; a < 18; a = a + 2) {
            System.out.println(a);
        }

        //Задание 4
        System.out.println("Задание 4");
        for (int a = 10; a >= -10; a--) {
            System.out.println(a);
        }

        //Задание 5
        System.out.println("Задание 5");
        for (int a = 1904; a <= 2096; a = a + 4) {
            System.out.println(a + " год является високосным");
        }

        //Задание 6
        System.out.println("Задание 6");
        for (int a = 7; a < 100; a = a + 7) {
            System.out.println(a);
        }

        //Задание 7
        System.out.println("Задание 7");
        for (int a = 1; a < 1000; a = a * 2) {
            System.out.println(a);
        }

        //Задание 8
        System.out.println("Задание 8");
        int salary = 29000;
        int total = 0;
        for (int a = 1; a <= 12; a++) {
            total = total + salary;
            System.out.println("Месяц " + a + ", сумма накоплений равна " + total + " рублей");
        }

        //Задание 9
        System.out.println("Задание 9");
        salary = 29000;
        total = 0;
        for (int a = 1; a <= 12; a++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + a + ", сумма накоплений равна " + total + " рублей");
        }

        //Задание 10
        System.out.println("Задание 10");
        int two = 2;
        for (int a = 1; a <= 10; a++) {
            System.out.println(two +"*"+ a + "=" + two * a);
        }

    }
}