public class Account {
    //you cannot access it through the object directly. you can access it through getter and setter
    private String name;
    private double balance;

    public Account(String name,double balance){
        this.name = name;
        if(balance > 0){
            this.balance = balance;
        }else{
            this.balance = 0;
        }
    }

    public void deposit(double depositAmount){
        if(depositAmount > 0){
           // this.balance = this.balance + depositAmount;
            this.balance+=depositAmount;
        }
    }

    //getter
    public String getName() {
        return name;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
