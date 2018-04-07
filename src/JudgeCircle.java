import java.util.Scanner;


public class JudgeCircle {
public static boolean judgeCircle(String moves) {
	 int x = 0,y = 0;
	 for(int i = 0;i<moves.length();i++){
		 char move= moves.charAt(i);
		 if(move=='R'){
			 x++;
		 }
		 if(move=='L'){
			 x--;
		 }
		 if(move=='U'){
			 y++;
		 }
		 if(move=='D'){
			 y--;
		 }
		 
	 }
	 
	 if(x!=0||y!=0){
		 return false;
	 }
	 else{
		return true; 
	 }
             
    }
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String moves = sc.nextLine();
	System.out.println(judgeCircle(moves));
	
	}
}

