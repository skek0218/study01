package study01.test11;

public interface Remote {
	/*
	 * Remote(){ //interface 에서는 생성자는 만들수가 없다 } 인터페이스내에서 몸통 생성할수있는 방법 2가지 static,
	 * default(이건 우리가 아는 default랑은 다름 접근제어자느낌이아님)
	 */
	public void on();

	public void off();

}
