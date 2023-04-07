package com.example.HotelService.controller;

import com.example.HotelService.Services.HotelService;
import com.example.HotelService.Services.HotelServiceImpl;
import com.example.HotelService.entities.Hotel;
import com.example.HotelService.model.CommonResponse;
import org.hibernate.annotations.GeneratorType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hotel")
public class HotelController<T> {

       @Autowired
       private HotelService hotelService;
    private final static Logger log = LoggerFactory.getLogger(HotelController.class);

       @PostMapping
       public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
           log.info("HotelController::createHotel===START ");
           CommonResponse cmn = new CommonResponse();
           return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.create(hotel));
       }


       @GetMapping("/{id}")
       public ResponseEntity<Optional<Hotel>> getHotel(@PathVariable Integer id){
              return ResponseEntity.status(HttpStatus.OK).body(hotelService.getHotel(id));
       }

      @GetMapping
       public ResponseEntity<List<Hotel>> getAllHotels(){
              return ResponseEntity.status(HttpStatus.OK).body(hotelService.getAllHotels());
       }
}
