package study01.test11;

public class Execute {

	public static void main(String[] args) {
		Remote r = new TvRemocon(); // Remote라는 interface로 메모리 생성은 할수 없지만, 데이터 타입으론 사용할수 있다.
									// (TvRemocon으로 메모리를 생성할 수 있는 이유는 그 클래스가 Remote interface를 implement받았기 때문)
		r.on();
		Remote r2 = new AirconRemocon();
		r2.on();

		// 이거는 switch 문
		int age = 10;
		switch (age) {
		case 10:
			System.out.println("10살 이하");
			break;
		case 20:
			System.out.println("20살 이하");
			break;
		case 30:
			System.out.println("30살 이하");
			break;
		default:
			System.out.println("31살 이상");
			break;
		}
	}
}
