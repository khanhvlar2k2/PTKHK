package com.example.demo.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.example.demo.entity.Gallery;



@Repository
public interface DAO_Gallery extends JpaRepository<Gallery, Integer>
 {
	@Query("Select g From Gallery g Where g.roomtype.type=?1")
	List<Gallery> findByGaleryProducttilte(int id );
}
