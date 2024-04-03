package inheritanceLesson2;
//JAVA 14
public record Person(String name,int age) {
    public void sayHello(){
        System.out.println("hello");
    }
}
