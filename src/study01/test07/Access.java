package study01.test07;

class Cat { // plain old java object 에 기본 방식이라 이렇게 쓴다고 함;; 왜 그러는지 이해는 안됨;;
	private int age;
	private String name;
	private String type;

	public void setAge(int age) { // 입력만 하는 메쏘드로 만든것 원칙상 다른걸 넣지 않는다 입력창만 만들것 절대 로직을 넣지않는것
		this.age = age;
	}

	public int getAge() { // return만 하는 메쏘드
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
}

public class Access {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.setAge(5);
		c.getAge();
		c.setName("고양이");
		c.getName();
		c.setType("페르시안");
		c.getType();
		System.out.println(c.getAge());
		System.out.println(c.getName());
		System.out.println(c.getType());

	}
}
