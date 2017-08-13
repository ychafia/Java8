package fr.youness.mestests;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List listMois = new ArrayList<>();
		listMois.add("Janvier");
		listMois.add("Fevrier");
		listMois.add("Mars");
		listMois.add("Avril");
		listMois.add("Mai");
		listMois.add("Juin");
//		for (int i = 0; i < listMois.size(); i++) {
//		  System.out.println(listMois.get(i));
//		}
		listMois.forEach(System.out::println);
	}

}
