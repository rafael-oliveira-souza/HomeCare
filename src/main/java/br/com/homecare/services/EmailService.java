package br.com.homecare.services;

import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import br.com.homecare.services.commons.AbstractEmailService;

public class EmailService extends AbstractEmailService{
	private static final Logger LOG = LoggerFactory.getLogger(EmailService.class);

	@Autowired
	private MailSender mailSender;

	@Autowired
	private JavaMailSender javaMailSender;

	public void sendEmail(SimpleMailMessage msg) {
		this.mailSender.send(msg);
		LOG.info("Email enviado.");
	}

	@Override
	public void sendEmailHTML(MimeMessage msg) {
		this.javaMailSender.send(msg);
		LOG.info("Email enviado.");
		
	}

}