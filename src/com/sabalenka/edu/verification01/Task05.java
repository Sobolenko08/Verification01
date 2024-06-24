package com.sabalenka.edu.verification01;

	
	//Вычисление таблицы значений функции одногоаргумента с выбором формулы
	//Составить программу вычисления N значений функции Y для X,
	//изменяющегося от X1 с шагом dX. В качестве начальных значений выбрать A=1;
	//X1=-2A; dX = A/5.
	
	public class Task05 {
	    public static void main(String[] args) {
	        
	        double A = 1;
	        double x1 = -2 * A;
	        double dX = A / 5;
	        int N = 10; 

	        
	        System.out.printf("%-10s%-15s%-15s%n", "№", "x", "y");

	        // Вычисление значений функции
	        for (int i = 0; i < N; i++) {
	            double x = x1 + i * dX;
	            double y = calculateY(x, A);
	            System.out.printf("%-10d%-15.6f%-15.6f%n", i + 1, x, y);
	        }
	    }

	    // Метод для вычисления значения функции
	    public static double calculateY(double x, double A) {
	        if (x <= 0) {
	            return (A / 2) * (Math.exp(x / A) + Math.exp(-x / A));
	        } else {
	            return (4 * Math.pow(A, 3)) / (Math.pow(x, 2) + 4 * Math.pow(A, 2));
	        }
	    }
	}
