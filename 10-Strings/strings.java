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


        // String Comparison
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if (s1==s2) {      // -----------> returns true
            System.out.println("Strings are equal");            
        }else{
            System.out.println("Strings are not equal!!");
        }    
        /*
        if (s1 == s3) {   // -----------> returns false since checks object as new object is created 
        System.out.println("Strings are equal");
        }else{
        System.out.println("Strings are not equal!!");
        }*/
        if(s1.equals(s3)){ // -----------> returns true checks since used - .equal function and compared inside value not object.
            System.out.println("Strings are equal ");
        }else{
            System.out.println("Not equal");
        }

        // sc.close();

    }    
}
