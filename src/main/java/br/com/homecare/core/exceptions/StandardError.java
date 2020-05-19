package br.com.homecare.core.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String msg;
	private String description;
	private String method;
	private Long timestamp;
	
	public StandardError(Integer status, String msg, String description, String method, long timestamp) {
		this.timestamp = timestamp;
		this.status = status;
		this.msg = msg;
		this.method = method;
		this.description = description;
	}
	
	public StandardError(String msg, String description) {
		this.msg = msg;
		this.description = description;
	}
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
