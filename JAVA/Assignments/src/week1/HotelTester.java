package week1;

import week1.Room;
import week1.Hotel;
public class HotelTester {

	public static void main(String[] args) {
		Hotel hotel1 = new Hotel("Marriot", "Plano");
		Room room1 = new Room(2,"queen",'s',100.5);
		hotel1.addRoom(1,"king",'n',120.5);
		hotel1.addRoom(2,"queen",'s',100.5);
		hotel1.addRoom(3,"single",'s',50.5);
		hotel1.addRoom(4,"double",'n',70.5);
		hotel1.addRoom(5,"twin",'n',80.5);
		System.out.println(hotel1.name);
		System.out.println(hotel1.rooms.length);
		System.out.println(hotel1.isEmpty());
		//for(int i = 0; i < hotel1.rooms.length ; i++){
			//System.out.println(hotel1.rooms[i]);
		//}
		//hotel1.printReservationList();
		hotel1.getDailySales();
		System.out.println(hotel1);
		System.out.println(room1.isOccupied());
		
		

	}

}
