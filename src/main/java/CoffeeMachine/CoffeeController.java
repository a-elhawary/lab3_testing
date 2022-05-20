package CoffeeMachine;

public class CoffeeController {
    String[] coffee = {"Turkish", "latte", "americano", "mocha"};
    int[] prices = {5, 20, 15, 18};

    public int getPrice(String coffeeType){
        for(int i =  0; i < coffee.length; i++){
            if(coffeeType.equals(coffee[i])){
                return prices[i];
            }
        }
        return -1;
    }
}
