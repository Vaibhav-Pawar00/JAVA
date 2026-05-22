public class palindrome {

    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n = str.length() - 1;
            if (str.charAt(i) != str.charAt(n-i)) {
                return false;                
            }
        }
        return true;
    }

    public static void main(String args[]){
        String str = "racepcar";
        if(isPalindrome(str) == true){
            System.out.println("The string is Palindrome: " + str);
        }else{
            System.out.println("The string is not Palindrome!");
        }
    }
    
}
