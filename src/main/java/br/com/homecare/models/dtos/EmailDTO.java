package br.com.homecare.models.dtos;

import org.springframework.beans.factory.annotation.Value;

import br.com.homecare.models.entities.Usuario;

public class EmailDTO {
	private String destinatario;
	private Usuario usuario;
	private String msg;
	private String titulo;
	private String subject;
	private String template;
	private String chave;
	private Object valor;
	
	public EmailDTO(Usuario usuario, String msg, String subject) {
		this.msg = msg;
		this.subject = subject;
		this.usuario = usuario;
	}

	public EmailDTO(Builder builder) {
		this.msg = builder.msg;
		this.subject = builder.subject;
		this.usuario = builder.usuario;
		this.chave = builder.chave;
		this.valor = builder.valor;
		this.template = builder.template;
		this.titulo = builder.titulo;
		this.destinatario = builder.destinatario;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTemplate() {
		return template;
	}
	public void setTemplate(String template) {
		this.template = template;
	}
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	public Object getValor() {
		return valor;
	}
	public void setValor(Object valor) {
		this.valor = valor;
	}
	
	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public static class Builder {
		private Usuario usuario;
		private String msg;
		private String subject;
		private String template;
		private String chave;
		private Object valor;
		private String destinatario;
		private String titulo;
		
		public Builder usuario(Usuario usuario) {
			this.usuario = usuario;
			return this;
		}

		public Builder msg(String msg) {
			this.msg = msg;
			return this;
		}

		public Builder subject(String subject) {
			this.subject = subject;
			return this;
		}

		public Builder template(String template) {
			this.template = template;
			return this;
		}

		public Builder chave(String chave) {
			this.chave = chave;
			return this;
		}

		public Builder destinatario(String destinatario) {
			this.destinatario = destinatario;
			return this;
		}
		
		public Builder titulo(String titulo) {
			this.titulo = titulo;
			return this;
		}
		public Builder valor(Object valor) {
			this.valor = valor;
			return this;
		}
		
		public EmailDTO build() {
			return new EmailDTO(this);
		}
		
	}
}
