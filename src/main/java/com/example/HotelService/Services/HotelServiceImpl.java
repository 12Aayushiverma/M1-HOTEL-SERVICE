package com.example.HotelService.Services;

import com.example.HotelService.entities.Hotel;
import com.example.HotelService.repositories.HotelRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService{

   @Autowired
   private HotelRepository hotelRepository;

    private final static Logger log = LoggerFactory.getLogger(HotelServiceImpl.class);
    @Override
    public Hotel create(Hotel hotel) {

        log.info("HotelServiceImpl::createHotel===START ");
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public Optional<Hotel> getHotel(Integer id) {
        return hotelRepository.findById(id);
    }
}
