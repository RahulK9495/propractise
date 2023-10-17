package ArrayMethodPractise;

import java.util.Arrays;

public class AddTwoArrays {

	public static void main(String[] args) {

		int[] nums1 = { 2, 4, 5 };
		int[] nums2 = { 3, 6 };

		int[] res = addArrays(nums1, nums2);

		System.out.println("Added arrays are " + Arrays.toString(res));

	}

	public static int[] addArrays(int[] nums1, int[] nums2) {

		int n = 5;
		int k = 0;

		int[] res = new int[n];

		for (int i = 0; i < nums1.length; i++) {
			res[i] = nums1[i];
		}
		for (int j = nums1.length; j < n; j++) {

			res[j] = nums2[k];
			k++;
		}

		return res;
	}

}
