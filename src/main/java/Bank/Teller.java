package Bank;

public class Teller {

    String accountID = "19P5295";

    public int withdraw(int amount, int currentAmount){
        if(amount <= currentAmount) {
            return currentAmount - amount;
        }
        return currentAmount;
    }

    public static void main(String args[]){
        Bank bank = new Bank();
        Teller teller = new Teller();
        int currentAmount = bank.getCurrentAmount(teller.accountID);
        int newAmount = teller.withdraw(1000, currentAmount);
        bank.setAmount(teller.accountID,newAmount);
    }
}
