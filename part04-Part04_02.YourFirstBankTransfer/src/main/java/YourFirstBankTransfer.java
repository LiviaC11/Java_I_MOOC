
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account mAccount = new Account("Matthews account", 1000);
        Account myAccount = new Account("My account", 0.0);
        mAccount.withdrawal(100.0);
        myAccount.deposit(100.0);
        System.out.println(mAccount);
        System.out.println(myAccount);
    }
}
