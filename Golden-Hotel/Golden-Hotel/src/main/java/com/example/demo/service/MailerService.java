 package com.example.demo.service;

import java.util.List;

import javax.mail.MessagingException;

import com.example.demo.entity.Guest;
import com.example.demo.entity.MailInfo;


public interface MailerService {
	/**
	 * Gửi email
	 * 
	 * @param mail thông tin email
	 * @throws MessagingException lỗi gửi email
	 */
	void send(MailInfo mail) throws MessagingException;

	/**
	 * Gửi email đơn giản
	 * 
	 * @param email      email người nhận
	 * @param subject tiêu đề email
	 * @param body    nội dung email
	 * @throws MessagingException lỗi gửi email
	 */
	void send(String email, String subject, String body) throws MessagingException;
	

	/**
	 * Xếp mail vào hàng đợi
	 * 
	 * @param mail thông tin email
	 */
	void queue(MailInfo mail);

	/**
	 * Tạo MailInfo và xếp vào hàng đợi
	 * 
	 * @param to      email người nhận
	 * @param subject tiêu đề email
	 * @param body    nội dung email
	 */
	void queue(String to, String subject, String body);


}
