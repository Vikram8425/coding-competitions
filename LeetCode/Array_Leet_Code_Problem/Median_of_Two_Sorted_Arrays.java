package LeetCode;

public class Median_of_Two_Sorted_Arrays {
	public static void main(String arg[]) {
	  int nums1[]= {};
	  int nums2[]= {1};
	  
	  Solution1 sol=new Solution1();
	  double findMedianSortedArrays = sol.findMedianSortedArrays(nums1, nums2);
	  System.out.println(findMedianSortedArrays);
	}
}

class Solution1{
	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		 int lo=0,hi=nums1.length,n2=nums2.length,n1=nums1.length;
		 int l1,l2,cut1,cut2,r1,r2;
		  if (nums1.length > nums2.length){
	            return findMedianSortedArrays(nums2,nums1);
	        }
		 while(lo<=hi) {
			
			 cut1=lo+(hi-lo)/2 ; 
			 cut2=((nums1.length+nums2.length)/2 - cut1);
			 
			  l1=cut1==0?Integer.MIN_VALUE:nums1[cut1-1];
			  l2=cut2==0?Integer.MIN_VALUE:nums2[cut2-1];
			 
			 r1= cut1==n1?Integer.MAX_VALUE:nums1[cut1];
		     r2= cut2==n2?Integer.MAX_VALUE:nums2[cut2];
			
			if(l1>r2){
				
				hi=cut1-1;
			}
			else if(l2>r1){
			
				lo=cut1+1;
			}else {
				return (nums1.length+nums2.length)%2==0?((float)(Math.max(l1,l2) + Math.min(r1,r2))/2)
						:Math.min(r1,r2);
			}
			 
			 
		 }
		 
	        
		 throw new IllegalArgumentException();
		 
	 }
	 }


//Fail in this test case :
/*
         [1,3]
          [2]
          
        [1,2]
        [3,4]
*/


