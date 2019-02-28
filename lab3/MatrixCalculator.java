public class MatrixCalculator {

	public static void main(String[] args) {
		int [][] matrix1 = {{5,7,2},
				   {1,4,8},
		                   {2,3,4}};
		int [][] matrix2 = {{5,7,2},
		  		   {1,4,8},
                                   {2,3,4}};
		int [][] sum = add(matrix1, matrix2);
		
		
		for (int i = 0; i < sum.length; i++ ) {
				int[] element = sum[i];
				for (int j = 0; j < element.length;j++) {
					System.out.print(element[j] + " ");
		
	}
     }
 }
	
	public static int [][] add(int [][] matrix1,int [][] matrix2) {
		int [][] result = new int[3][3];
		
			for (int i = 0; i < 3 ; i++ ) {
						int[] matrix1row = matrix1[i];
						int[] matrix2row = matrix2[i];
						int[] resultrow = result[i];
						for (int j = 0; j < 3;j++) {
						resultrow[j] = matrix1row[j] + matrix2row[j];
						}
			}
			return result;	
   }
}	


