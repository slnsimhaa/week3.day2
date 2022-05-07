package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		// We learn java basics as part of java sessions in java week1
		set.add("We");
		set.add("learn");
		set.add("java");
		set.add("basics");
		set.add("as");
		set.add("part");
		set.add("of");
		set.add("java");
		set.add("sessions");
		set.add("in");
		set.add("java");
		set.add("week1");
		System.out.println(set);
	}
}