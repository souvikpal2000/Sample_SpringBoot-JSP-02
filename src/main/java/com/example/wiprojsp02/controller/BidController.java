package com.example.wiprojsp02.controller;

import javax.transaction.Transactional;

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
	
	@Transactional
	@PostMapping("/submitbid")
	public String postBid(Bids bid, Model m) {
		if(bid.getItemName() == "" || bid.getName() == "" || bid.getEmail() == "" || bid.getBidAmount() == "") {
			m.addAttribute("alert", "Required Data Missing!");
			m.addAttribute("message", "Enter and Resubmit.");
			return "BidForm";
		}else {
			Bids bidder = repo.findUserItemBid(bid.getEmail(), bid.getItemId());
			System.out.println(bidder);
			if(bidder != null) {
				repo.updateBid(bid.getEmail(), bid.getItemId(), bid.getBidAmount(), bid.getAutoIncrement());
			}else {
				if(bid.getAutoIncrement() == null) {
					bid.setAutoIncrement("false");
				}else {
					bid.setAutoIncrement("true");
				}
				repo.save(bid);
			}
			m.addAttribute("itemName", bid.getItemName());
			m.addAttribute("itemId", bid.getItemId());
			m.addAttribute("name", bid.getName());
			m.addAttribute("email", bid.getEmail());
			m.addAttribute("bidAmount", bid.getBidAmount());
			m.addAttribute("autoIncrement", bid.getAutoIncrement());
			
			return "Result";
		}
	}
}
