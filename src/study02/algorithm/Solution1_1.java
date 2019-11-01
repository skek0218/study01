package study02.algorithm;

public class Solution1_1 {

	    public boolean solution(String[] phone_book) {
	        boolean answer = true;
	        for (int i=0;i<phone_book.length;i++){
	            for (int j=i+1;j<phone_book.length;j++){
	                if (phone_book[i].equals(phone_book[j])){
	                    answer = false;
	                }else {answer=true;}
	            }
	    }return answer;
	}
	  
	    public static void main (String[] args) {
	    	String[] strs = new String[3];
	    	strs[0] = "119";
	    	strs[1] = "97674223";
	    	strs[2] = "1195524421";
	    	Solution1_1 s = new Solution1_1();
	    	System.out.println(s.solution(strs));
	    }
}
