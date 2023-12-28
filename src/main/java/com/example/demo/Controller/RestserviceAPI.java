package com.example.demo.Controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.VendorDetails;

@RestController
@RequestMapping("/vendor")
public class RestserviceAPI {
	VendorDetails vendordetails;
	@GetMapping("/{vendorId}")
	public VendorDetails getCloudVendorDetails(String vendorId) {
		return vendordetails;
			//	new VendorDetails("c2","name2","address2","xxxx1");
	}
	@PostMapping
	public String postvendordetails(@RequestBody VendorDetails vendordetails) {
		this.vendordetails= vendordetails;
		return "Cloud Vendor Updated Sucessfully";
	}
	@PutMapping
	public String putVendorDetails(@RequestBody  VendorDetails vendordetails)
	{
		this.vendordetails =vendordetails;
		return "Vendor details updated successfully";
	}
	@DeleteMapping("{vendorId}")
	public String deleteVendorDetails(String vendorId)
	{
		this.vendordetails=null;
		return "Vendor details deleted successfully";
	}
	
	
}
