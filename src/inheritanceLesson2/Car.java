package inheritanceLesson2;

public class Car implements Vehicle{
    public int speed;


    public Car(int speed) {
        this.speed = speed;
    }

    public void sayDetails(){
        System.out.println("my speed is "+this.speed);
    }

}
