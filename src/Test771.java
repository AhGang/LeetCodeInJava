import java.util.Scanner;


public class Test771 {
public static int numJewelsInStones(String J, String S) {
       
        
        int count = 0;
        for(int i = 0;i<J.length();i++){
        	String x = J.substring(i, i+1);
        	
        	for(int j = 0;j<S.length();j++){
        		String y = S.substring(j, j+1);
        		if(x.equals(y)){
        			count++;
        		}
        	}
        }
        return count;
    }
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    String type = sc.nextLine();
   
    String stone = sc.nextLine();
    System.out.print(numJewelsInStones(type,stone));
    sc.close();
}
}
