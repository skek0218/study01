package study01.test14;

public class Person {

	private String name;
	private int age;
	private String addr;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getAddr() {
		return this.addr;
	}
	public String toString() {
		return "[name=" + name + ", age=" + age + ", addr=" + addr + "]"; 
	}
	
}
