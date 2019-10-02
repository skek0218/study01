package study01.test07;

class Calc{
	private int num1;
	private int num2;
	
	public Calc(int num1, int num2){ //이런식으로 생성자를 통해서 값을 먼저 집어놓도록 강제할수있다(division후에 값을 넣어버리면 에러가날수있기때문)
		this.num1 = num1;
		this.num2 = num2;
	}
	public void add() {
		System.out.println(num1+num2);
	}
	public void minus() {
		System.out.println(num1-num2);
	}
	public void multiple() {
		System.out.println(num1*num2);
	}
	public void division() {
		System.out.println(num1/num2);
	}
}

public class Execute {

	public static void main(String[] args) {
		/*Calc calc = new Calc();
		calc.num1 = 5;
		calc.num2 = 3;
		calc.add();
		Calc calc2 = new Calc();
		calc2.add();*/
		/*Calc[] calcs = new Calc[3]; //이거는 new calc를 3번하는게아니고 calcs 방 3개 메모리를 만드는것이고 초기값이 null이기 때문에 바로 사용할수가없음
		Calc calc = null;
		Calc calc2 = new Calc();
		calc2.add();
		calc.add(); // 이거는 null이라 에러남 (메모리가 없음)
		calcs[0] = new Calc(); // 그래서 21번째라인에서 했어도 이렇게 또 따로 초기화를 해줘야 사용할수있다.
		calcs[0].add();*/
		Calc calc = new Calc(5,2); //이렇게 호출할때 강제로 숫자를 넣게 되어 있다.

		calc.add();
		calc.minus();
		calc.multiple();
		calc.division();
		
	}
}
