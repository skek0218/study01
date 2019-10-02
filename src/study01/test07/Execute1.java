package study01.test07;


public class Execute1 {

	class Calc1{
		int a;
		int b;
		void add() {
			System.out.println(a+b);
		}
		void sub() {
			System.out.println(a-b);
		}
		void mul() {
			System.out.println(a*b);
		}
		void div() {
			System.out.println(a/b);
		}
	}
	public void callCalc() {
		Calc1 cal1 = new Calc1();
		cal1.a = 3;
		cal1.b = 5;
		cal1.add();
		cal1.sub();
		cal1.mul();
		cal1.div();
	}

	public static void main(String[] args) {
		Execute1 e = new Execute1();
		e.callCalc();		
	}
}
