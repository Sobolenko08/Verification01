package com.sabalenka.edu.verification01;

public class Task02 {
	public static void main(String[] args) {
		
		//Вычисление таблицы значений функции одного аргумента

		// Составить программу вычисления значений функции f(x) из задачи 1 для n
		// значений аргумента x, равномерно распределенных на отрезке [a, b]. Для
		// проверки программы задать n = 10; a = 0.50; b = 1.00. Результаты выдать в
		// виде
		// таблицы, в каждой строке порядковый номер, значение аргумента и значение
		// функции с шестью знаками после запятой.

		
		double a = 0.50;
		double b = 1.00;
		int n = 10;

		// Шаг между значениями x
		double step = (b - a) / (n - 1);

		
		System.out.printf("%-10s%-15s%-15s%n", "№", "x", "f(x)");

		// Вычисляем и выводим значения функции для каждого x
		for (int i = 0; i < n; i++) {
			double x = a + i * step;
			double fx = calculateFromTask01(x);
			System.out.printf("%-10d%-15.6f%-15.6f%n", i + 1, x, fx);
		}
	}

	// Метод для вычисления значения функции f(x)
	public static double calculateFromTask01(double x) {
		double first = Math.sqrt(Math.exp(2.2 * x));
		double second = Math.sin(Math.PI * x / (x + 2.0 / 3.0));
		double absoluteSecond = Math.abs(second);
		return first - absoluteSecond + 1.7;
	}
}
