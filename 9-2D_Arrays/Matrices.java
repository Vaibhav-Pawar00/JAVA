import java.util.*;

public class Matrices {

    public static boolean search(int matrix[][], int key){
        int n = matrix.length, m = matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == key){
                    System.out.print("Found at cell: (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void printMatrix(int matrix[][]){
        int n = matrix.length, m = matrix[0].length;
        System.out.println("The matrix is of " + n + "X" + m + ":");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void largestElement(int matrix[][]){
        int n = matrix.length, m = matrix[0].length;
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(largest < matrix[i][j]){
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("The largest element in the matrix is: " + largest);
    }

    public static void smallestElement(int matrix[][]){
        int n = matrix.length, m = matrix[0].length;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(smallest > matrix[i][j]){
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("The smallest element in the matrix is: " + smallest);
    }
    
    public static void main(String args[]){
        int matrix [][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Matrix elements: \n");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // System.out.print("Enter key to search in the Matrix: ");
        // int key = sc.nextInt();
        
        printMatrix(matrix);
        // search(matrix, key);
        largestElement(matrix);
        smallestElement(matrix);

        sc.close();
    }

}
