public class Main {
    public static void main(String[] args) {
    //Блок 1
        //Задание 1
        int money = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + total / 25;
            total = total + money;
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        //Задание 2
        System.out.println("\n");
        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print(a + " ");
        }
        System.out.println("\n");
        for (int b = 10; b >= 1; b--) {
            System.out.print(b + " ");
        }
        //Задание 3
        System.out.println("\n");
        int population = 12_000_000;
        int populationIncrease = 96000;
        int c = 0;
        while (c < 10) {
            population = population + populationIncrease;
            c = c + 1;
            System.out.println("Год " + c + ", численность населения составляет " + population);
        }
    //Блок 2
        //Задание 1
        System.out.println("\n");
        int total2 = 15000;
        int v = 1;
        System.out.println("Месяц " + v + ", сумма накоплений равна " + total2 + " рублей");
        while (total2 < 1200000) {
            total2 = total2 + total2 * 7 / 100;
            v = v + 1;
            System.out.println("Месяц " + v + ", сумма накоплений равна " + total2 + " рублей");
        }
        //Задание 2
        System.out.println("\n");
        int total3 = 15000;
        int b = 1;
        while (total3 < 1200000) {
            total3 = total3 + total3 * 7 / 100;
            b = b + 1;
            if (b % 6 == 0)
            System.out.println("Месяц " + b + ", сумма накоплений равна " + total3 + " рублей");
        }
        //Задание 3
        System.out.println("\n");
        int total4 = 15000;
        int n = 1;
        while (n < 108) {
            total4 = total4 + total4 * 7 / 100;
            n = n + 1;
            if (n % 6 == 0)
                System.out.println("Месяц " + n + ", сумма накоплений равна " + total4 + " рублей");
        }
        //Задание 4
        System.out.println("\n");
        for (int friday = 2; friday <= 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
//Блок 3
        //Задание 1
        System.out.println("\n");
        for (int year = 0; year <= 2122; year = year + 79) {
            if (year >= 1822)
            System.out.println(year);
        }
        //Задание 2
        System.out.println("\n");
        int x;
        for (int w = 1; w <= 10; w = w + 1) {
            x = 2 * w;
            System.out.println(2 + " * " + w + " = " + x);
        }
    }

}