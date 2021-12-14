package com.tata;

public class Room {
private int roomno;
private String roomType;
private boolean roomOccupied;
public Room(int roomno, String roomType) {
	super();
	this.roomno = roomno;
	this.roomType = roomType;
}
public int getRoomno() {
	return roomno;
}
public void setRoomno(int roomno) {
	this.roomno = roomno;
}
public String getRoomType() {
	return roomType;
}
public void setRoomType(String roomType) {
	this.roomType = roomType;
}
public boolean isRoomOccupied() {
	return roomOccupied;
}
public void setRoomOccupied(boolean roomOccupied) {
	this.roomOccupied = roomOccupied;
}

}
