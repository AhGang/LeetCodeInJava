import java.util.Scanner;


public class Test371 {
	 public static int getSum(int a, int b) {
		   //��λȡ���
		    int result = a^b;
		    //�ж��Ƿ���Ҫ��λ
	        int forward = (a&b) <<1;
	        if(forward!=0){
	        	//���н�λ���򽫶�����������һλ�����еݹ�
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
