package study01.test13;

public class ListTest2 {

	private String[] var;
	
	public ListTest2() {
		var = new String[0];
	}
	
	public int size() {
		return this.var.length;
	}
	
	public void add(String a) {
		String[] tmp = this.var;
		this.var = new String[this.var.length+1];
		this.var[this.var.length-1] = a;
		for (int i=0;i<tmp.length;i++) {
			this.var[i] = tmp[i];
		}
	}
	
	public static void main(String[] args) {
		ListTest2 lt2 = new ListTest2();
		lt2.add("123");
		lt2.add("456");
		lt2.add("789");
		for (int i=0;i<lt2.var.length;i++) {
			System.out.println(lt2.var[i]);
		}
	}
}
