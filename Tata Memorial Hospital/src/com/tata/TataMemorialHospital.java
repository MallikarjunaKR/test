package com.tata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class TataMemorialHospital implements Hospital{
	ArrayList<Doctor> doctorList=new ArrayList<Doctor>();
	ArrayList<Room> roomlist=new ArrayList<Room>();
	@Override
	public int addDoctor(Doctor doc) throws DoctorAlreadyExistsException {
	   for(Doctor d:doctorList) {
		   if((d.getDoctorName().equalsIgnoreCase(doc.getDoctorName()))&&
		 (d.getSpecialization().equalsIgnoreCase(doc.getSpecialization()))) {
			   throw new DoctorAlreadyExistsException("Doctor already exists");
			   }
	   }
			   doctorList.add(doc);
		   
		return doctorList.size();
	}

	@Override
	public int addRoom(Room r) {
		for(Room room:roomlist) {
			if(room.getRoomno()!=r.getRoomno()) {
			roomlist.add(r);	
			}
		}
		return roomlist.size();
	}

	@Override
	public  int allocatedRoom(String roomType) throws RoomAlreadyExistsException {
		for(Room r:roomlist) {
			if(r.getRoomType().equalsIgnoreCase(roomType)&&r.isRoomOccupied()==false) {
				r.setRoomOccupied(true);
				return r.getRoomno();
			}
		}
			throw new RoomAlreadyExistsException("Room already allocated");	
	}
	public Set<String>getSpecialization(){
		TreeSet<String> specialization=new TreeSet<String>();
		for(Doctor d:doctorList) {
			specialization.add(d.getSpecialization());
		}
		return specialization;
	}
	
	public HashMap<String,ArrayList<Room>> getMapByAllocation(){
		ArrayList<Room>allocated=new ArrayList<Room>();
		ArrayList<Room>unallocated=new ArrayList<Room>();
HashMap<String,ArrayList<Room>> result=new HashMap<String,ArrayList<Room>>();
		
		for(Room r:roomlist) {
			if(r.isRoomOccupied()==true) {
				allocated.add(r);
			}
			else
				unallocated.add(r);
		}
		result.put("allocated",allocated);
		result.put("unallocated",unallocated);
		return result;
	}
	public static void main(String[] args) throws DoctorAlreadyExistsException {
		TataMemorialHospital tmh=new TataMemorialHospital();
		tmh.doctorList.add(new Doctor("velantish",1000,"cadio"));
		tmh.doctorList.add(new Doctor("Akhil",800,"gynacalogist"));
		tmh.doctorList.add(new Doctor("keerty",700,"psyco"));
		tmh.addDoctor(new Doctor("akhil",5677,"thermo"));
       for(Doctor d:tmh.doctorList) {
    	System.out.println("Name::"+d.getDoctorName()+" specialization::"+d.getSpecialization()+" consolation fees::"+d.getConsoltationCharges());
    	
       }
       
	}

	

}
