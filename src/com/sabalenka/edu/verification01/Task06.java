package com.sabalenka.edu.verification01;

        //Табулирование функции по сложному условию
        //Целочисленная функция f(K) = K 3 - 25K 2 +50K+1000 определена только для
        //целых значений аргумента K. Составить программу вычисления значений
        //функции f(K) для 20 значений алгумента K в интервале (-30, 60) с выводом
        //лишь тех значений, которые удовлетворяют заданному условию, и подсчетом
        //количества остальных ее значений. В качестве начальных значений укажите
        //A=3*103, B=6*104, M=4. 
        //Условие для определения выводимых значений f(K)

public class Task06 {
	public static void main(String[] args) {
		
		int A = 3000;
		int B = 60000;
		int M = 4;

		// Вычисление значений T1, T2, T3 и T4
		double T1 = Math.sqrt(A + B + M);
		double T2 = M * Math.sqrt(A + B);
		double T3 = Math.sqrt(A * B * M);
		double T4 = M * Math.sqrt(A * B);

		// Печать значений T
		System.out.printf("T1 = %.6f%n", T1);
		System.out.printf("T2 = %.6f%n", T2);
		System.out.printf("T3 = %.6f%n", T3);
		System.out.printf("T4 = %.6f%n", T4);

		int countNotSatisfying = 0;
		int totalValues = 20;

		System.out.printf("%-10s%-10s%-15s%n", "№", "K", "f(K)");

		// Шаг для аргумента K
		double step = (60 - (-30)) / (double) (totalValues - 1);

		for (int i = 0; i < totalValues; i++) {
			double K = -30 + i * step;
			double fK = calculateF(K);

			// Проверка условия
			if ((fK > T1 && fK < T2) || (fK > T3 && fK < T4)) {
				System.out.printf("%-10d%-10.2f%-15.6f%n", i + 1, K, fK);
			} else {
				countNotSatisfying++;
			}
		}

		System.out.printf("Количество значений, не удовлетворяющих условию: %d%n", countNotSatisfying);
	}

	// Метод для вычисления значения функции f(K)
	public static double calculateF(double K) {
		return Math.pow(K, 3) - 25 * Math.pow(K, 2) + 50 * K + 1000;
	}
}