package example2Package;

import examplePackage.ExampleClass;

//public-> objects themselves have access for example car.start() and their class children
//private-> objects dont have access to the method, can only be used inside the class >>>>>XXX car.start() not inherited
//protected -> protected members are only accessible within their own class, subclasses, and classes in the same>>>>>package ->INHERITED
//in JAVA inheritance is of type IS A -> a Dog is an Animal
public class UnrelatedClass {
    public void tryAccess() {
        ExampleClass obj = new ExampleClass();
      //  obj.display(); // Attempt to call protected method
    }
}
