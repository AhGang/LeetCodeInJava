import java.util.Scanner;


public class Test476 {
	 public static int findComplement(int num) {
		 //用字符串来保存 整形转换成二进制的值
	        String x = java.lang.Integer.toBinaryString(num);
	        //用StringBuilder来动态的存储数字的补数
	        StringBuilder sb = new StringBuilder();
	        for(int i = 0;i<x.length();i++){
	        	if(x.charAt(i)=='1'){
	        		sb.append('0');
	        	}
	        	if(x.charAt(i)=='0'){
	        		sb.append('1');
	        	}
	        }
	        //将StringBuilder转为字符串类型，并且转换为10进制的整型；
	        int result =Integer.parseInt(sb.toString(),2);
	        return result;
	    }
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 System.out.println(findComplement(num));
		 sc.close();
	 }
}
