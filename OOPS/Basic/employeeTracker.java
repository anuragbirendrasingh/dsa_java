package OOPS.Basic;

public class employeeTracker {
    static int totalEmployee = 0;
    static String companyName = "anuTech";
    String name;
    String role;

    employeeTracker(String name, String role) {
        this.name = name;
        this.role = role;
        // this.companyName = companyName ; not accessiable
        totalEmployee++;
    }

    void introduce() {
        System.out.println("My name is  " + name + "  & I am  " + role + "in  " + companyName);
    }

    static void print_totalEmployee(){
      System.out.println("the total empolyee in company  "  + totalEmployee);
    }

    

    public static void main(String[] args) {
        employeeTracker e1 = new employeeTracker("anu", "SDE 1");
        employeeTracker e2 = new employeeTracker("kishan", "Designer ");

        e1.introduce();
        e2.introduce();

        employeeTracker.print_totalEmployee();

        // changing sttaic variabe affect all object 
        employeeTracker.companyName = "GunjanTech " ;

        e1.introduce();

        employeeTracker e3 = new employeeTracker("gunjan", "director");
        e3.introduce();

        employeeTracker.print_totalEmployee();
    }

}



// | Aspect       | Static                              | Instance             |
// | ------------ | ----------------------------------- | -------------------- |
// | Belongs to   | Class                               | Object               |
// | Shared?      | Yes                                 | No                   |
// | Accessed by  | Class name                          | Object reference     |
// | Memory usage | One copy per class                  | One copy per object  |
// | Common use   | Counters, config, utility functions | Object-specific data |
