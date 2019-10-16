package study01.test07;

public class ArrayTest {

	public static void main(String[] args) {
		String[] strs = new String[5];
		int[] nums = new int[5];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (i + 1) * 10;
			// strs[i] = Integer.toString(nums[i]);
			strs[i] = nums[i] + ""; // 숫자 더하기 문자하면 문자가 되기때문에 빈 문자열을 더해서 문자로 만들수있음.
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(strs[i]);
		}
	}
}
