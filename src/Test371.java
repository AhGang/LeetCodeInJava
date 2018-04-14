import java.util.Scanner;


public class Test371 {
	 public static int getSum(int a, int b) {
		   //按位取异或
		    int result = a^b;
		    //判断是否需要进位
	        int forward = (a&b) <<1;
	        if(forward!=0){
	        	//如有进位，则将二进制数左移一位，进行递归
	        	return getSum(result,forward);
	        }
	        return result;
	    }
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 int num1 = sc.nextInt();
		 int num2 = sc.nextInt();
		 System.out.println(5>>1);
		 getSum(num1,num2);
		 sc.close();
	 }
}
