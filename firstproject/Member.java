package firstproject;

public class Member {
	    String name;
	    int age;
	    String phonenumber;
	    String address;
	    int salary;
	    

	    public Member(String name, int age, String phonenumber, String address, int salary) {
	        this.name = name;
	        this.age = age;
	        this.phonenumber = phonenumber;
	        this.address = address;
	        this.salary = salary;
	    }

	    public void printSalary() {
	        System.out.println("Name :" + name);
	        System.out.println("Age :" + age);
	        System.out.println("Phone number :" + phonenumber);
	        System.out.println("Address :" + address);
	        System.out.println("Salary :" + salary);
	    }
	}




