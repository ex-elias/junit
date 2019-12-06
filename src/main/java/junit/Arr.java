package junit;

public class Arr {

	public boolean firstLast6(int[] nums) {
		return nums[0] == 6 || nums[nums.length - 1] == 6;
	}

	public int[] front11(int[] a, int[] b) {
		int[] array = {};
		if(a.length > 0 && b.length > 0) {
			array = new int[] {a[0], b[0]};
		} else if(a.length == 0 && b.length > 0) {
			array = new int[] {b[0]};
		} else if(a.length > 0 && b.length == 0) {
			array = new int[] {a[0]};
		}
		return array;
	}

	public int countEvens(int[] nums) {
		int kNum = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] % 2 == 0) {
				kNum++;
			}
		}
		return kNum;
	}

	public boolean tripleUp(int[] nums) {
		int k = 0;
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] - nums[i - 1] == 1) {
				k++;
				if(k == 2) {
					return true;
				}
			} else {
				k = 0;
			}
		}
		return false;
	}

	public String[] fizzBuzz(int start, int end) {
		String[] nums = new String[end - start];
		for(int i = start; i < end; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				nums[i - start] = "FizzBuzz";
			} else if(i % 3 == 0) {
				nums[i - start] = "Fizz";
			} else if(i % 5 == 0) {
				nums[i - start] = "Buzz";
			} else {
				nums[i - start] = String.valueOf(i);
			}
		}
		return nums;
	}

}
