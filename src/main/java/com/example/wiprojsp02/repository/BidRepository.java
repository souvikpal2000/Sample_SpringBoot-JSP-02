package com.example.wiprojsp02.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.wiprojsp02.entity.Bids;

@Repository
public interface BidRepository extends CrudRepository<Bids, Integer>{
	
	@Query(nativeQuery = true, value="SELECT * FROM bids WHERE email=:email AND item_Id=:itemId")
	Bids findUserItemBid(String email, String itemId);
	
	@Modifying
	@Query(nativeQuery = true, value="UPDATE bids SET bid_Amount=:bidAmount, auto_increment=:autoIncrement WHERE email=:email AND item_Id=:itemId")
	void updateBid(String email, String itemId, String bidAmount, String autoIncrement);
	
}
