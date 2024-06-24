package com.sabalenka.edu.verification01;

//Табулирование функции двух переменных

//Составить программу вычисления таблицы значений заданной функции для
//N значений X, меняющихся от Xнач c заданных шагом HX, и M зачений для Z,
//меняющихся от Zнач с шагом HZ.

public class Task07 {
	public static void main(String[] args) {
		
		
		double X_start = 2.0; 
		double Z_start = 0.5; 
		double step_X = 0.5; 
		double step_Z = 0.5; 
		int N = 5; 
		int M = 5; 

		System.out.printf("%-10s%-10s%-15s%n", "X", "Z", "f(X, Z)");

		// Цикл по значениям X
		
		for (int i = 0; i < N; i++) {
			double X = X_start + i * step_X;

			// Цикл по значениям Z
			
			for (int j = 0; j < M; j++) {
				double Z = Z_start + j * step_Z;

				// Вычисление значения функции
				
				double f = calculateFunction(X, Z);

				
				System.out.printf("%-10.2f%-10.2f%-15.6f%n", X, Z, f);
			}
		}
	}

	// Метод для вычисления значения функции
	public static double calculateFunction(double x, double z) {
		double numerator = Math.sqrt(z * z + x * x) * Math.log(z) + Math.abs(Math.log(z));
		double denominator = Math.sqrt(x * x - z * z + 3.2);
		return numerator / denominator;
	}
}