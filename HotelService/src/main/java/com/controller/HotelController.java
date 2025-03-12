package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Hotel;
import com.services.HotelServiceImp;

@RestController
@RequestMapping("/hotel")
public class HotelController
{
	 @Autowired
     HotelServiceImp hotelServiceImp;
	 
	 @PostMapping
	 public Hotel save(@RequestBody Hotel hotel)
	 {
		 return hotelServiceImp.createHostel(hotel);
	 }
	 
	 @GetMapping
	 public List<Hotel> getall()
	 {
		 return hotelServiceImp.getAll();
	 }
	 
	 
	 @GetMapping("/{id}")
	 public Optional<Hotel> getbyid(@PathVariable String id)
	 {
		 return hotelServiceImp.get(id);
	 }
}
