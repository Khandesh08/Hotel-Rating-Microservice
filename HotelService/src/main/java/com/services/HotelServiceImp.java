package com.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Hotel;
import com.repository.HotelRespository;

@Service
public class HotelServiceImp implements HostelServices
{
    @Autowired
	HotelRespository hotelRespository;

	@Override
	public Hotel createHostel(Hotel hotel) {
		return hotelRespository.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
		return hotelRespository.findAll();
	}

	@Override
	public Optional<Hotel> get(String id) {
		return hotelRespository.findById(id);
	}
	
	

}
