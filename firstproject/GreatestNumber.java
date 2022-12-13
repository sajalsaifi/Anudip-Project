package firstproject;

public class GreatestNumber {
 
    public static void main(String[] args) {
        //three numbers
        int a = 20;
        int b = 10;
        int c = 30;
         
        int Greatest;
         
        //find the Greatest
        if(a>b) {
            if(a>c) {
                Greatest = a;
            } else {
                Greatest = c;
            }
        } else {
            if(b>c) {
                Greatest = b;
            } else {
                Greatest = c;
            }
        }
         
        System.out.println(Greatest + " is the Greatest Number.");
    }
}