package inheritanceLesson2;

public class SavingsAccount extends Account{
    public double interest;
    public SavingsAccount(String name, double ammount, double interest) {
        super(name, ammount);
        this.interest = interest;
    }

    @Override
    public void deposit(double ammount){
        super.deposit(ammount+ammount*this.interest);
    }


    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interest=" + interest +
                ", ammount=" + ammount +
                ", name='" + name + '\'' +
                '}';
    }
}
