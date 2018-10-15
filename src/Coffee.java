public class Coffee {
    public static void main(String[] args) {
        int moneyAmount = 120;
        String[] drinks = {
                "Капучино", "Латте", "Вода", "Молоко"
        };

        int[] prices = {
                120, 140, 20, 40
        };

        boolean[] drinksFlags = {false, false, false, false};

        System.out.println("Кофе-машина");
        System.out.println("Ваш баланс: " + moneyAmount);

        for (int i = 0; i <= 3; i++) {
            if (moneyAmount >= prices[i])
                drinksFlags[i] = true;
            System.out.println(drinks[i] + " стоимость: " + prices[i] + " статус: " + booChecker(drinksFlags[i]));
        }
    }

    private static String booChecker(boolean flag) {
        return flag ? "Доступно" : "Недоступно";
    }
}
