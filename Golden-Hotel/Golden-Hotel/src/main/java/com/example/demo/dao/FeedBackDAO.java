package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.HotelFeedback;

public interface FeedBackDAO extends JpaRepository<HotelFeedback, String> {
	
	@Query(value="select count(rating) from hotelfeedback where rating >3",nativeQuery = true)
	public int getGoodFeedback();
}

