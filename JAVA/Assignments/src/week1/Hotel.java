package week1;
import week1.Room;

public class Hotel {
	private Room[] rooms;
	private static String name;
	private static String location;
	private static int occupiedCnt;
	private int numOfRooms;
	private static final int NOT_FOUND = -1;
	
public Hotel() {
	this.rooms = new Room[10];
	for(int i=0;i<10;i++){
		rooms[i] = new Room();
	}
}

public Hotel(String name, String location) {
	Hotel.name = name;
	Hotel.location = location;
	this.rooms = new Room[10];
	for(int i=0;i<10;i++){
		rooms[i] = new Room();
	}
}

public boolean isFull(){
	if(numOfRooms == rooms.length)
		return true;
	return false;
}

public boolean isEmpty(){
	if(numOfRooms == 0)
		return true;
	return false;
}

public void addRoom(int roomNum, String bedType, char smoking, double rate){
	if(numOfRooms < 10){
		Room newRoom = new Room(roomNum, bedType, smoking, rate);
		rooms[numOfRooms] = newRoom;
		numOfRooms++;
	}
}

public void addReservation(String occupantName, char smoking, String bedType){
	String printOutput = "Reservation was unsuccessful";
	for(Room room :rooms){
		if(!room.isOccupied() && room.getSmoking() == smoking && room.getBedType().equals(bedType)){
			room.setOccupant(occupantName);
			room.setOccupied(true);
			occupiedCnt++;
			printOutput = "Reservation was successful";
		}
	}
	System.out.println(printOutput);
	
}

public void cancelReservation(String occupantName){
	int index = findReservation(occupantName);
	if(index == -1)
		System.out.println("Sorry reservation not found");
	else{
		rooms[index].setOccupied(false);
		rooms[index].setOccupant("Not Occupied");
		occupiedCnt--;
		System.out.println("Reservation successfully cancelled");
	}
}

public int findReservation(String occupantName){
	for(int i = 0; i < rooms.length; i++){
		if(rooms[i].getOccupant().equals(occupantName)){
			return i;
		}
	}
	return NOT_FOUND;
}

public void printReservationList(){
	System.out.println("Current reservation list:\n");
	for(Room room: this.rooms){
		if(room != null && room.isOccupied())
			System.out.println(room + "\n");			
	}
}

public void getDailySales(){
	float total = 0;
	for(Room room: rooms){
		if(room.isOccupied()){
			total += room.getRoomRate();
		}
	}
	 System.out.println("Today's sales are : " + total);
}

public int occupanyPercentage(){
	return occupiedCnt*100/numOfRooms;
}

@Override
public String toString(){
	 String output  = "    Hotel Name : " + Hotel.name + "\n    Hotel Location : " + Hotel.location + "\n    Number of Rooms : " + this.numOfRooms + "\n    Number of Occupied Rooms : " + Hotel.occupiedCnt + "\n\n    Room Details are:\n\n";
	for(Room room :rooms){
		if(room.getRoomNum() != 0){
		output  += room.toString() + "\n\n";
		}
	}
	return output;
}

}
