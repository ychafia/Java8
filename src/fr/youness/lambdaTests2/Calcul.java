package fr.youness.lambdaTests2;

public class Calcul {
	public static double calculer(double x, double y, Operation operation){
		return operation.calculer(x, y);
	}
}
