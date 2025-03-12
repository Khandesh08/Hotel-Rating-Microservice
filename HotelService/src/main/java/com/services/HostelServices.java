package com.services;

import com.model.Hotel;
import java.util.List;
import java.util.Optional;

public interface HostelServices 
{
  
   Hotel createHostel(Hotel hotel);
   
   
   List<Hotel> getAll();
   
   
   Optional<Hotel> get(String id);
	
	
}
