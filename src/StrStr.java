import java.util.Scanner;


public class StrStr {//hello 5  011  3  
public static int strStr(String haystack, String needle) {
	for(int i =0; ; i++){
		for(int j = 0; ; j++){		
			//������needle�ַ��������һλ��Ϊ�˳�ѭ���������������ַ���i��ʼ���ܹ�ƥ�䡣
			if(j==needle.length()){
				return i;
			}
			
			//����haystack��needle�����������Ҳ���ƥ��Ĵ�������-1
			if(i+j==haystack.length()){
				return -1;
			}
			//����haystack���ַ���needle���ַ��Ƿ�ƥ��
			//����ƥ�����˳�ѭ����i++
			if(haystack.charAt(i+j)!=needle.charAt(j)){
				break;
			}
		}
	}
    }
	 public static void main(String args[]){
		 Scanner sc = new Scanner(System.in);
		 String haystack = sc.nextLine();
		 String needle = sc.nextLine();
		 
		 System.out.println(strStr(haystack,needle));
	 }
}
