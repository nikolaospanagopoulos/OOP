public class Person {
    private String name;
    private String surname;
    private int age;
    private String job;
    //static property personCounter = 0 that counts created person objects
    public static int personCounter = 0;

    //full constructor (all properties)
    public Person(String name,String surname,int age,String job){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.job = job;
        personCounter++;
    }
    //constructor (name, surname)
    public Person(String name,String surname){
        this.name = name;
        this.surname = surname;
        personCounter++;
    }
    //empty constructor
    public Person(){
        personCounter++;
    }

    public void exampleProtected(){
        BaseClass base =new BaseClass();
        base.protectedDisplay();
        Derived derived = new Derived();
        derived.accessBaseClassProtected();;
    }


    //static method getPersonCount that return the number of created person objects
    public static String getPersonCount(){
        return ("number of created person objects are: " + personCounter);
    }

    //create two methods sayHello -> prints (personsName+ " hello")
    public  String sayHello(){
        return (this.name + "hello");
    }

    //sayInfo -> print("hello my name is this.name + this.surname, my age is this.age)

    public  String sayInfo(String name,String surname,int age){
        return ("hello my name is " + this.name +" " + this.surname + "my age is" + this.age);
    }

    //getters setters for all properties
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}


