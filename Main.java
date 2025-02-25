import models.Account;
import services.ATMService;

public class Main {
    public static void main(String[] args) {
        Account userAccount = new Account(1000); // Initial balance: $1000
        ATMService atm = new ATMService(userAccount);
        atm.start();
    }
}
