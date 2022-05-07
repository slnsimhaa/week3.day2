package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnLists {
	public static void main(String[] args) {
		// [1,2,3,1,4,5,1,6] - How many no of 1?
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("1");
		list.add("4");
		list.add("5");
		list.add("1");
		list.add("6");
		int count = 0;
		String occ = "1";
		for (int i = 0; i < list.size(); i++) {
			String a = list.get(i);
			if (a.equals(occ)) {
				count++;
			}
		}
		System.out.println("Count of '1' in the list is " + count);

		// [A,B,C,D,E,A,G,F,C] - Duplicate value of this -> A,C
		List<String> list1 = new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		list1.add("E");
		list1.add("A");
		list1.add("G");
		list1.add("F");
		list1.add("C");
		for (int i = 0; i < list1.size(); i++) {
			String a = list1.get(i);
			int k = i + 1;
			for (int j = k; j < list1.size(); j++) {
				String b = list1.get(j);
				if (a.equals(b)) {
					System.out.println("The Duplicate value in the list is " + b);
					break;
				}
			}
		}
	}
}