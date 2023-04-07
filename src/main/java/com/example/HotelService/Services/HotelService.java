package com.example.HotelService.Services;

import com.example.HotelService.entities.Hotel;

import java.util.List;
import java.util.Optional;

public interface HotelService {

    Hotel create(Hotel hotel);

    List<Hotel> getAllHotels();

    Optional<Hotel> getHotel(Integer id);
}
