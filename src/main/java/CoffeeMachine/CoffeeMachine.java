package CoffeeMachine;

public class CoffeeMachine {

    public String selectedType = "mocha";

    public int returnChange(int price, int moneyEntered){
        return moneyEntered - price;
    }

    public static void main(String args[]){
        CoffeeMachine cm = new CoffeeMachine();
        CoffeeController cc = new CoffeeController();
        int price = cc.getPrice(cm.selectedType);
        System.out.println(cm.returnChange(price, 30));
    }
}
