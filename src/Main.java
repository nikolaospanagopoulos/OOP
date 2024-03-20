public class Main {
    public static void main(String[]args){
        System.out.println("Hello");
        Car nissan = new Car();

        nissan.setBrand("nissan");
        nissan.setPrice(15000);
        nissan.setTopSpeed(180);


        System.out.println(nissan.getBrand());




        Car bmw = new Car("BMW",25.000,190);



        bmw.setTopSpeed(200);

        System.out.println("second  car top speed "+ bmw.getTopSpeed());

        Car vw = new Car("VW",20000);

        System.out.println("number of cars created is: "+Car.sayCarNumber());


        //1.abstraction
        //2.encapsulation
        //3.inheritance Car -> Truck
        //4.polymorphism
        //5. reusability


        System.out.println("third  car brand "+ vw.getBrand());



//        Car nissan = new Car("nissan",15.000,180);
//
//


       System.out.println("first car is "+ nissan.getBrand());

       // nissan.startEngine();
      //  bmw.startEngine();



        Account account1 = new Account("John Doe",1.5);
        Account account2 = new Account("Jane Doe",-0.6);
        System.out.println("Account 1 Obj"+account1);
        account2.deposit(1000);
        System.out.println(account2.getBalance());
    }
}
