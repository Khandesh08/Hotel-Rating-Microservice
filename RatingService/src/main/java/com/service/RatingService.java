package com.service;

import java.util.List;

import com.model.Rating;

public interface RatingService {

	Rating createRating(Rating rating);
	
	List<Rating> getAll();
	
	List<Rating> getRatingByUserId(String userId);
	
	//get all by hotel
	List<Rating> getRatingByHotel(String hotelId);
	
	
}
