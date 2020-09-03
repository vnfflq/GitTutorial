package github.test.co.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ApiAction {

	public static void main(String[] args) {
		
		String str = "a";
		errorTestMethod(str);
	}

	private static ApiTestBean errorTestMethod(String str) {

		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(1);
		intList.add(2);
		
		List<Integer> intList2 = new ArrayList<>(new HashSet<>(intList));
		intList2.forEach(cp -> {
			System.out.println(cp);
		});
		
		return null;
	}
	
}
