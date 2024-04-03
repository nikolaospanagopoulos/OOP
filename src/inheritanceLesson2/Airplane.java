package inheritanceLesson2;

public class Airplane implements Vehicle{
    int speed;
    int airSpeed;
    int totalWeight;

    public Airplane(int speed, int totalWeight, int airSpeed) {
        this.speed = speed;
        this.totalWeight = totalWeight;
        this.airSpeed = airSpeed;
    }

    public void sayDetails(){
        System.out.println("my speed is "+this.speed+" my airspeed is: "+this.airSpeed+ " and my weight is :"+this.totalWeight);
    }
}
