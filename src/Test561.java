
import java.util.Arrays;
import java.util.Scanner;


public class Test561 {
public static int arrayPairSum(int[] nums) {
	
	Arrays.sort(nums);
    for(int i = 0;i<nums.length;i++){
		
			System.out.println(nums[i]);
		}
	int  result = 0;
	for(int i = 0;i<nums.length;i++){
		if(i==0||i%2==0){
			result += nums[i];
		}
			 
		
	}
	return result;
    }
public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
	 int[] nums = {4,3,5,1};
	 System.out.println(arrayPairSum(nums));
	 sc.close();
}
}
