package com.nt.service;
import java.util.List;
	import org.springframework.stereotype.Service;
	import com.nt.entity.Flight;
	import com.nt.repository.FlightRepository;


		@Service
		public class FlightServiceImpl implements FlightService {


		private final FlightRepository repository;


		public FlightServiceImpl(FlightRepository repository) {
		this.repository = repository;
		}


		@Override
		public Flight saveFlight(Flight flight) {
		return repository.save(flight);
		}


		@Override
		public List<Flight> getAllFlights() {
		return repository.findAll();
		}


		@Override
		public Flight getFlightById(Long id) {
		return repository.findById(id)
		.orElseThrow(() -> new RuntimeException("Flight not found"));
		}


		@Override
		public Flight updateFlight(Long id, Flight flight) {
		Flight existing = getFlightById(id);
		existing.setFlightName(flight.getFlightName());
		existing.setSource(flight.getSource());
		existing.setDestination(flight.getDestination());
		existing.setPrice(flight.getPrice());
		return repository.save(existing);
		}


		@Override
		public void deleteFlight(Long id) {
		repository.deleteById(id);
		}
		}
		

	}

}

