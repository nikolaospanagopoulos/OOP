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


        //Car nissan = new Car("nissan",15.000,180);

        System.out.println("first car is "+ nissan.getBrand());

        // nissan.startEngine();
        //  bmw.startEngine();


        Account account1 = new Account("John Doe",1.5);
        Account account2 = new Account("Jane Doe",-0.6);
        System.out.println("Account 1 Obj"+account1);
        account2.deposit(1000);
        System.out.println(account2.getBalance());

        System.out.println("------------------------------Exercises----------------------------------");

        Person person1 = new Person("John","Smith",24,"doctor");
        Person person2 = new Person("Alice","White",23,"teacher");
        Person person3 = new Person("George","Brown");
        Person person4 = new Person("Maria","Doe",27,"musician");
        Person person5 = new Person();
        System.out.println("!!!!!!!!!");
        person5.exampleProtected();
        person5.setAge(26);
        person5.setName("Michael");

        person3.sayHello();
        person2.sayInfo("nikos","pan",30);

        Animal unknownAnimal = new Animal();
        Animal knownAnimal = new Animal("rex",20);
         knownAnimal.sayHello();
        System.out.println(unknownAnimal.getName());
        unknownAnimal.setName("fido");
        unknownAnimal.setWeight(30);
        System.out.println("animal name after change: ");
        System.out.println(unknownAnimal.getName());
        System.out.println(knownAnimal.getName());
        System.out.println("Number of animals created: "+Animal.getAnimalNum());

        Dog myDog = new Dog();
        myDog.setWeight(50);
        myDog.setName("Rex");

        System.out.println(myDog.getName());
        System.out.println(myDog.getWeight());

        Dog secDog = new Dog("Zari",60,"white");
        secDog.sayHello();
        System.out.println("Dog name: "+secDog.getName());
        System.out.println("Dog weight: "+secDog.getWeight());
        System.out.println("Dog color: "+secDog.getColor());

        secDog.sayHello();

        BaseClass base = new BaseClass();
        base.protectedDisplay();

        Derived derived = new Derived();
        derived.accessBaseClassProtected();
        //System.out.println(secDog.animalAge);;
    }

    //Exercise
    //create a Person class (name, surname, age, job)
    //1 full constructor (all properties)
    //2 constructor (name, surname)
    //3 empty constructor
    //getters setters for all properties
    //static property personCounter = 0 that counts created person objects
    //static method getPersonCount that return the number of created person objects
    //create two methods sayHello -> prints (personsName+ " hello"), sayInfo -> print("hello my name is this.name + this.surname, my age is this.age)
    //create a Worker(name,surname,age,job,salary) class that inherits from Person
    //1 full constructor (all properties)
    //2 constructor (name, surname,age,job,salary)
    //3 empty constructor ->still calls Person constructor
    //4 uses sayHello
    //5 overrides say hello

}
