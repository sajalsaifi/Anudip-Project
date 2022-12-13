package firstproject;

import java.util.Scanner;
class Operations{
    public static void main(String[] args) {
        int a, b;
       Scanner s=new Scanner(System.in); 
       System.out.println("Enter First Number: ");
       a=Integer.parseInt(s.nextLine());
       System.out.println("Enter Second Number: ");
       b=Integer.parseInt(s.nextLine());
       
       while(true){
          System.out.println("Select an Option...");
          System.out.println("1. Addition");
          System.out.println("2. Subtract");
          System.out.println("3. Multiplication");
          System.out.println("4. Division");
	  System.out.println("5. Module");
          System.out.println("6. Exit");
          System.out.println("Type your selection here: ");
   
          String choice=s.nextLine();
          switch(choice){
              case "1":
                  System.out.println("Addition = "+(a+b));
                  break;
              case "2":
                  System.out.println("Subtract = "+(a-b));
                  break;
              case "3":
                  System.out.println("Multiplication = "+(a*b));
                  break;
              case "4":
                  System.out.println("Division = "+(a/b));
                  break;
              case "5":
                  System.out.println("Remainder = "+(a%b));
                  break;
              case "6":
                  System.exit(0);
              default:
                  System.out.println("Wrong Choice!!");
                  break;
                      
                
          }
       }
    }
}