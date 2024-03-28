public class Dog extends Animal{
    public String color;
    public Dog(){
        super("unknown dog",40);
        this.color = "brown";
    }

    public Dog(String name,double weight,String color){
        super(name,weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
//
//    public void sayHello(){
//
//        System.out.println(this.name + " is a dog");
    //  super.sayHello();
//    }

    public void setColor(String color) {
        this.color = color;
    }
}
