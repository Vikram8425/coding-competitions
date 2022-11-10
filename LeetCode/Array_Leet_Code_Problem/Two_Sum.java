package LeetCode;

public class Two_Sum {
	public static void main(String arg[]) {
		int a[]= {2,5,5,11},target=10;
		Solution sol=new Solution();
		int b[]=sol.twoSum(a, target);
		System.out.print("[");
		for(int c:b) {
			System.out.print(c+",");
			
		}
		System.out.print("]");
	}
}
class Solution{
	public int[] twoSum(int[] nums, int target) {
        
	       for(int i=0;i<=nums.length-1;i++){
	           for(int j=1;j<nums.length-1;j++){
	               
	               if(nums[i]+nums[j]==target){
	                   return new int[]{i,j};
	               }
	           }
	               
	       }
	       
	       return new int [] {0,0};
    }
}
	        	

