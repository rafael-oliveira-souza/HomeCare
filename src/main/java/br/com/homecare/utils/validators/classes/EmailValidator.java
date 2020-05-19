package br.com.homecare.utils.validators.classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.homecare.models.entities.Usuario;
import br.com.homecare.services.UsuarioService;
import br.com.homecare.utils.messages.ExceptionMessages;
import br.com.homecare.utils.validators.interfaces.Email;

public class EmailValidator implements ConstraintValidator<Email, String> {
	public static final String EMAIL = "Email";
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public void initialize(Email emailValidator) {
	}

	@Override
	public boolean isValid(String emailField, ConstraintValidatorContext context) {
		boolean valid = true;
		
		if (emailField != null) {
			Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailField);
			valid = matcher.find();
			if(!matcher.find()) {
				context.buildConstraintViolationWithTemplate(ExceptionMessages.EMAIL_INVALIDO).addPropertyNode(EMAIL)
						.addConstraintViolation();
			}
			Usuario user = this.usuarioService.findByEmail(emailField);
			if(user == null) {
				valid = false;
				context.buildConstraintViolationWithTemplate(ExceptionMessages.EMAIL_NAO_ENCONTRATO).addPropertyNode(EMAIL)
				.addConstraintViolation();
			}
		}
		
		return valid;
	}
}