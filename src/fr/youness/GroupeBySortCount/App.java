package fr.youness.GroupeBySortCount;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		List<String> mesSports = Arrays.asList("Foot", "Tennis", "Rugby", "Foot", 
				"Natation", "Volley", "Regby", "Foot", "Athlétisme", "Handball");
		
		Map<String, Long> result = mesSports.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(result);
	}

}
