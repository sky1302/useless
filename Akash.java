import java.util.Scanner;

public class Akash {


    public static void main(String[] args) {
       
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");  
        String userName = myObj.nextLine();    // take user response
        System.out.println( Akash.run(userName));
    }

    public static  String run(String str) {
        return "Hello" + " " + str;
    }
}
