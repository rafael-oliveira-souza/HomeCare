package br.com.homecare.services.commons;

import java.util.Date;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import br.com.homecare.models.dtos.EmailDTO;

public abstract class AbstractEmailService implements InterfaceEmailService {
	@Value("${mail.sender}")
	private String senderEmail;
	
	@Autowired
	private TemplateEngine templateEngine;

	@Autowired
	private JavaMailSender javaMailSender;
	
	@Override
	public void sendEmailConfirmation(EmailDTO emailDTO) {
		SimpleMailMessage sm = prepareSimpleMailMessage(emailDTO);
		sendEmail(sm);
	}
	
	@Override
	public void sendEmailConfirmationHTML(EmailDTO emailDTO) {
		try {
			MimeMessage mime = prepareMimeMessage(emailDTO);
			sendEmailHTML(mime);
		}catch (MessagingException e) {
			sendEmailConfirmation(emailDTO);
		}
	}

	protected SimpleMailMessage prepareSimpleMailMessage(EmailDTO emailDTO) {
		SimpleMailMessage sm = new SimpleMailMessage();
		sm.setSentDate(new Date(System.currentTimeMillis()));
		sm.setTo(emailDTO.getUsuario().getEmail());
		sm.setFrom(senderEmail);
		sm.setSubject(emailDTO.getSubject());
		sm.setText(emailDTO.getMsg());
		
		return sm;
	}
	
	protected String htmlFromTemplate(EmailDTO emailDTO) {
		Context context = new Context();
		context.setVariable(emailDTO.getChave(), emailDTO.getValor());
		return templateEngine.process(emailDTO.getTemplate(), context);
	}
	
	protected MimeMessage prepareMimeMessage(EmailDTO emailDTO) throws MessagingException {
		MimeMessage mime = javaMailSender.createMimeMessage();
		MimeMessageHelper mimeHelper =  new MimeMessageHelper(mime, true);
		mimeHelper.setSentDate(new Date(System.currentTimeMillis()));
		mimeHelper.setTo(emailDTO.getUsuario().getEmail());
		mimeHelper.setFrom(senderEmail);
		mimeHelper.setSubject(emailDTO.getSubject());
		mimeHelper.setText(htmlFromTemplate(emailDTO), true);
		
		
		return mime;
	}
}
