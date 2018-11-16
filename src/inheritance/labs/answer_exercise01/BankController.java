package inheritance.labs.answer_exercise01;

public class BankController {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.setFirst_name("Eileen");
        myAccount.setLast_name("Ai");
        myAccount.setBalance(100000000,true);

        BankController bank = new BankController();
        bank.method1(myAccount);

        System.out.println(myAccount.getBalance());
    }

    public void method1(BankAccount account){
        account.setBalance(500,false);
        method2(account);
    }

    public void method2(BankAccount account){
        account.setBalance(20,false);

    }
}


