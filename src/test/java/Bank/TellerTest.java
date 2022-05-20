package Bank;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TellerTest{

    private int bankStub(String accountID){
        return 2000;
    }

    @Test
    public void withdrawStubbedTest(){
        Teller teller = new Teller();
        assertEquals(1000,teller.withdraw(1000, bankStub(teller.accountID)));
    }

    @Test
    public void withdrawStubbedTestExceedsAmount(){
        Teller teller = new Teller();
        assertEquals(500,teller.withdraw(1000, 500));
    }
}