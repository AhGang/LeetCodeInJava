import java.util.Scanner;


public class ReverseWords {
	 public static String reverseWords(String s) {
		 //���ַ����Կո�ָ�תΪ�ַ�������
		  String[] splited = s.split(" ");
		  //�������� ������StringBuffer ��ÿ�����ַ�����ת��
		 for(int i = 0;i<splited.length;i++){	
			 StringBuffer sb=new StringBuffer(splited[i]); 
 
			 splited[i] = sb.reverse().toString();
			 
		 }
		 //����StringBuffer���ַ�������תΪ�ַ���
		 StringBuffer sb = new StringBuffer();
		  for(int i=0;i<splited.length;i++){
			  if(i!=splited.length-1){
				  sb.append(splited[i]+" ");
			  }
			  else{
				  sb.append(splited[i]);
			  }
			  
		  }
	        return sb.toString();
	    }
	 public static void main(String args[]){
		 Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			reverseWords(str);
	 }
}
