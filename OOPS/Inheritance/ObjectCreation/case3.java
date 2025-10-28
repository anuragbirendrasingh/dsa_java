package OOPS.Inheritance.ObjectCreation;

 class case3 {
    void demo(){
        System.out.println("parent class method");
    }

}

class child extends case3{
    void display(){
        System.out.println("child class obj");
    }
    
    public static void main(String[] args) {
        case3 obj = new child() ;
        // obj.display();  // parent class ka method avr variable cannot be accesbile
                        // ❌ Error — parent reference can’t access child’s method
        obj.demo();
    }
}
