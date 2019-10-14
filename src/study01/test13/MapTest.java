package study01.test13;

public class MapTest {

	private String[] keys;
	private String[] values;
	
	public MapTest() {
		keys = new String[0];
		values = new String[0];
	}
	
	public int size() {
		return this.keys.length;
	}
	
	private void copy() {
		String[] tmpKeys = this.keys;
		String[] tmpValues = this.values;
		this.keys = new String[this.keys.length+1];
		this.values = new String[this.values.length+1];
		for(int i =0;i<tmpKeys.length;i++) {
			this.keys[i] = tmpKeys[i];
			this.values[i] = tmpValues[i];
		}
		
	}
	
	public void put(String key, String value) {
		this.copy();
		this.keys[this.keys.length-1]= key;
		this.values[this.values.length-1] = value;
	}
	
	public String toString() {
		String rStr="{";
		for(int i=0;i<this.keys.length;i++) {
			rStr += this.keys[i] + "=" + this.values[i] + ",";
		}
		rStr=rStr.substring(0,rStr.length()-1);
		rStr+="}";
		return rStr;
	}
	
	public static void main(String[] args) {
		MapTest mt = new MapTest();
		mt.put("11", "1111");
	}
}
