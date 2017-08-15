package fr.youness.GroupeBySortCount;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		List<String> mesSports = Arrays.asList("Foot", "Tennis", "Rugby", "Tennis", 
				"Natation", "Volley", "Regby", "Foot", "Athlétisme", "Handball");
		
		Map<String, Long> result = mesSports.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("GroupBy : ");
		System.out.println(result);
		
		System.out.println("* * * * * * * * * *  * *");
		System.out.println("Trier : ");
		
		Map<String, Long> resultFinal = new LinkedHashMap<String, Long>();
		
		result.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue()
                .reversed()).forEachOrdered(e -> resultFinal.put(e.getKey(), e.getValue()));
		
		System.out.println(resultFinal);
	}

}
