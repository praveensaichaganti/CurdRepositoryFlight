package com.nt.service;

import java.util.List;
import com.nt.entity.Flight;


	public interface FlightService {
	Flight saveFlight(Flight flight);
	List<Flight> getAllFlights();
	Flight getFlightById(Long id);
	Flight updateFlight(Long id, Flight flight);
	void deleteFlight(Long id);
	}


