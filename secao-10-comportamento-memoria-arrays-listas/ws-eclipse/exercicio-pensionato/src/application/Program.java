package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Rent[] rooms = new Rent[10];

		System.out.print("How many rooms will be rented? ");
		int roomsRented = sc.nextInt();

		for (int i = 1; i < roomsRented; i++) {
			System.out.println();
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String rentName = sc.nextLine();

			System.out.print("Email: ");
			String rentEmail = sc.nextLine();

			int roomNumber = 0;
			do {
				System.out.printf("Room: ");
				roomNumber = sc.nextInt();
				if (roomNumber > 9) {
					System.out.println("N�mero do quarto inv�lido, deve ser de 0 a 9. Digite novamente.");
				} else {
					rooms[roomNumber] = new Rent(rentName, rentEmail);
				}
			} while (roomNumber > 9);
		}

		System.out.println();
		System.out.println("Busy rooms:");
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i] != null) {
				System.out.println(i + ": " + rooms[i]);
			}
		}

		sc.close();
	}

}
