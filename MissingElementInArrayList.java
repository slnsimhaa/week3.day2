package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInArrayList {
	public static void main(String[] args) {
		// {1,2,3,4,7,6,8};
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(7);
		list.add(6);
		list.add(8);
		Collections.sort(list);
		System.out.println("Given List: "+list);
		for (int i = 1; i <= list.size(); i++) {
			if (list.get(i - 1) == i) {
				continue;

			} else {
				System.out.println("The missing element in the list is " + i);
				break;
			}
		}
	}

}