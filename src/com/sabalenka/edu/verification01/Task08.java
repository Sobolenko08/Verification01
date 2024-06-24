package com.sabalenka.edu.verification01;

//Сложное условие завершения цикла

//Составить программу, вычисляющую значения функции до тех пор, пока не
//будет пройден нуль функции. Значения аргумента x должны составлять
//возрастающую арифметическую програссию с заданным начальным членом
//0.1 и разностью 0.1. Для того, чтобы не произошло зацикливания, установить
//предел изменения аргумента x = 10.


public class Task08 {
	public static void main(String[] args) {
		double x = 0.1;
		double step = 0.1;
		double max_x = 10.0;

		 // Вывод значения x и f(x)
		System.out.printf("%-10s%-15s%n", "x", "f(x)");

		while (x <= max_x) {
			double fx = calculateFunction(x);

			System.out.printf("%-10.2f%-15.6f%n", x, fx);

			 // Проверка условия завершения цикла
			if (fx == 0 || (fx > 0 && calculateFunction(x - step) < 0) || (fx < 0 && calculateFunction(x - step) > 0)) {
				System.out.println("Нуль функции пройден.");
				break;
			}

			x += step;
		}
	}

	 // Метод для вычисления значения функции
	public static double calculateFunction(double x) {
		return x * x - Math.exp(2 * x) + 4;
	}

}
