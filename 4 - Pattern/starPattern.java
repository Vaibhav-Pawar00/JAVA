public class starPattern {
    public static void main(String args[]){

        /* 
        for(int i = 1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */


        // inverted pattern
        /*
        int n = 4; // ----------> no. of rows/ stars will be same
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */


        // Half pyramid - numbers
        /*
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println(); 
        }
        */


        // Character pattern
        char ch = 'A';
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }




    }
}
