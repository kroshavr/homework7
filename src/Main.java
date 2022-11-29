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
        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.println(a);
        }
        for (int b = 10; b >= 1; b--) {
            System.out.println(b);
        }
        //Задание 3
        int population = 12_000_000;
        int populationIncrease = 96000;
        int c = 0;
        while (c < 10) {
            population = population + populationIncrease;
            c = c + 1;
            System.out.println("Год " + c + ", численность населения составляет " + population);
        }
    }

}