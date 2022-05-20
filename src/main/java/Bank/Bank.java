package Bank;

public class Bank {
    String accountIDs[] = {"19P5295", "19P5296", "19P5297"};
    int amounts[] = {1000000, 350000, 300};

    public int setAmount(String accountID,int amount){
        for(int i = 0; i < accountIDs.length; i++){
            if(accountID.equals(accountIDs[i])){
                amounts[i] = amount;
                return amounts[i];
            }
        }
        return -1;
    }

    public int getCurrentAmount(String accountID){
        for(int i = 0; i < accountIDs.length; i++){
            if(accountID.equals(accountIDs[i])){
                return amounts[i];
            }
        }
        return -1;
    }

}
