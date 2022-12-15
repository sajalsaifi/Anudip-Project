package firstproject;

public class Manager extends Member {
     String department;

    public Manager(String name, int age, String phonenumber,
                    String address, int salary, String department) {
        super(name, age, phonenumber, address, salary);
        this.department = department;
        
    }
}


