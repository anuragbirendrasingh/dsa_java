package OOPS.Basic;

public class student {
    
    static String school = "IHS" ;
    static int totalstudent = 0 ;

    String name ;
    int age ;
    int grade ;

    student(String name ,int age,int grade){
        this.name = name ;
        this.age = age ;
        this.grade  = grade ;
        totalstudent++ ;

    }

    void displayInfo(){
        System.out.println("My name is " + name + " my age is: "  + age  + " my grade is " + grade + " my school is " + school);
    }

    void promote(){
        grade++ ;
    }

    static void numtotalstudent(){
        System.out.println(totalstudent);
    }

    public static void main(String[] args) {
        student s1 = new student("anurag", 20, 11 );
        student s2 = new student("kishan", 22, 11 );
        student s3 = new student("gunjan", 21, 11 );
        student s4 = new student("ankit", 20, 11 );

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
        s4.displayInfo();
        s4.promote();
        s4.displayInfo();

        // change the school name 

        student.school = "gunajn public school";
        s3.displayInfo();

        student.numtotalstudent();;
        
    }
}
