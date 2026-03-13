package com.SwitchCases;

import java.util.Scanner;

public class Restaurant1 {

	double Chickentandoori = 175;
	double Chickentikka = 160;
	double Gobi65 = 150;
	double Paneertikka = 120;
	
	
	double Chickenbiryani = 200;
	double Vegbiryani = 110;
	double Butterchicken = 330;
	double Paneerbuttermasala = 270;
	
	
	double Icecreams = 100;
	double Cakes = 130;
	double Milkshakes = 125;
	double Waffles = 75;

	double d = 0;
	double d1 = 0;

	void Menu(Scanner sc) {
		for (;;) {
			System.out.println("-----Categories-----");
			System.out.println("\n1. Starters.");
			System.out.println("2. Main Course.");
			System.out.println("3. Desserts.");
			System.out.println("\nEnter Your Category: ");
			int category = sc.nextInt();
			if (category == d1) {
				System.out.println("Thank You For Visiting!!!");
				break;
			}
			double qty = 0;
			switch (category) {
			case 1 -> {

				if (category == d1)
					break;
				System.out.println("-----Starters-----");
				System.out.println("\n1. Chicken Tandoori.");
				System.out.println("2. Chicken Tikka.");
				System.out.println("3. Gobi 65.");
				System.out.println("4. Paneer Tikka.");
				System.out.println("\nEnter Your Starter Number: ");
				int Starters = sc.nextInt();

				switch (Starters) {
				case 1 -> {
					if (Starters == d1)
						break;
					System.out.println("You have Selected Chicken Tandoori.");
					System.out.println("Enter Quantity: ");
					qty = sc.nextDouble();
					System.out.println("Total Amount: " + qty * Chickentandoori);
				}

				case 2 -> {
					System.out.println("You have Selected Chicken Tikka.");
					System.out.println("Enter Quantity: ");
					qty = sc.nextDouble();
					System.out.println("Total Amount: " + qty * Chickentikka);
				}

				case 3 -> {
					System.out.println("You have Selected Gobi 65.");
					System.out.println("Enter Quantity: ");
					qty = sc.nextDouble();
					System.out.println("Total Amount: " + qty * Gobi65);
				}

				case 4 -> {
					System.out.println("You have Selected Paneer Tikka.");
					System.out.println("Enter Quantity: ");
					qty = sc.nextDouble();
					System.out.println("Total Amount: " + qty * Paneertikka);
				}

				default -> System.out.println("Selected Starter is not Available.");
				}

			}
			case 2 -> {

				System.out.println("-----Main Course-----");
				System.out.println("\n1. Chicken Biriyani.");
				System.out.println("2. Veg Biriyani.");
				System.out.println("3. Butter Chicken.");
				System.out.println("4. Paneer Butter Masala.");
				System.out.println("\nEnter Your Main Course Number: ");
				int Course = sc.nextInt();

				switch (Course) {
				case 1 -> {
					if (Course == d1)
						break;
					System.out.println("You have Selected Chicken Biriyani.");
					System.out.println("Enter Quantity: ");
					qty = sc.nextDouble();
					System.out.println("Total Amount: " + qty * Chickenbiryani);
				}
				case 2 -> {
					System.out.println("You have Selected Veg Biriyani.");
					System.out.println("Enter Quantity: ");
					qty = sc.nextDouble();
					System.out.println("Total Amount: " + qty * Vegbiryani);
				}
				case 3 -> {
					System.out.println("You have Selected Butter Chicken.");
					System.out.println("Enter Quantity: ");
					qty = sc.nextDouble();
					System.out.println("Total Amount: " + qty * Butterchicken);
				}
				case 4 -> {
					System.out.println("You have Selected Paneer Butter Masala.");
					System.out.println("Enter Quantity: ");
					qty = sc.nextDouble();
					System.out.println("Total Amount: " + qty * Paneerbuttermasala);
				}
				default -> System.out.println("Selected Main Course in not Available.");
				}

			}
			case 3 -> {
				System.out.println("-----Desserts-----");
				System.out.println("\n1. Ice Creams.");
				System.out.println("2. Cakes.");
				System.out.println("3. Milk Shakes");
				System.out.println("4. Waffles.");
				System.out.println("\nEnter Your Dessert Number: ");
				int Desserts = sc.nextInt();

				switch (Desserts) {
				case 1 -> {
					if (Desserts == d1)
						break;
					System.out.println("You have Selected Ice Creams.");
					System.out.println("Enter Quantity: ");
					qty = sc.nextDouble();
					System.out.println("Total Amount: " + qty * Icecreams);
				}
				case 2 -> {
					System.out.println("You have Selected Cakes.");
					System.out.println("Enter Quantity: ");
					qty = sc.nextDouble();
					System.out.println("Total Amount: " + qty * Cakes);
				}
				case 3 -> {
					System.out.println("You have Selected Milk Shakes.");
					System.out.println("Enter Quantity: ");
					qty = sc.nextDouble();
					System.out.println("Total Amount: " + qty * Milkshakes);
				}
				case 4 -> {
					System.out.println("You have Selected Waffeles.");
					System.out.println("Enter Quantity: ");
					qty = sc.nextDouble();
					System.out.println("Total Amount: " + qty * Waffles);
				}
				default -> System.out.println("Selected Dessert is not Available.");
				}

			}
			default -> System.out.println("Selected the Invalid food category..!");
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to 5 Star Restaurant");
		Restaurant1 Y = new Restaurant1();
		Y.Menu(sc);

	}
}
