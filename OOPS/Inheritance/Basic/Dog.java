package OOPS.Inheritance.Basic;

public class Dog extends Animal {

    @Override
    public void speaks() {
        System.out.println("dog make sound wow wow");
    }

    // new method
    public void fetch() {
        System.out.println("dog faitch the ball");
    }

}
