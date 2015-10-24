package week1;

public class Room {
	
	private int roomNum;
	private String bedType;
	private double rate;
	private String occupantName;
	private char smoking;
	private boolean occupied;
	
public Room() {
	// TODO Auto-generated constructor stub
	this.occupantName = "Not Occupied";
	this.occupied = false;
}

public Room(int roomNum, String bedType, char smoking, double rate) {
	this.roomNum = roomNum;
	this.bedType = bedType;
	this.smoking = smoking;
	this.rate = rate;
	this.occupied = false;
}

public int getRoomNum() {
	return roomNum;
}

public void setRoomNum(int roomNum) {
	this.roomNum = roomNum;
}

public String getBedType() {
	return bedType;
}

public void setBedType(String bedType) {
	this.bedType = bedType;
}

public double getRoomRate() {
	return rate;
}

public void setRate(double rate) {
	this.rate = rate;
}

public String getOccupant() {
	return occupantName;
}

public void setOccupant(String occupantName) {
	this.occupantName = occupantName;
}

public char getSmoking() {
	return smoking;
}

public void setSmoking(char smoking) {
	this.smoking = smoking;
}

public boolean isOccupied() {
	return occupied;
}

public void setOccupied(boolean occupied) {
	this.occupied = occupied;
}

@Override
public String toString(){
	return "Room Number: " + this.roomNum + "\nOccupant name: " + this.occupantName + "\nSmoking room: " + this.smoking + "\nBed Type: " + this.bedType + "\nRate: " + this.rate + "\n"; 
}


}
