package inheritanceLesson2;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[]args){
        Account myFirstAccount = new Account("first account",50000);
        Account myFirstAccount2 = new Account("first account",50000);
        myFirstAccount.deposit(4000);
        System.out.println(myFirstAccount);

        String myString = "eudhe";
        System.out.println(myString);
        SavingsAccount mySavingsAccount = new SavingsAccount("first Sav account",30000,1.2);
        SavingsAccount mySavingsAccount2 = new SavingsAccount("first Sav account",30000,1.2);
        mySavingsAccount.deposit(1000);

        System.out.println(mySavingsAccount);

        SpecialSavingsAccount mySpecialAcc = new SpecialSavingsAccount("special",20000,1.3);

        mySpecialAcc.deposit(1000);
        System.out.println(mySpecialAcc);

        String myObjectInStringFormat = mySpecialAcc.toString();
        System.out.println(myObjectInStringFormat);

        List<Account>accounts = new ArrayList<>();
        accounts.add(myFirstAccount);

        List<SavingsAccount>savingsAccounts = new ArrayList<>();
        savingsAccounts.add(mySavingsAccount);
        savingsAccounts.add(mySavingsAccount2);

        for(int i=0;i<accounts.size();i++){
            accounts.get(i).deposit(10);
        }
        for(int i=0;i<savingsAccounts.size();i++){
            savingsAccounts.get(i).deposit(10);
        }

        List<Account>allAccounts = new ArrayList<>();
        allAccounts.add(myFirstAccount);
        allAccounts.add(mySavingsAccount);
        allAccounts.add(mySavingsAccount2);

        for(int i=0;i<allAccounts.size();i++){
            allAccounts.get(i).deposit(10);
        }

        Car myCar = new Car(100);

        Airplane myAirPlane = new Airplane(1000,600,300);

        List<Vehicle>allVehicles = new ArrayList<>();
        allVehicles.add(myCar);
        allVehicles.add(myAirPlane);

        for(int i=0;i<allVehicles.size();i++){
            allVehicles.get(i).sayDetails();
        }

        Vehicle myVehicle = new Airplane(1000,600,300);


        Vehicle[]vehicles = {myVehicle,myCar,myAirPlane};

        Vehicle truck = new Truck(899);

        truck.sayDetails();


        Person john = new Person("john",30);

        System.out.println(john.age());
        System.out.println(john.name());

        System.out.println(john);

        john.sayHello();


        //create a movable Interface,
        //has start,stop,accelerate
        //create class Car which implements movable
        //a car has String brand and double topSpeed
        //a truch has the above and a String cargo
        //create class Truck that extends Car
        //create some objects of both class
        //put them in array and do loop like above and call methods











    }



}
