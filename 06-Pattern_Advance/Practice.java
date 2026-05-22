public class Practice {

    public static void hollowRectangle(int row, int cols){
        for(int i=1; i<=row; i++){
            for(int j=1; j<=cols; j++){
                if(i==1 ||  j==1 || i==row || j==cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void invAndrotatedHalfPyramid(int n){
        for(int i=1; i<=n; i++){
            // for space print
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // for star print
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void inv_halfPyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void FlyodTriangle(int n){
        int num=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void triangle_0_1(int n){
        for(int i=1; i<=n; i++){
            int num;
            if(i%2 ==0){
                num=0;
            }else{
                num=1;
            }
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
                num = (num==1) ? 0:1;
                // if(num==1){
                //     num=0;
                // }else{
                //     num=1;
                // }
            }
            System.out.println();
        }
    }

    public static void butterfly_Pattern(int n){
        // for upper part
        for(int i=1; i<=n; i++){

            // star - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // space - 2*(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            // star - i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }

        // for lower part
        for(int i=n; i>=1; i--){
            // star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // space
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            // star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }


            System.out.println();
        }
    }

    public static void solid_Rhombus(int n){
        for(int i=1; i<=n; i++){
            // for space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // for star
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_Rhombus(int n){
        for(int i=1; i<=n; i++){
            // for space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // for hollow star
            for(int j=1; j<=n; j++){
                if(i==1 | i==n | j==1 | j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n){
        // for upper part
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // star
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // for lower part
        for(int i=n; i>=1; i--){
            // spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // star
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void num_Pyramid(int n){
        for(int i=1; i<=n; i++){
            // spaces - n-i
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // star - j
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void Palindromic_Num(int n){
        for(int i=1; i<=n; i++){
            // space - n-i
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // number palindrom
            // first part - decreasing number
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            // second part - increasing number
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String []args){
        // hollowRectangle(4, 5);
        // invAndrotatedHalfPyramid(4);
        // inv_halfPyramid(5);
        // FlyodTriangle(5);
        // triangle_0_1(5);
        // butterfly_Pattern(4);
        // solid_Rhombus(5);
        // hollow_Rhombus(5);
        // diamond(4);
        // num_Pyramid(5);
        Palindromic_Num(5);
    }
}
