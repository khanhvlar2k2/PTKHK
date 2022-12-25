package com.example.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.config.Task;

import com.example.demo.dao.DAO_Booking;
import com.example.demo.dao.DAO_Room;
import com.example.demo.entity.Booking;
import com.example.demo.entity.Room;

@SpringBootApplication
@EnableScheduling
public class GoldenHotelApplication {
	
	@Autowired
	DAO_Booking daoBooking;
	@Autowired
	DAO_Room roomBooking;
	public static void main(String[] args) {
		SpringApplication.run(GoldenHotelApplication.class, args);
	}

	@Scheduled(cron="0 * * * * *", zone="Asia/Ho_Chi_Minh")
	void changeStatus() {
		Executors.newCachedThreadPool().execute(new Runnable() {
		    @Override
		    public void run() {
		    	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
				LocalDateTime now = LocalDateTime.now();
				List<Booking> listBK = daoBooking.findAll();
				
				if(listBK!=null) {
				for (int i = 0; i < listBK.size(); i++) {
					int diff = now.compareTo(listBK.get(i).getDeparturedate());
					int diff2 = now.compareTo(listBK.get(i).getArrivaldate());

					if(diff>0 && listBK.get(i).getRoom().getStatus()!=0 ) {
						Room room = new Room();
						room.setStatus(0);
						room.setId(listBK.get(i).getRoom().getId());
						roomBooking.save(room);
					}
					else if(diff2 >=0 && listBK.get(i).getRoom().getStatus()==0) {
						Room room = new Room();
						room.setStatus(1);
						room.setId(listBK.get(i).getRoom().getId());
						roomBooking.save(room);
						Booking bk = new Booking();
						bk.setId(listBK.get(i).getId());
						daoBooking.delete(bk);
					}
				}}
				
		    }
		});
	}
	
}
