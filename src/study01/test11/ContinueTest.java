package study01.test11;

public class ContinueTest {

	public static void main (String[] args) {
		for(int i=1;i<=10;i++) {
			if(i%2==0) continue; //밑에꺼 실행하지 않고 skip시킬떄 사용한다.
			System.out.println(i);
		}
	}
}
