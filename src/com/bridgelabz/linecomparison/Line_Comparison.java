package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class Line_Comparison{
	public static int x1, x2, y1, y2;
	public static double distance;

	public static void main(String[] args) {
		Line_Comparison linecomparison=new Line_Comparison();
		linecomparison.welcome();
		linecomparison.userInput();
		linecomparison.distance();
	}

	public void welcome() {
		System.out.println("Welcome to Line Comparsion Computation Program");
	}

	public  void userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of X1");
		x1 = sc.nextInt();

		System.out.println("Enter the value of X2");
		x2 = sc.nextInt();

		System.out.println("Enter the value of Y1");
		y1 = sc.nextInt();

		System.out.println("Enter the value of Y2");
		y2 = sc.nextInt();
		sc.close();
	}

	public  void distance() {
		distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Length of a line : " + +distance);
	}

}