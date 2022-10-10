package com.example.wiprojsp02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.wiprojsp02.entity.Bids;
import com.example.wiprojsp02.repository.BidRepository;

@Controller
public class BidController {
	@Autowired
	BidRepository repo;
	
	@GetMapping("")
	public String viewForm() {
		return "BidForm";
	}
	
	@PostMapping("/submitbid")
	public String postBid(Bids bid, Model m) {
		if(bid.getItemName() == "" || bid.getName() == "" || bid.getEmail() == "" || bid.getBidAmount() == "") {
			m.addAttribute("alert", "Required Data Missing!");
			m.addAttribute("message", "Enter and Resubmit.");
			return "BidForm";
		}
		//repo.save(bid);
		return "Result";
	}
}
