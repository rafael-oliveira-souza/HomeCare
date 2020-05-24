package br.com.homecare.services.commons;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import br.com.homecare.models.dtos.EmailDTO;

public interface InterfaceEmailService {

	public void sendEmailConfirmation(EmailDTO emailDTO);

	public void sendEmail(SimpleMailMessage msg);

	public void sendEmailConfirmationHTML(EmailDTO emailDTO);

	public void sendEmailRecoverPassword(EmailDTO emailDTO);
	
	public void recoverPassword(MimeMessage msg);

	public void sendEmailHTML(MimeMessage msg);
}
