package study01.test08;

class Cat {

	public void sleep() {
		System.out.println("고양이가 잡니다.");
	}
}

public class KoShort extends Cat {

	public void sleep() {
		System.out.println("코숏 고양이가 잡니다.");
	}

	public static void main(String[] args) {

		Cat ks = new KoShort();
		ks.sleep(); // 이거는 koshort를 읽을 때 먼저 Cat으로 가는데 거기서 sleep을 읽고 메모리 생성을 하는데 거기에 Koshort에 있는
					// sleep 이 덮어지기때문에 Cat에 sleep을 호출해도 Koshort에 sleep 이 호출됨
		
		Cat[] cats = new Cat[4];
		cats[0] = new Cat();
		cats[1] = new KoShort();
		cats[0].sleep();
		cats[1].sleep();
		
	}
}
