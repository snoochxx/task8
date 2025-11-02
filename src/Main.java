import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество денег: ");
        int money = sc.nextInt();
        System.out.print("Введите цену за шоколадку: ");
        int price = sc.nextInt();
        System.out.print("Введите количество обёрток для обмена: ");
        int wrap = sc.nextInt();

        int result = getMaxChocolates(money, price, wrap);
        System.out.println("Максимум шоколадок: " + result);
    }

    public static int getMaxChocolates(int money, int price, int wrap) {
        int chocolates = money / price;
        return chocolates + getExtraChocolates(chocolates, wrap);
    }
    private static int getExtraChocolates(int wrappers, int wrap) {
        if (wrappers < wrap) {
            return 0;
        }
        int newChocolates = wrappers / wrap;
        int remainingWrappers = wrappers % wrap + newChocolates;
        return newChocolates + getExtraChocolates(remainingWrappers, wrap);
    }
}
