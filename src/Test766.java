import java.util.Scanner;


public class Test766 {
	   public static boolean isToeplitzMatrix (int[][] matrix) {  
	        for (int i = 0; i < matrix.length - 1; i++) {  //3
	            for (int j = 0; j < matrix[i].length - 1; j++) { //4 
	                if (matrix[i][j] != matrix[i + 1][j + 1]){
	                	return false;
	                }            	  
	            }  
	        }  
	        return true;  
	    } 
	 public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
		    int[][] matrix = {{1,2,3,4},
		    		{5,1,2,3},
		    		{9,5,1,2}};
		   
		    System.out.print(matrix[1].length);
		    sc.close();
		}
}
