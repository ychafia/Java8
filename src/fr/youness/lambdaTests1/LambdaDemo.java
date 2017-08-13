package fr.youness.lambdaTests1;

public class LambdaDemo {

	public static void main(String[] args) {
		/**************************************************/
		Instruments instrument1 = new Saxophone();
		instrument1.jouer();
		/**************************************************/
		Instruments instrument2 = new Instruments() {
			@Override
			public void jouer() {;
				System.out.println("1. Implementation direct V1 ... Pas besoin d'implementer une classe (saxophone) pour utiliser l'interface");
			}
		};
		instrument2.jouer();
		/**************************************************/
		Instruments instrument3 = () -> System.out.println("2. Implementation direct V2 ... avec l'opérateur lambda");
		instrument3.jouer();
	}
}
