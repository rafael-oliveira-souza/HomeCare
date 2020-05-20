package br.com.homecare.services;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.homecare.core.exceptions.custom.RequestErrorException;
import br.com.homecare.models.entities.Usuario;
import br.com.homecare.repositories.UsuarioRepository;
import br.com.homecare.utils.messages.ExceptionMessages;

@Service
public class UsuarioService {
	public static final Pattern VALID_EMAIL_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);
	
	public static final String VALID_SENHA_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";

	@Autowired
	private BCryptPasswordEncoder crypt;
	
	@Autowired
	private UsuarioRepository repo;
	

	public Usuario findByEmail(String email) {
		Matcher matcherEmail = VALID_EMAIL_REGEX.matcher(email);
		if(!matcherEmail.find()) {
			throw new RequestErrorException(ExceptionMessages.EMAIL_INVALIDO);
		}
		
		return this.repo.findByEmail(email);
	}

	public Usuario login(Usuario usuario) {
		this.validarLogin(usuario);

		String senhaCriptografada = crypt.encode(usuario.getSenha());
		usuario =  this.repo.findByEmail(usuario.getEmail());
		if(usuario == null) {
			throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Usuário"));
		}
		
		if(!usuario.getSenha().equals(senhaCriptografada)) {
			throw new RequestErrorException(ExceptionMessages.SENHA_INVALIDA);
		}
		
		return usuario;
	}

	public Optional<Usuario> find(Long id) {
		return this.repo.findById(id);
	}

	public Usuario save(Usuario usuario) {
		this.validarLogin(usuario);
		
		boolean usuarioCadastrado = (this.repo.findByEmail(usuario.getEmail()) != null);
		if(usuarioCadastrado) {
			throw new RequestErrorException(ExceptionMessages.EMAIL_CADASTRADO);
		}
		
		try {
			usuario.setSenha(this.crypt.encode(usuario.getSenha()));
			usuario = this.repo.save(usuario);
		}catch (Exception e) {
			throw new RequestErrorException(e.getCause());
		}
		
		return usuario;
	}
	
	public Usuario update(Usuario usuario)  {
		this.validarLogin(usuario);
		if(usuario.getId() == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}
		
		Optional<Usuario> objeto = this.find(usuario.getId());
        if(objeto.isPresent()){
             return this.repo.save(usuario);
        }else {
        	throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Usuario"));
        }
	}
	
	public void delete(final Long id) {
		if(id == null) {
			throw new RequestErrorException(ExceptionMessages.campoNulo("id"));
		}
		
		Optional<Usuario> objeto = this.repo.findById(id);
        if(objeto.isPresent()){
    		this.repo.delete(objeto.get());
        }else {
        	throw new RequestErrorException(ExceptionMessages.objetoNaoEncontrado("Usuario"));
        }
	}
	
	public void deleteByEmail(String email) {
		this.repo.deleteByEmail(email);
	}
	
	public void validarLogin(Usuario usuario) {
		if(usuario.getSenha() == null || usuario.getEmail() == null) {
			throw new RequestErrorException(ExceptionMessages.CAMPOS_VAZIOS);
		}

		if(Pattern.matches(VALID_SENHA_REGEX, usuario.getSenha())) {
			throw new RequestErrorException(ExceptionMessages.CAMPOS_VAZIOS);
		}
		
		Matcher matcherEmail = VALID_EMAIL_REGEX.matcher(usuario.getEmail());
		if(!matcherEmail.find()) {
			throw new RequestErrorException(ExceptionMessages.EMAIL_INVALIDO);
		}
		
	}
	
	public void validarSenha(String senha) {
		if(senha == null){
			throw new RequestErrorException(ExceptionMessages.CAMPOS_VAZIOS);
		}

		String senhaCriptografada = crypt.encode(senha);
		if(!senha.equals(senhaCriptografada)) {
			throw new RequestErrorException(ExceptionMessages.SENHA_INCORRETA);
		}
	}

}
