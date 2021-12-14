package com.tata;

public interface Hospital {
int addDoctor(Doctor d) throws DoctorAlreadyExistsException;
int addRoom(Room r);
int allocatedRoom(String roomType) throws RoomAlreadyExistsException;
}
