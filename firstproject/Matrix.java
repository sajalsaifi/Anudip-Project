package firstproject;

public class Matrix {

	public static void main(String[] args) {
		 int rows = 3, columns = 3;
	        int[][] arr1 = { {10, 20, 30}, 
	                         {40, 50, 60},
	                         {70, 80, 90} };
	        int[][] arr2 = { {1, 2, 3},
	        		         {4, 5, 6},
	        		         {7, 8, 9} };

	        // Adding Two matrices
	        int[][] add = new int[rows][columns];
	        for(int i = 0; i < rows; i++)
	        {
	            for (int j = 0; j < columns; j++)
	            {
	                add[i][j] = arr1[i][j] + arr2[i][j];
	            }
	        }

	        // Resultant array
	        System.out.println("Addition of two matrices is: ");
	        for(int[] row : add) 
	        {
	            for (int column : row)
	            {
	                System.out.print(column + "  ");
	            }
	            System.out.println();
	        }


	}

}
