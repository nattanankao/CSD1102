public class CoffeeShop {

    public static void main(String[] args) {

        CoffeeMachine machine = new CoffeeMachine();

        String[] menus = {
            "Espresso","Latte","Mocha","Cappuccino","Americano",
            "Macchiato","Flat White","Affogato","Irish Coffee","Ristretto"
        };

        for (String menu : menus) {
            new Thread(new CoffeeMaker(menu, machine)).start();
        }

        System.out.println("End main");
    }
}