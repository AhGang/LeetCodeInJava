import java.util.Scanner;


public class ReverseWords {
	 public static String reverseWords(String s) {
		 //将字符串以空格分割转为字符串数组
		  String[] splited = s.split(" ");
		  //遍历数组 ，利用StringBuffer 将每个子字符串倒转；
		 for(int i = 0;i<splited.length;i++){	
			 StringBuffer sb=new StringBuffer(splited[i]); 
 
			 splited[i] = sb.reverse().toString();
			 
		 }
		 //利用StringBuffer将字符串数组转为字符串
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
