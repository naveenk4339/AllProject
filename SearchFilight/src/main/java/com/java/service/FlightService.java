package com.java.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.java.model.ModalData;

@Service
public class FlightService {

	public List<ModalData> flightList = new ArrayList<>(Arrays.asList(
			new ModalData("2005", "UA", "IAH", "2018-01-31T05:10:00", "ORD", "2018-01-31T07:57:00", "Airbus A320",
					"925", "02:47", "Arrived at Gate"),
			new ModalData("0638", "UA", "IAH", "2018-01-31T05:10:00", "ORD", "2018-01-31T07:57:00", "Boeing 737-900",
					"925", "02:33", "Arrived at Gate"),
			new ModalData("1160", "UA", "IAH", "2018-01-31T05:10:00", "ORD", "2018-01-31T07:57:00", "Boeing 737-800",
					"925", "02:33", "Arrived at Gate"),
			new ModalData("2043", "UA", "ORD", "2018-01-31T05:10:00", "ORD", "2018-01-31T07:57:00", "Boeing 737-800",
					"925", "02:41", "Arrived at Gate"),
			new ModalData("0748", "UA", "ORD", "2018-01-31T05:10:00", "ORD", "2018-01-31T07:57:00", "Boeing 737-900",
					"925", "02:41", "Arrived at Gate"),
			new ModalData("2166", "UA", "IAH", "2018-01-31T05:10:00", "ORD", "2018-01-31T07:57:00", "Airbus A320",
					"925", "02:47", "Arrived at Gate"),
			new ModalData("2171", "UA", "IAH", "2018-01-31T05:10:00", "ORD", "2018-01-31T07:57:00", "AirBus A320",
					"925", "02:39", "On Time"),
			new ModalData("1128", "UA", "IAH", "2018-01-31T05:10:00", "ORD", "2018-01-31T07:57:00", "Boeing 737-800",
					"925", "02:47", "On Time")));

	public List<ModalData> getAvaliableFlightList() {
		return flightList;

	}

	public ModalData getFlightDetails(String fightNumber, String date) 
	{
		
		ModalData flightInfo = flightList.stream()
				.filter(t -> t.getFlightNumber().equals(fightNumber) || t.getArrivalTime().contains(date)).findFirst()
				.get();
		return flightInfo;
	}

	public ModalData getFlightDetailsByOrigin(String origin, String destination, String date) 
	{

		ModalData flightInfo = flightList.stream().filter(t -> t.getOrigin().equals(origin)
				&& t.getDestination().equals(destination) && t.getArrivalTime().contains(date)).findFirst().get();
		
		return flightInfo;
	}

}
