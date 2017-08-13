package fr.youness.filters;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AvantJava8 {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add(0, "Pomme");
		fruits.add(1, "Poire");
		fruits.add(2, "Peche");
		
		Iterator<String> itFruits = fruits.listIterator();
		while(itFruits.hasNext()){
			System.out.println(itFruits.next());
		}
		
		List<String> fruitsFiltrer = filtrer(fruits, "Pomme");
		Iterator<String> itfruitsFiltrer = fruitsFiltrer.listIterator();
		while(itfruitsFiltrer.hasNext()){
			System.out.println(itfruitsFiltrer.next());
		}
	}
	
	public static List<String> filtrer(List<String> list, String str){
		List<String> uneListe = new ArrayList<String>();
		for(String el : list){
			if(!str.equals(el)) {
				uneListe.add(el);
			}
		}
		return uneListe;
	}
}
