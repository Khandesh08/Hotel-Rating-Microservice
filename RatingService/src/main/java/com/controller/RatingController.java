package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Rating;
import com.service.RatingServiceImp;

@RestController
@RequestMapping("/ratings")
public class RatingController 
{
	
   @Autowired	
   RatingServiceImp ratingServiceImp;
   
	
   @PostMapping
   public Rating save(@RequestBody Rating rating)
   {
	   return ratingServiceImp.createRating(rating);
   }
   
   @GetMapping
   public List<Rating> getall()
   {
	   return ratingServiceImp.getAll();
   }
   
   @GetMapping("/users/{userId}")
   public List<Rating> getByUserId(@PathVariable String userId)
   {
	   return ratingServiceImp.getRatingByUserId(userId);
   }
   
   @GetMapping("/hotel/{hotelId}")
   public List<Rating> getByHotelId(@PathVariable String hotelId)
   {
	   return ratingServiceImp.getRatingByHotel(hotelId);
   }
   
}
