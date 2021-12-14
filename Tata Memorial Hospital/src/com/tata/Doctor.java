package com.tata;

public class Doctor {
private String doctorName;
private double consoltationCharges;
private String specialization;
public Doctor(String doctorName, double consoltationCharges, String specialization) {
	super();
	this.doctorName = doctorName;
	this.consoltationCharges = consoltationCharges;
	this.specialization = specialization;
}
public String getDoctorName() {
	return doctorName;
}
public void setDoctorName(String doctorName) {
	this.doctorName = doctorName;
}
public double getConsoltationCharges() {
	return consoltationCharges;
}
public void setConsoltationCharges(double consoltationCharges) {
	this.consoltationCharges = consoltationCharges;
}
public String getSpecialization() {
	return specialization;
}
public void setSpecialization(String specialization) {
	this.specialization = specialization;
}

}
