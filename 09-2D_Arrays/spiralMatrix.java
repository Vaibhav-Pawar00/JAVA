public class spiralMatrix {

    public static void printSpiralMatrix(int matrix[][]){
        int stRow = 0;
        int stCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while(stRow <= endRow && stCol <= endCol){
            // top -- start row is fixed
            for(int j=stCol; j<=endCol; j++){
                System.out.print(matrix[stRow][j] + " ");
            }
            // right -- end column is fixed
            for(int i=stRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }
            // bottom -- end row is fixed
            for(int j=endCol-1; j>=stCol; j--){
                // not printing twice since it is already be printed in the top
                if(stRow == endRow){
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            // left -- start column is fixed
            for(int i=endRow-1; i>=stRow+1; i--){
                // not printing twice since it is already be printed in the right
                if(stCol == endCol){
                    break;
                }
                System.out.print(matrix[i][stCol] + " ");
            }
            stCol++;
            stRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }

    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        int matrix2[][]={{1,2,3,4,5,6},{7,8,9,10,11,12}};                
        System.out.print("Spiral Matrix 1: ");
        printSpiralMatrix(matrix);
        System.out.print("Spiral Matrix 2: ");
        printSpiralMatrix(matrix2);
    }
}
