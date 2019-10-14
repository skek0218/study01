package study01.test13;

import java.util.ArrayList;

public class ListTest {

	private String[] strs;

	public ListTest() {
		this.strs = new String[0];
	}

	public int size() {
		return strs.length;
	}
	
	
	public void add(String str) {
		String[] tmpStr = this.strs;
		this.strs = new String[strs.length+1];
		this.strs[strs.length-1] = str;
		for (int i=0;i<tmpStr.length;i++) {
			this.strs[i]=tmpStr[i];
		}
	}
	
	public void remove(int i) {
		
	}
	
	public String get(int a) {
		return this.strs[a];
	}
	
	public static void main(String[] args) {
		ListTest lt = new ListTest();
		lt.add("123");
		lt.add("456");
		for (int i=0;i<lt.size();i++) {
			System.out.println(lt.strs[i]);
		}
		System.out.println(lt.get(1));
		
		ArrayList<String> test1 = new ArrayList<String>();

	}
}
