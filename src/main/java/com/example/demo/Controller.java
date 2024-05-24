package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Flight;
import com.example.demo.services.FlightService;


@RestController
public class Controller {

    @Autowired
    FlightService flightService;

    @PostMapping("flights/api/")
    public Flight postFlight(@RequestBody Flight flight) {
        return  flightService.postFlight(flight);
    }
    @GetMapping("flights/api/")
    public List<Flight> getFlights() {
        return flightService.getFlights();
    }

    @PutMapping("flights/{id}/api/")
    public Flight updateFlight(@PathVariable Long id, @RequestBody Flight flight) {
        return  flightService.updateFlight(id, flight);
    }
    
    @GetMapping("flights/{id}/api/")
    public Flight getFlightById(@PathVariable Long id) {
        return flightService.getFlightById(id);
    }
}
