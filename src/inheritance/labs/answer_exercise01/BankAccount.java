package inheritance.labs.answer_exercise01;

public class BankAccount {

    private String first_name;
    private String last_name;
    private double balance;

    //"control + enter" to get boiler plate methods
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance, boolean verfied) {

        //These are dummies variables for demo.
        boolean authenticated = true;
        boolean fraudulent = false;

        if(authenticated){
            if(!fraudulent){
                if(verfied){
                    this.balance = balance;
                }
            }
        }
    }
}
