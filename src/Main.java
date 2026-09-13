//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /// задача 1
        for (int i = 1; i <= 10; i = i+1) {
            System.out.println(i);
        }

        /// задача 2
        for (int a = 10; a >= 1; a = a-1) {
            System.out.println(a);
        }

        /// задача 3
        for (int b = 0; b <= 17; b = b + 2) {
            System.out.println(b);
        }

        /// задача 4
        for (int q = 10; q >= -10; q = q - 1) {
            System.out.println(q);
        }

        /// задача 5
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным");
        }

        /// задача 6
        for (int m = 7; m <= 98; m = m + 7) {
            System.out.println(m);
        }

        /// задача 7
        for (int r = 1; r <= 512; r = r * 2) {
            System.out.println(r);
        }

        /// задача 8
        int savings = 29000;
        int total = 0;
        for (int p = 0; p < 12; p = p + 1) {
            total = total + savings;
            System.out.println("Месяц " +p + " сумма накоплений равна " + total + " рублей");
        }
        System.out.println(total);

        /// задача 9
        int money = 29000;
        int contribution = 0;
        for (int y = 0; y < 12; y = y + 1) {
            contribution = contribution + contribution/100;
            contribution = contribution + money;
            System.out.println("Месяц " +y + " сумма накоплений равна " + contribution + " рублей");
        }
        System.out.println(contribution);

        /// задача 10
        int two = 2;
        int figure = 0;
        for (int s = 1; s <= 10; s++) {
            figure = two * s;
            System.out.println(two +" * " +s + " = " +figure);
        }


    }
}