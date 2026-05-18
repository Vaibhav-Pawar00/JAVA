public class diagonalSum {

    public static int calcDiagonalSUM(int matrix[][]){
        int sum = 0;
        // brute force method - O(n^2) complexity
        /*
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                // Primary Diagonal Sum - From leftTop to rightBottom
                if(i==j){
                    sum += matrix[i][j];
                }
                // Secondary Diagonal Sum - From rightTop to leftBottom
                else if(i+j == matrix.length-1){
                    sum += matrix[i][j];
                }
            }
        }
        */
        // optimized method
        int n = matrix.length-1;
        for(int i=0; i<matrix.length; i++){
            // Primary Diagonal
            sum += matrix[i][i];
            // Secondary Diagonal
            if(i != n-i){
                sum+=matrix[i][n-i];
            }
        }

        return sum;
    }

    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        int matrix2[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("Sum of 1st Matrix: " + calcDiagonalSUM(matrix));
        System.out.println("Sum of 2nd Matrix: " + calcDiagonalSUM(matrix2));
    }
}
