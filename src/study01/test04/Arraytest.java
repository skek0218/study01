package study01.test04;

import java.util.Random;

public class Arraytest {

	public static void main(String[] args) {
		int[] nums = new int[6];
	
		//System.out.println(nums.length);
		/*long l = 12345678912l; // 기본 자료형이 int 기 때문에 int범위가 넘어가는 숫자는 long 으로  쓸때 뒤에 l을 붙여줘야함
		
		double db = 1.1;
		float f = 1.1f; // 이것도 기본 자료형이  double이기때문에 float을 쓸때는 float이라고 알려주기위해 뒤에 f를 붙여줘야됨*/
		
		Random r = new Random();
		for(int i=0;i<nums.length;i++) {
			nums[i]= r.nextInt(45)+1;
			for (int j=i-1;j>=0;j--) {
				if(nums[i]==nums[j]) {
					i--; //이걸 통해서 i번쨰 방과 j번쨰방(그 전방들)비교 후 i를 마이너스 해서 큰 for문 떄 i++로 다시 같은방으로 돌아감
					break;
				}
			}
		}
	}
}
