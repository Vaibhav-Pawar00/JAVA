import java.util.Arrays;
import java.util.Scanner;

public class Assignment {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // Qs 1 - Count how many times lowercase vowels occurred in String
        /*
        System.out.print("Enter a string to findout lowercase vowels count: ");
        String str = sc.nextLine();
        
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println("Count of LowerCase vowel is: " + count);
        */
       
       // Qs 2 - check if the two strings are anagrams of each other
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        
        // convert to lower case
        str1.toLowerCase();
        str2.toLowerCase();

        if(str1.length() == str2.length()){
                // convert string to character arrays
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();
        
            // Sort the character arrays
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
        
            // compare the sorted array
            boolean result = Arrays.equals(str1charArray, str2charArray);
        
            // print result -->
            if(result){
                System.out.println(str1 + " and " + str2 + " are anagrams of each other");
            }else{
                System.out.println(str1 + " and " + str2 + " are NOT anagrams of each other");
            }
            
        }else{
                System.out.println(str1 + " and " + str2 + " are NOT anagrams of each other");
        }



       
       
       
       
       sc.close();
    }
}
