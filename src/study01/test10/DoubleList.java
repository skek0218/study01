package study01.test10;

import java.util.ArrayList;
import java.util.Random;

public class DoubleList {
	
	public static void main(String[] args) {
		Random a = new Random();
		
		ArrayList<String> strList = new ArrayList<String>();
		ArrayList<Double> doubleList = new ArrayList<Double>();
		//입력부
		for (int i=0;i<10;i++) {
			
			strList.add(a.nextInt(100) + "." + a.nextInt(10));
			doubleList.add(Double.parseDouble(strList.get(i)));
		}
	
		
		//정렬부
		for (int i=0;i<doubleList.size();i++) {
			for (int j=i+1;j<doubleList.size();j++) {
				if (doubleList.get(i)>doubleList.get(j)) {
					double temp = doubleList.get(i);
					doubleList.set(i, doubleList.get(j));
					doubleList.set(j, temp);		
				}
			}
		}
		//출력부
		for (int i=0;i<10;i++) {
			System.out.println(doubleList.get(i));
		}	
	}
}
