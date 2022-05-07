package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInList {

	public static void main(String[] args) {
		// {14,12,13,11,15,14,18,16,17,19,18,17,20}
		List<Integer> list = new ArrayList<Integer>();
		list.add(14);
		list.add(12);
		list.add(13);
		list.add(11);
		list.add(15);
		list.add(14);
		list.add(18);
		list.add(16);
		list.add(17);
		list.add(19);
		list.add(18);
		list.add(17);
		list.add(20);
		System.out.println("List: " + list);
		System.out.println("Duplicate values in the list are given below");
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < list.size(); i++) {
			if (set.contains(list.get(i))) {
				System.out.println(list.get(i));
			} else {
				set.add(list.get(i));
			}
		}
	}
}