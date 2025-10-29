package OOPS.Inheritance.Polymorphism;



public class Calculator {
    
    void add(int a,int b){
           System.out.println("int-- "+ (a + b));
    }

    void add(double a,double b){
        System.out.println("double-- "+( a + b));
    }

    void add(int a,int b,int c){
        System.out.println("3Int-- " + (a + b +  c));
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(2.5 , 2.3);
        c.add(4,5,6); 
        c.add(2,3);
    }

    
}


// 🔹 Yahan pe compiler compile time par hi decide kar leta hai kaunsa method call hoga.
// Isiliye ise compile-time polymorphism (method overloading) kehte hain.


// 👉 Ye ek hi class ke andar hota hai (ya inheritance me bhi ho sakta hai, but override nahi — overload hota hai).