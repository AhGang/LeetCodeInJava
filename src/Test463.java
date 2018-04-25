import java.util.Scanner;

public class Test463 {
	 public static int islandPerimeter(int[][] grid) {
		 int result = 0;
		 int n = grid.length;
		 int m = grid[0].length;
		 for(int i =0;i<n;i++){
			 for(int j = 0;j<m;j++){
				 if(grid[i][j] == 1){
	                 if(i==0 || grid[i-1][j] == 0) result++;//��һ��/��һ��
	                 if(i==n-1 || grid[i+1][j] == 0) result++;//���һ��/��һ��
	                 if(j==0 || grid[i][j-1] == 0) result++;//��һ��/��һ��
	                 if(j==m-1 || grid[i][j+1] == 0) result++;//���һ��/��һ��
	                }	 
			 }
		 }
		 return result;
	    }
	 public static void main(String[] args){
			Scanner sc =new Scanner(System.in);
			int a[][]= {{0,1,0,0},
			            {1,1,1,0},
			            {0,1,0,0},
			            {1,1,0,0}};
			
			System.out.println( islandPerimeter(a));
		}
}
