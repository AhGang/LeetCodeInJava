import java.util.Scanner;


public class Test476 {
	 public static int findComplement(int num) {
		 //���ַ��������� ����ת���ɶ����Ƶ�ֵ
	        String x = java.lang.Integer.toBinaryString(num);
	        //��StringBuilder����̬�Ĵ洢���ֵĲ���
	        StringBuilder sb = new StringBuilder();
	        for(int i = 0;i<x.length();i++){
	        	if(x.charAt(i)=='1'){
	        		sb.append('0');
	        	}
	        	if(x.charAt(i)=='0'){
	        		sb.append('1');
	        	}
	        }
	        //��StringBuilderתΪ�ַ������ͣ�����ת��Ϊ10���Ƶ����ͣ�
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
