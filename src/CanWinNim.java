import java.util.Scanner;


public class CanWinNim {
public static boolean canWinNim(int n) {
	//0取余仍为0，只要每次留给对方的棋子无法一次取尽就能获胜
	if ((n - 1) % 4 == 0 || (n - 2) % 4 == 0 || (n - 3) % 4== 0) return true;       
    else return false;      
	//return n % 4 != 0;
    }
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n =sc.nextInt();
	System.out.println((n-1)%4);
	System.out.println((n-2)%4);
	System.out.println((n-3)%4);
	System.out.println(canWinNim(n));
	
}
}
