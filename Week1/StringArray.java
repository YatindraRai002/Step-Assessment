import java.util.*;
public class StringArray {
	public static String findLongestName(String[] names) {
		String longest = names[0];
		for (String n : names) if (n.length() > longest.length()) longest = n;
		return longest;
	}
	public static int countNamesStartingWith(String[] names, char letter) {
		int c = 0;
		for (String n : names) if (n.toLowerCase().charAt(0) == Character.toLowerCase(letter)) c++;
		return c;
	}
	public static String[] formatNames(String[] names) {
		String[] arr = new String[names.length];
		for (int i = 0; i < names.length; i++) {
			String[] p = names[i].split(" ");
			arr[i] = p[1] + ", " + p[0];
		}
		return arr;
	}
	public static void main(String[] args) {
		String[] students = {"Rohit", "Virat", "Siraj", "Dhoni", "Jasprit"};
		System.out.println(findLongestName(students));
		System.out.println(countNamesStartingWith(students, 'B'));
		System.out.println(Arrays.toString(formatNames(students)));
	}
}
