public class Advance_Pattern {

    public static void hollowRectangle(int row, int col){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=col; j++){
                if(i==1 || j==1 || i==row || j==col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void Inverted_Rotated_HalfTriangle(int n){
        for(int i=1; i<=n; i++){
            // Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // Stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Inverted_HalfPyramid_Num(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i+1); j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void FlyodTriangle(int row){
        int n=1;
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }

    public static void  Triangle_0_1(int n){
        for(int rows=1; rows<=n; rows++){
            for(int col=1; col<=rows; col++){
                if((rows+col)%2==0){
                    System.out.print("1" + " ");
                }else{
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }

    public static void ButterFly_Pattern(int n){

        // First Half
        for(int i=1; i<=n; i++){
            // Stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // Spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // Stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Second Half
        for(int i=n; i>=1; i--){
            // Stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // Spaces - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            // Stars - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void Rhombus(int n){
        for(int i=1; i<=n; i++){
            // Spaces
            for(int j=0; j<=n-i; j++){
                System.out.print(" ");
            }
            // Stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void HollowRhombus(int n){
        for(int i=1; i<=n; i++){
            // Spaces
            for(int j=0; j<=n-i; j++){
                System.out.print(" ");
            }
            // Hollow Rhombus
            for(int j=1; j<=n; j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void DiamondPattern(int n){
        // First Half
        // int firstCount = 0;
        for(int i=1; i<=n; i++){
            // Spaces - n-i
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // Star - i+Starcount
            for(int j=1; j<=((2*i)-1); j++){
                System.out.print("*");
            }
            /*
            for(int j=1; j<=(i+firstCount); j++){
                System.out.print("*");
            }
            firstCount = firstCount + 1;            
            */
            System.out.println();
        }
        // Second Half
        for(int i=n; i>=1; i--){
             // Spaces - n-i
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // Star - i+Starcount
            for(int j=1; j<=((2*i)-1); j++){
                System.out.print("*");
            }
            /*
            for(int j=2; j<=(i+firstCount); j++){
                System.out.print("*");
            }
            firstCount = firstCount - 1;            
            */
            System.out.println();
        }
        
    }

    public static void NumPyramid(int n){
        for(int i=1; i<=n; i++){
            // Spaces - n-i
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            // Number Prints
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void PalindromicPattern(int n){
        for(int i=1; i<=n; i++){
            // Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // decreasing number - i->1
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            // increasing number
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }



    public static void main(String []args){

        // hollowRectangle(15, 10);
        
        // Inverted_Rotated_HalfTriangle(15);

        // Inverted_HalfPyramid_Num(15);

        // FlyodTriangle(5); 

        // Triangle_0_1(5);     
        
        // ButterFly_Pattern(4);

        // Rhombus(5);

        // HollowRhombus(5);

        // DiamondPattern(7);

        // NumPyramid(5);

        PalindromicPattern(5);

    }
    
}
