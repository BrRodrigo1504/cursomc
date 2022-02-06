package com.rodrigo.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.rodrigo.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
