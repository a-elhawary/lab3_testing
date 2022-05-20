package CoffeeMachine;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CoffeeMachineTest{

    private int coffeeControllerStub(String coffeeType){
        return 18;
    }

    @Test
    public void returnMoneyStubbedTest(){
        CoffeeMachine m = new CoffeeMachine();
        assertEquals(12, m.returnChange(coffeeControllerStub(m.selectedType), 30));
    }

}