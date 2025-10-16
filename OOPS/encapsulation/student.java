package OOPS.encapsulation;

public class student {
    private String name ;
    private int age ;
    public void setName(String name){
        this.name = name ;
    }
    public String getName(){
         return name ;
    }
    public void setage(int age){
      if(age>0){
        this.age = age ;
      }
      else{
        System.out.println("age can't be negative");
      }
    }
    public int getage(){
        return age ;
    }
    public void display(){
        System.out.println("my name is " + name + "my age is " + age);
    }

    public static void main(String[] args) {
        student s1 = new student();
        s1.setName("Anurag");
        s1.setage(20);
        s1.display();

        student s2 = new student();
        s2.setName("kishan");
        s2.setage(-20);
        s2.display();

    }

    

}
