public class searchMatrices{

    // Brute force search in matrix
    public static void bruteForce(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(key==matrix[i][j]){
                    System.out.println("Key " + key + " found at cell: ("+i+","+j+")");
                    // return "Key found at cell: ("+i+","+j+")"; 
                }
            }
        }
    }

    // started from top right
    public static boolean TR_staircaseSearch(int matrix[][], int key){
        int row=0, col=matrix[0].length-1;
        while (row < matrix.length && col >=0) {
            if(matrix[row][col] == key){
                System.out.println("Key found at cell: ("+row+","+col+")");
                return true;
            }
            
            else if(key < matrix[row][col]){
                col--;
            }else{
                row++;
            }   
        }
        System.out.println("Key not found!");
        return false;
    }

    public static boolean BL_staircaseSearch(int matrix[][], int key){
        int row=matrix.length-1, col=0;
        while (row>=0 && col<matrix[0].length) {
            if(matrix[row][col] == key){
                System.out.println("Key found at cell: ("+row+","+col+")");
                return true;
            }

            else if(key < matrix[row][col]){
                row--;
            }else{
                col++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }

    public static void main(String args[]){
        // Search in sorted matrix - matrix is sorted in both row wise and column wise
        int matrix[][] = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        int key = 33;
        // bruteForce(matrix, key);

        // Top right staircase search
        // TR_staircaseSearch(matrix, key);

        // Search from Bottom Left Staircase Search
        BL_staircaseSearch(matrix, key);
    }

}