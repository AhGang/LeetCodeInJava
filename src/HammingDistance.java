import java.util.Scanner;


public class HammingDistance {
public static int hammingDistance(int x, int y) {
	
	  //对两个十进制数进行模2比较，若不相同，则计数器+1，
	  //对两个数分别除2 然后继续循环，直至两数不大于0
	int distance=0;  
	while(x>0 || y>0){  
	if(x%2!=y%2)  
	distance++;   
	x=x/2;y=y/2;  
	}  
	return distance;  
	}  

     
    
public static void main(String args[]){
	 Scanner sc = new Scanner(System.in);
	 
	 int x = sc.nextInt();
	 int y = sc.nextInt();
	 
	 System.out.println(hammingDistance(x,y));
	 
}
}
