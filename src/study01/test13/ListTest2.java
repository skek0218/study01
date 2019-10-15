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
	
	public void remove(int a) {
		String[] tmp = this.var;
		this.var = new String[this.var.length-1];
		for (int i=a;i<this.var.length;i++) {
			tmp[i] = tmp[i+1];
		}
		for (int i=0;i<this.var.length;i++) {
			this.var[i] = tmp[i];
		}
	}
	
	public void remove(String a) {
		int b = indexOf(a);
		if (b!=-1) {
			remove(b);
		}
	}
	
	public void set(int a, String b) {
		this.var[a] = b;
	}
	
	public String get(int a) {
		String str = this.var[a];
		return str;
	}
	
	public int indexOf(String a) {
		for (int i=0;i<this.var.length;i++) {
			if (this.var[i].equals(a)) {
				return i;
			}
		}
		return -1;
	}
	
	public String toString() {
		String str ="[";
		for (int i=0;i<this.var.length;i++) {
			str += this.var[i] + ",";
		}
		str = str.substring(0,str.length()-1);
		str += "]";
		return str;
		
	}
	
	public static void main(String[] args) {
		ListTest2 lt2 = new ListTest2();
		lt2.add("123");
		lt2.add("456");
		lt2.add("789");
		lt2.add("012");
		lt2.add("345");
		lt2.add("678");
		/*for (int i=0;i<lt2.var.length;i++) {
			System.out.println(lt2.var[i]);
		}*/
		System.out.println(lt2);
		/*lt2.remove(1);
		lt2.remove(3);
		System.out.println(lt2);*/
		
		
		lt2.set(1, "444");
		System.out.println(lt2);
		System.out.println(lt2.get(1));
		System.out.println(lt2.indexOf("444"));
		lt2.remove("444");
		System.out.println(lt2);
		//substring(int) int번째 값부터 가져옴 하지만 변수 자체에 값에 영향을 주지는 않음 그냥 일시용이라고 볼 수 있을듯
		//substring(int, int)로 쓰면 앞에 int는 시작값 뒤에 int는 종료값 예)2,3으로쓰면 2번방부터 3번방앞까지(3번방 미포함)
	}
}
