package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Hotel;

public interface HotelRespository extends JpaRepository<Hotel, String>
{

}
