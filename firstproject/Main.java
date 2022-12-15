package firstproject;

public class Main {
	 public static void main(String[] args) {
	        Employee employee = new Employee("Unknown", 20, "6398******", "Basantpur", 19000,"Testing ");
	        Manager manager = new Manager("Sajal", 22, "7906******", "Saintly Ghaziabad", 39999,"IT");
	        System.out.println("   EMPLOYEE   ");
	        employee.printSalary();
	        System.out.println();
	        System.out.println("   MANAGER   ");
	        manager.printSalary();
	    }
}
