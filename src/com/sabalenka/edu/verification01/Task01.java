package com.sabalenka.edu.verification01;

public class Task01 {
	public static void main(String[] args) {

		// Написать приведенную формулу по правилам языка программирования.

		double x = 0.5;

		// Первое выражение: sqrt(e^(2.2x))
		double first = Math.sqrt(Math.exp(2.2 * x));

		// Второе выражение: sin(pi * x / (x + 2/3))
		double second = Math.sin(Math.PI * x / (x + 2.0 / 3.0));

		// Абсолютное значение второго выражения
		double absoluteSecond = Math.abs(second);

		// Сумма
		double result = first - absoluteSecond + 1.7;

		// Результат
		System.out.printf("Результат: %.5f%n", result);
	}
}
