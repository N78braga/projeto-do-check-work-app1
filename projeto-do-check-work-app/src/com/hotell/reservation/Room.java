package com.hotell.reservation;



public class Room {
	private int  numberOfDays;
	private int roomNumber;
	private int toWalkr;
	private String roomDescription;
	private String type;
	private double roomPrice;
	private String date;
	
	
	public int getQtdDias() {
		return  numberOfDays;
	}
	public void setQtdDias(int  numberOfDays) {
		this. numberOfDays = numberOfDays;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public int getAndar() {
		return toWalkr;
	}
	public void setAndar(int toWalkr) {
		this.toWalkr = toWalkr;
	}
	public String getRoomDescription() {
		return roomDescription;
	}
	public void setRoomDescription(String roomDescription) {
		this.roomDescription = roomDescription;
	}
	public String getTipo() {
		return type;
	}
	public void setTipo(String type) {
		this.type = type;
	}
	public double getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(double roomPrice) {
		this.roomPrice = roomPrice;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int numberOfDays(int  numberOfDays) {
		return this.numberOfDays +=  numberOfDays;
	
	}
	public int numberRoom(int roomNumber) {
		return this.roomNumber = roomNumber;
				
	}
	public int numberTowalkr(int toWalkr) {
		return this.toWalkr = toWalkr;
	}
	
	public String bookingDate(String date) {
		return this.date = date;
	}

}
