package ArrayMethodPractise;

import java.util.Arrays;

public class FilterEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = { 2, 4, 5, 7, 8, 12 };

		int[] result = filterEvenNumbers(nums);

		System.out.println("Filtered Array is " + Arrays.toString(result));
	}

	public static int[] filterEvenNumbers(int[] nums) {

		int anothercounter = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				anothercounter++;
			}
		}
		int[] res = new int[anothercounter];

		int counter = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				res[counter] = nums[i];
				counter++;
			}
		}

		return res;
	}

}
