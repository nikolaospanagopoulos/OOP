public class Derived extends BaseClass{
    public void accessBaseClassProtected() {
        System.out.println("Accessing protectedNumber: " + protectedNumber); // Accessible
        protectedDisplay(); // Accessible
    }
}
