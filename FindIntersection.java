package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
	public static void main(String[] args) {
		// {3,2,11,4,6,7}
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(3);
		list1.add(2);
		list1.add(11);
		list1.add(4);
		list1.add(6);
		list1.add(7);
		System.out.println("List 1: " + list1);

		// {1,2,8,4,9,7}
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(1);
		list2.add(2);
		list2.add(8);
		list2.add(4);
		list2.add(9);
		list2.add(7);
		System.out.println("List 2: " + list2);
		System.out.println("Both Lists has below equal numbers");
		for (int i = 0; i < list1.size(); i++) {
			if (list2.contains(list1.get(i))) {
				System.out.println(list2.get(i));

			}

		}
	}
}