import java.util.Scanner;


public class HammingDistance {
public static int hammingDistance(int x, int y) {
	
	  //������ʮ����������ģ2�Ƚϣ�������ͬ���������+1��
	  //���������ֱ��2 Ȼ�����ѭ����ֱ������������0
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
