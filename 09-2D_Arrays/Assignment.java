public class Assignment {

    public static void printMatrix(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){

        // Qs 1 - Print the number of 7’s that are in the 2d array.
        /*
        int matrix[][] = {{4,7,8}, {8,8,7}};
        int key = 7;
        int count=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(key == matrix[i][j]){
                    count++;
                }
            }
        }
        System.out.println("Count of the "+key+" in matrix is: " + count);
        */



        // Qs 2 - Print out the sum of the numbers in the second row of the “nums” array
        /*
        int numsMatrix[][] = {{1,4,9},{11,4,3},{2,2,3}};
        int sum=0;
        for(int i=0; i<numsMatrix.length; i++){
            for(int j=0; j<numsMatrix[0].length; j++){
                if(i==1){
                    sum += numsMatrix[i][j];
                }
            }
        }
        System.out.println("The sum of 2nd row is: " + sum);
        */



        // Qs 3 - Find transpose of a matrix
        int tMatrix[][] = {{2,3,7}, {5,6,7}};
        int row=tMatrix.length, col=tMatrix[0].length;

        // Display original Matrix
        System.out.println("Original Matrix: ");
        printMatrix(tMatrix);

        // Transposed Matrix
        int transpose[][] = new int[col][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                transpose[j][i] = tMatrix[i][j];
            }
        }
        // display transposed Matrix
        System.out.println("Transposed Matrix: ");
        printMatrix(transpose);
    }
}
