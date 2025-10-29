package OOPS.Inheritance.Polymorphism;

 class Parent {
    void print(){
        System.out.println("Parent class method");
    }


    void add(int a,int b){
        System.out.println("sum " + (a+b));
    }
}

class Child extends Parent{
    @Override
    void print(){
        System.out.println("Child Class Method");
    }

    void add(int a ,int b,int c){
        System.out.println("sum 3 " + (a+b+c));
    }

    public static void main(String[] args) {
        Parent obj = new Child() ;

        
        obj.print();   // child method overiding

        // compile-time polymorphism (method overloading in inheritance)
        obj.add(4,5);


        // obj.add(3,2,1); // NOt accessible 
    }
}
