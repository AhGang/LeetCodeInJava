import java.util.Scanner;


public class Test806 {
	 public static int[] numberOfLines(int[] widths, String S) {
		 int result[] = {1,0};
		 int x = 0;
		 
		 for(int i = 0;i<S.length();i++){
			 int a =S.charAt(i) - 'a';
			 if((result[1]+widths[a])>100){
				 result[0]++;
				 result[1]=0; 
				 result[1]+=widths[a]; 
			 }
			 else{
				 result[1]+=widths[a]; 
			 }
			 	 
			 if(result[1]>=100){
             	result[0]++;
             	result[1]=result[1]-100;
             }
			 
		 }
		
		 System.out.println(result[0]+" "+result[1]);
		 
		 return result;
	    }
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 String s = sc.nextLine();
		 int widths[] = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
		 numberOfLines(widths,s);
		 sc.close();
	}
}
