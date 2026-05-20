import java.util.*;
public class strings {

    public static void printString(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static void main(String args[]){
        /*
        String str = "abcd";
        String str2 = new String("xyz");
        
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(text);
        */

        String name = "Tony Stark";
        System.out.println(name.length());
        System.out.println(name.charAt(0));

        // concatenation
        String fName = "Vaibhav";
        String lName = "Pawar";
        String fullName = fName + " " + lName;
        // System.out.println(fullName);
        printString(fullName);

        // sc.close();

    }    
}
