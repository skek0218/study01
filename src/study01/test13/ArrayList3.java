package study01.test13;

public class ArrayList3 {

	private String[] var;
	
	public ArrayList3(){
		var = new String[0];
	}
	
	public int size() {
		return this.var.length;
	}
	
	public void add(String s) {
		String[] temp = this.var;
		this.var = new String[this.var.length+1];
		for (int i=0;i<temp.length;i++) {
			this.var[i] = temp[i];
		}
		this.var[this.var.length-1] = s;		
	}
	
	public void remove(int a) {
		String[] temp = this.var;
		this.var = new String[this.var.length-1];
		for (int i=a;i<this.var.length;i++) {
			temp[i] = temp[i+1];
		}
		for (int i=0;i<this.var.length;i++) {
			this.var[i] = temp[i];
		}
	}
	
	public int indexOf(String s) {
		for (int i=0;i<this.var.length;i++) {
			if (this.var[i].equals(s)) {
				return i;
			}
		}
		return -1;
	}
	
	public void set(int a, String s) {
		this.var[a] = s;
	}
	
	public String get(int a) {
		return this.var[a];
	}
	
	public String toString() {
		String str = "[";
		for (int i=0;i<this.var.length;i++) {
			str += this.var[i] + ",";
		}
		str = str.substring(0,str.length()-1);
		str += "]";
		return str;
	}
	
	
	public static void main(String[] args) {
		ArrayList3 list3 = new ArrayList3();
		list3.add("123");
		list3.add("456");
		list3.add("789");
		list3.add("abc");
		list3.add("def");
		list3.add("ghi");
		list3.remove(2);
		list3.set(0,"012");
		System.out.println(list3);
		System.out.println(list3.indexOf("000"));
		System.out.println(list3.get(4));
	}
}
