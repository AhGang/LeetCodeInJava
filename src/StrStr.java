import java.util.Scanner;


public class StrStr {//hello 5  011  3  
public static int strStr(String haystack, String needle) {
	for(int i =0; ; i++){
		for(int j = 0; ; j++){		
			//检索完needle字符串的最后一位仍为退出循环，即所包含的字符从i开始都能够匹配。
			if(j==needle.length()){
				return i;
			}
			
			//若将haystack和needle都遍历完仍找不到匹配的串，返回-1
			if(i+j==haystack.length()){
				return -1;
			}
			//检索haystack的字符与needle的字符是否匹配
			//若不匹配则退出循环，i++
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
