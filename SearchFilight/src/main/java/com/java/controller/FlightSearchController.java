package com.java.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.model.ModalData;
import com.java.service.FlightService;

@RestController
@RequestMapping("/Airlines")
public class FlightSearchController {

	@Autowired
	private FlightService flightService;

	@RequestMapping("/allList")
	public List<ModalData> getAllTopics()
	{
		List<ModalData> avaliableFlightList =flightService.getAvaliableFlightList();
//		Comparator<ModalData> sortByOrginName = (ModalData origin1, ModalData origin2) -> origin1.getOrigin()
//				.compareTo(origin2.getOrigin());
//		List<ModalData> sortedList = (List<ModalData>) sortByOrginName;
		if(avaliableFlightList != null) 
		avaliableFlightList.stream().sorted().collect(Collectors.toList());
		return avaliableFlightList;
	}

	@RequestMapping("/flightInfo/{fightNumber}/{date}")
	public ModalData getFlightDetails(@PathVariable String fightNumber, @PathVariable String date) {

//		System.out.println("test");
		ModalData test =flightService.getFlightDetails(fightNumber, date);
		return test ;
	}

	@RequestMapping("/flightInfo/{origin}/{destination}/{date}")
	public ModalData getFlightDetailsByOrigin(@PathVariable String origin, @PathVariable String destination,
			@PathVariable String date) {
		return flightService.getFlightDetailsByOrigin(origin, destination, date);
	}

}
