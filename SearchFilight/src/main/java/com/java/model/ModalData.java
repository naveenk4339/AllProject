package com.java.model;

public class ModalData {

	String flightNumber;
	String carrier;
	String origin;
	String departureTime;
	String destination;
	String arrivalTime;
	String aircraft;
	String distance;
	String travelTime;
	String status;

	

	public ModalData(String flightNumber, String carrier, String origin, String departureTime,String destination,String arrivalTime,String aircraft,String distance,String travelTime,String status) {
		
		this.flightNumber=flightNumber;
		this.carrier=carrier;
		this.origin=origin;
		this.departureTime=departureTime;
		this.destination=destination;
		this.arrivalTime=arrivalTime;
		this.departureTime=departureTime;
		this.aircraft=aircraft;
		this.distance=distance;
		this.travelTime=travelTime;
		this.status=status;
		
	}
	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getAircraft() {
		return aircraft;
	}

	public void setAircraft(String aircraft) {
		this.aircraft = aircraft;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getTravelTime() {
		return travelTime;
	}

	public void setTravelTime(String travelTime) {
		this.travelTime = travelTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getCarrier() {
		return carrier;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

}
