package com.sabalenka.edu.verification01;

public class Task03 {
	public static void main(String[] args) {
		
		 //Накопление сумм произведений
		
		//Накопление сумм произведений
		//Составить программу для вычисления результат по формуле. В качестве
		//входных параметров задать x = 0.5; n = 20;
		
		double x = 0.5;
		int n = 20;

		// Вычисление результата по формуле
		double result = calculateSum(x, n);

		
		System.out.printf("Результат: %.6f%n", result);
	}

	public static double calculateSum(double x, int n) {
		double sum = 0.0;

		for (int k = 1; k <= n; k++) {
			double numerator = Math.sin(k * x / 2) + Math.sin((k * x - 1) / 2);
			double denominator = Math.exp(x - 1.0 / k);
			sum += numerator / denominator;
		}

		return Math.sqrt(n * Math.PI) * sum;
	}
}
