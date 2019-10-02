package study01.test06;

public class MethodTest2 {

	int num;
	double num2;
	
	int getNum() {
		System.out.println(num);
		int num = 3;
		System.out.println(num);
		System.out.println(this.num); //this.을 통해서 5번라인에있는 넘을 불러올수있음
		return 1;
	}
	
	public static void main (String[] args) {

		MethodTest2 mt2 = new MethodTest2(); //이 때 5번에 int num이 0으로 초기화됨 
		mt2.getNum();
		
	}
}
