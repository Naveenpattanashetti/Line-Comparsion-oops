package com.bridgelabz.linecomparison;

import java.util.Scanner;

public class Line_Comparison{
	public  int x1, x2, x3, x4, y1, y2, y3, y4;
	public  double distance1, distance2;

	public static void main(String[] args) {
		Line_Comparison linecomparison=new Line_Comparison();
		linecomparison.welcome();
		linecomparison.userInput();
		linecomparison.distance();
		linecomparison.compareTo();
	}

	public void welcome() {
		System.out.println("Welcome to Line Comparsion Computation Program");
	}

	public  void userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("For line 1");

		System.out.println("Enter the value of X1");
		x1 = sc.nextInt();

		System.out.println("Enter the value of X2");
		x2 = sc.nextInt();

		System.out.println("Enter the value of Y1");
		y1 = sc.nextInt();

		System.out.println("Enter the value of Y2");
		y2 = sc.nextInt();

		System.out.println("For line 2");

		System.out.println("Enter the value of X1");
		x3 = sc.nextInt();

		System.out.println("Enter the value of X2");
		x4 = sc.nextInt();

		System.out.println("Enter the value of Y1");
		y3 = sc.nextInt();

		System.out.println("Enter the value of Y2");
		y4 = sc.nextInt();
		sc.close();
	}

	public  void distance() {
		distance1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		distance2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));

		System.out.println("Distance 1 :" + distance1);
		System.out.println("Distance 2 :" + distance2);
	}

	public  void compareTo() {
		if (distance1 == distance2) {
			System.out.println("Length of two lines are equal");
		} else if (distance1 > distance2) {
			System.out.println("Length of line 1 is greater than line 2");
		} else {
			System.out.println("Length of line 2 is greater than line 1");
		}
	}
}