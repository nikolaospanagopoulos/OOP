package inheritanceLesson2;

public class Account implements AccountInterface{
    public double ammount;
    public String name;

    public void withdraw(double ammount){

    }

    public Account(String name, double ammount) {
        this.name = name;
        this.ammount = ammount;
    }
    public void deposit(double ammount){
        this.ammount+=ammount;
    }
    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ammount=" + ammount +
                ", name='" + name + '\'' +
                '}';
    }
}
