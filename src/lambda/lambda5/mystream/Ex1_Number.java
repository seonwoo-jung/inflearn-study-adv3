package lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import lambda.lambda5.filter.GenericFilter;
import lambda.lambda5.map.GenericMapper;

public class Ex1_Number {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> directResult = direct(numbers);
		System.out.println("directResult = " + directResult);

		List<Integer> lambdaResult = lambda(numbers);
		System.out.println("lambdaResult = " + lambdaResult);
	}

	private static List<Integer> direct(List<Integer> numbers) {
		List<Integer> filtered = new ArrayList<>();

		for (Integer number : numbers) {
			if (number % 2 == 0) {
				filtered.add(number * 2);
			}
		}

		return filtered;
	}

	private static List<Integer> lambda(List<Integer> numbers) {
		List<Integer> filteredList = GenericFilter.filter(numbers, n -> n % 2 == 0);
		return GenericMapper.map(filteredList, n -> n * 2);
	}
}
