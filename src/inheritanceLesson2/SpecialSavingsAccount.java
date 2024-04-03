package inheritanceLesson2;

public class SpecialSavingsAccount extends SavingsAccount{
    public SpecialSavingsAccount(String name, double ammount, double interest) {
        super(name, ammount, interest);
    }

    @Override
    public void deposit(double ammount){
        super.deposit(ammount+0.2);
        System.out.println("deposited successfully");
    }


    @Override
    public String toString() {
        return "SpecialSavingsAccount{" +
                "name='" + name + '\'' +
                ", ammount=" + ammount +
                ", interest=" + interest +
                '}';
    }
}
