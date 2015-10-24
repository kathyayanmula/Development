package week1;

import week1.Hotel;

public class HotelTester {

	public static void main(String[] args) {
		Hotel hotel1 = new Hotel("Marriot", "Plano");
		hotel1.addRoom(1, "king", 'n', 120.5);
		hotel1.addRoom(2, "queen", 's', 100.5);
		hotel1.addRoom(3, "single", 's', 50.5);
		hotel1.addRoom(4, "double", 'n', 70.5);
		hotel1.addRoom(5, "twin", 'n', 80.5);
		
		System.out.println(hotel1);

		hotel1.addReservation("kathyayan", 'n', "king");
		hotel1.addReservation("goud", 's', "queen");
		hotel1.addReservation("kumar", 's', "queen");
		hotel1.addReservation("maruthi", 's', "single");
		System.out.println();
		hotel1.printReservationList();
		System.out.println();
		hotel1.getDailySales();
		System.out.println();
		hotel1.cancelReservation("maruthi");
		System.out.println();
		hotel1.printReservationList();
		System.out.println();
		hotel1.getDailySales();

	}

}
