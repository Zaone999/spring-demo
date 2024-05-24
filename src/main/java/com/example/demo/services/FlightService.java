package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Flight;
import com.example.demo.repositories.FlightRepository;

@Service
public class FlightService {
    
    @Autowired
    FlightRepository flightRepository;  
    
    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public FlightRepository getFlightRepository() {
        return flightRepository;
    }

    public Flight postFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    public List<Flight> getFlights() {
        return flightRepository.findAll();
    }

    public void deleteFlight(Long id) {
        flightRepository.deleteById(id);
    }
    public void deleteAllFlights() {
        flightRepository.deleteAll();
    }
    
    public Flight updateFlight(Long id ,Flight flight) {
        Optional<Flight> flightToUpdate = flightRepository.findById(id);
        if(flightToUpdate.isPresent()){
            flightToUpdate.get().setName(flight.getName());
            return flightRepository.save(flightToUpdate.get());
        }else{
            return null;
        }
    }    

    public Flight getFlightById(Long id) {
        return flightRepository.findById(id).orElse(null);
    }
}
