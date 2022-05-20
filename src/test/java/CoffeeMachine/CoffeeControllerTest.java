package CoffeeMachine;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class CoffeeControllerTest{
    private String coffeeMachineStub(){
        return "mocha";
    }

    @Test
    public void getPriceStubbedTest(){
        CoffeeController cc = new CoffeeController();
        assertEquals(18, cc.getPrice(coffeeMachineStub()));
    }
}