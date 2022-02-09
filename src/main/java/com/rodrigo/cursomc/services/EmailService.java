package com.rodrigo.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.rodrigo.cursomc.domain.Cliente;
import com.rodrigo.cursomc.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}