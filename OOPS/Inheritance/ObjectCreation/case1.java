package OOPS.Inheritance.ObjectCreation;

public class case1 {
    
    void show(){
        System.out.println("Case-1 object creation from parent to parent");
    }

    public static void main(String[] args) {
        case1 obj = new case1();
        obj.show();
    }
}


// 🧠 Explanation:

// Normal object of Parent class.

// Access only parent methods and variables.

// No relation with child yet.
