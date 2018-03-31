import java.util.Scanner;
public class Test1 {
	 public static int[] twoSum(int[] nums, int target) {
		    int[] a = new int[2];
		    int x;
		    boolean flag = false;
		    for(int i = 0;i<nums.length;i++){
		    	if(flag){
		    		break;
		    	}
		    	x =nums[i];
		    	a[0] = i;
		    	for(int j = 0;j<nums.length;j++){
		    		if(j==i){
		    			continue;
		    		}
		    		else{
		    			x =x + nums[j];
		    			a[1] =j;
		    			
		    			if(x!=target){
		    				x=nums[i];
		    			}
		    			else{
		    				flag = true;
		    				break;
		    			}
		    		}
		    	}
		    }
		    
		    
		    	 System.out.println(a[0]+","+a[1]);
		    
	      
	        return a;
	    }
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 int nums[] ={3,2,4};
		 int target =sc.nextInt();
		 twoSum(nums,target);
		 sc.close();
		 
	 }
}
