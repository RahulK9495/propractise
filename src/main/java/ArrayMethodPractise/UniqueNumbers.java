package ArrayMethodPractise;

import org.bouncycastle.util.Arrays;

public class UniqueNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]nums = {2,4,5,2,3};
		
		int[]result = filterUniqueNumbers(nums);
		
		for(int r:result)
		{
			System.out.println(r);
		}
	}

	public static int[] filterUniqueNumbers(int[]nums) {
		int res[]=new int[nums.length];
		int k=0;
		int j=0;
		int n=nums.length;
		int flag=0;
		for(int i=0; i<n; i++)
		{
			for( j=i+1; j<n; j++)
			{
				if(nums[i]==nums[j])
				break;
				flag=1;
			}
			if(flag==0)
			{
				res[k]=nums[j];
			}
		}
		
		
		return res;
	}

}
