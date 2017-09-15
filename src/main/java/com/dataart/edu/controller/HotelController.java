package com.dataart.edu.controller;

import com.dataart.edu.model.Hotel;
import com.dataart.edu.model.Room;
import com.dataart.edu.model.dto.HotelSearchCriteria;
import com.dataart.edu.model.dto.HotelSpecification;
import com.dataart.edu.model.dto.RoomSearchCriteria;
import com.dataart.edu.model.dto.RoomSpecification;
import com.dataart.edu.repository.HotelRepository;
import com.dataart.edu.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by akuzmenko on 2/28/2017.
 */
@RestController
@PreAuthorize("hasRole('USER')")
public class HotelController {
    @Autowired
    private HotelRepository hotelRepository;
    @Autowired
    private RoomRepository roomRepository;

    @GetMapping("/hotels")
    public List<Hotel> getHotels(HotelSearchCriteria searchCriteria) {
        return hotelRepository.findAll(HotelSpecification.findByCriteria(searchCriteria));
    }

    @GetMapping("/hotels/{id}")
    public Hotel getHotel(@PathVariable Long id) {
        return hotelRepository.findOne(id);
    }

    @PostMapping("/hotels")
    public Hotel addHotel(@RequestBody Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    // todo: figure out how to update it properly
    @PutMapping("/hotels/{id}")
    public Hotel updateHotel(@PathVariable Long id, @RequestBody Hotel hotel) {
        Hotel hotelToUpdate = hotelRepository.findOne(id);
        if (hotelToUpdate != null) {
            hotelToUpdate.setName(hotel.getName());
            hotelToUpdate.setHasPool(hotel.getHasPool());
            hotelToUpdate.setHasSlides(hotel.getHasSlides());
            hotelToUpdate.setHasTennis(hotel.getHasTennis());
            hotelToUpdate.setRooms(hotelToUpdate.getRooms());
        }
        return hotelRepository.saveAndFlush(hotel);
    }

    @GetMapping("/hotels/{id}/rooms")
    public List<Room> getRooms(@PathVariable Long id, RoomSearchCriteria searchCriteria) {
        return roomRepository.findAll(RoomSpecification.findByCriteria(id, searchCriteria));
    }
}
