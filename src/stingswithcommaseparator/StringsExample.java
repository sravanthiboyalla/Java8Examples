package stingswithcommaseparator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> commaSeparated=Arrays.asList("Mercury", "Venus", "Mars");
		String listOfPlanets=commaSeparated.stream().collect(Collectors.joining(","));
		System.out.println("planets :"+listOfPlanets);
	}

}
