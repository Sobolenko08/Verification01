package com.sabalenka.edu.verification01;

import java.util.Scanner;

	//Проверка попадания точки в заданную область
	//Задается n точек на плоскости. Записать логическое выражение,
	//соответствующее заданной области истинности. Подсчитать количество точек,
	//попавших в заданную область.
	

	public class Task04 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Введите количество точек: ");
	        int n = scanner.nextInt();

	       
	        double[] xCoords = new double[n];
	        double[] yCoords = new double[n];

	        // Ввод координат точек
	        for (int i = 0; i < n; i++) {
	            System.out.printf("Введите координаты точки %d (x y): ", i + 1);
	            xCoords[i] = scanner.nextDouble();
	            yCoords[i] = scanner.nextDouble();
	        }

	        // Подсчет количества точек, попавших в заданную область
	        int count = 0;
	        for (int i = 0; i < n; i++) {
	            if (isPointInArea(xCoords[i], yCoords[i])) {
	                count++;
	            }
	        }

	        
	        System.out.printf("Количество точек, попавших в заданную область: %d%n", count);

	        scanner.close();
	    }

	    // Метод для проверки, попадает ли точка в заданную область
	    public static boolean isPointInArea(double x, double y) {
	        boolean inFirstRectangle = (x >= -2 && x <= 2 && y >= 0 && y <= 1);
	        boolean inSecondRectangle = (x >= -1 && x <= 1 && y >= -2 && y <= 0);
	        return inFirstRectangle || inSecondRectangle;
	    }
	}
