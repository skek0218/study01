package study01.test07;

class Mother{
	public void cook() {
		System.out.println("재료가 없으니 물에 밥말아 먹어라.");
	}
}
public class Son extends Mother {
	
	/*public Son() {
	 * } //이렇게 암것도 없는걸 기본 생성자라고 함 따로 안만들어도 됨 자바가 만들어줌
	 */
	public void cook() {
		super.cook(); //엄마가 가지고있는 cook 매소드를 불러온다.
		System.out.println("물밥 지겹다. 라면을 끓여 먹겠다."); // 이게 원래 overriding에 개념
	}
	public static void main(String[] args) {
		Son s = new Son(); // Son()이거 생성자, 앞에 대문자 보고 매소드랑 구분하면댐
		s.cook();
	}

}
