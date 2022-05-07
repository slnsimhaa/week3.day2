package week3.day2;

import java.util.ArrayList;
import java.util.Collections;

public class FindSecondLargestNumber {
	public static void main(String[] args) {
		// {3,2,11,4,6,7}
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(11);
		list.add(4);
		list.add(6);
		list.add(7);
		Collections.sort(list);
		System.out.println("The second largest number in the list is " + list.get(4));
	}
}