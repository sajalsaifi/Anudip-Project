package firstproject;

public class Employee extends Member {
     String specialization;

    public Employee(String name, int age, String phonenumber,String address, int salary, String specialization) {
        super(name, age, phonenumber, address, salary);
        this.specialization = specialization;
        
    }
}
   