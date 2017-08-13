package fr.youness.lambdaTests2;

public class Application {

	public static void main(String[] args) {
		/*************************************************************/
		//On alloue de la mémoire ( new Addition() ) pour chaque opération.
		double result = Calcul.calculer(5, 9, new Addition());
		System.out.println("Le résultat de l'addition est : " + result);
		
		result = Calcul.calculer(5, 9, new Multipilcation());
		System.out.println("Le résultat de l'addition est : " + result);
		
		
		/*****************************Les expressions lambda********************************/
		//Pas d'allocation de mémoire pour chacune des opérations.
		// Definition de fonctions anonymes, à la volée.
		Operation soustraction = (x, y) -> x + y;
		
		result = soustraction.calculer(10, 5);
		System.out.println("Le résultat de la soustraction est : " + result);
		
		Operation division = (x, y) -> {
			if (x==0 || y==0) {return 0;}
			else {return x/y;}
		};
		result = division.calculer(7, 9);
		System.out.println("Le résultat de la division est : " + result);
	}

}
