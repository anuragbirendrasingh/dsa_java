package OOPS.Inheritance.Basic;

public class Dog1 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.speaks();
        // a1.fetch(); // methodof the child class not accessblie to parent class

        Dog d1 = new Dog();
        d1.speaks();
        d1.fetch();
        d1.showType(); // methodof the parent class accessblie to child class

        Animal p = new Dog(); // polymorphism
        p.speaks(); // run time polymorphism
        p.showType();
        // p.fetch(); // ynah object dog class ka baan raha hai show animal ka method
        // accessible nhi hai

        ((Dog) p).fetch();
    }
}

// ✅ Final takeaway

// Object बनता है RHS से (new Dog()) → Runtime behavior define करता है

// Access/Visibility decide होती है LHS से (Animal reference) → Compile-time
// behavior define करता है

// Overriding runtime पर होता है, लेकिन method existence check compile time पर
// होता है

// p.fetch() नहीं चलेगा क्योंकि compiler को पता नहीं कि fetch() Animal में नहीं
// है।
