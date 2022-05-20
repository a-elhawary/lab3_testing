package Bank;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BankTest{
    private String tellerStub(){
        return "19P5295";
    }

    @Test
    public void stubbedSetAmount(){
       Bank bank = new Bank();
       assertEquals(1100000, bank.setAmount(tellerStub(), 1100000));
    }

    @Test
    public void stubbedGetAmount(){
        Bank bank = new Bank();
        assertEquals(1000000, bank.getCurrentAmount(tellerStub()));
    }
}