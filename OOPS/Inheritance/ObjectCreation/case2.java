package OOPS.Inheritance.ObjectCreation;

class case2 {
    void demo(){
        System.out.println("parent void method");
    }
}

class child extends case2{
    void display(){
        System.out.println("child class method");
    }

    public static void main(String[] args) {
        child obj = new child();
        obj.display();
        obj.demo();
    }
}

// public class Main{
//      public static void main(String[] args) {
        
//      }
// }
