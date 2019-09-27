package study01.test01;

public class ArrayTest2 {
	public static void main(String[] args) {
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (i+1)*10;
			System.out.println(nums[i]);
		}
	}
}
