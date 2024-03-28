public class Animal {
    public String name;
    public double weight;
    public static int animalNum = 0;
    public Animal(){
        this.name = "unknown";
        this.weight = 0.0;
        countAnimals();
    }

    public static int getAnimalNum(){
        return animalNum;
    }




    public void sayHello(){
        System.out.println("Animal "+this.name+" says hello");
    }

    public static void countAnimals(){
        animalNum++;
    }

    public Animal(String name,double weight){
        this.name = name;
        this.weight = weight;
        countAnimals();

    }

    public String getName(){
        return this.name;
    }
    public Double getWeight(){
        return this.weight;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
}
