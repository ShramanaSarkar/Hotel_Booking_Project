package com.hbp.Hotel_Booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hbp.Hotel_Booking.dto.AddressDto;
import com.hbp.Hotel_Booking.entity.Address;
import com.hbp.Hotel_Booking.service.AddressService;
import com.hbp.Hotel_Booking.util.ResponseStructure;

@RestController
@RequestMapping("/address")
public class AddressController {
	@Autowired
	private AddressService addressService;
	@PostMapping
	public ResponseEntity<ResponseStructure<Address>> saveAddress(@RequestBody AddressDto addressDto){
		return addressService.saveAddress(addressDto);
	}

}
