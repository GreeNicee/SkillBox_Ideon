class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        System.out.println("Кофе-машина");

        Integer moneyAmount = 10;

        Integer lattePrice = 150;
        Integer cappucinoPrice = 140;
        Integer waterPrice = 20;
        Integer milkPrice = 30;

        boolean canBuyAnything = false;

        if(moneyAmount >= lattePrice) {
            System.out.println("Вы можете купить латте");
            canBuyAnything = true;
        }

        if(moneyAmount >= cappucinoPrice) {
            System.out.println("Вы можете купить капучино");
            canBuyAnything = true;
        }

        if(moneyAmount >= waterPrice) {
            System.out.println("Вы можете купить воду");
            canBuyAnything = true;
        }

        if(moneyAmount >= milkPrice) {
            System.out.println("Вы можете купить молоко");
            canBuyAnything = true;
        }

        if(!canBuyAnything) {
            System.out.println("Недостаточно средств!");
        }
    }
}