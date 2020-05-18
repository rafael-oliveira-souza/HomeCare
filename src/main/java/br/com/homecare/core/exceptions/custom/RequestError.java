package br.com.homecare.core.exceptions.custom;

import java.util.Date;

public class RequestError {
    private int status;
    private String description;
    private Date data;

    public RequestError(){}

    public RequestError(int status, String description, Date data) {
        this.status = status;
        this.description = description;
        this.data = data;
    }

    public RequestError(builder builder) {
        this.status = builder.status;
        this.description = builder.description;
        this.data = builder.data;
    }

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public static class builder {
	    private int status;
	    private String description;
	    private Date data;
	    
	    public builder status(int status){
	    	this.status = status;
			return this;
	    }

	    public builder description(String description){
	    	this.description = description;
			return this;
	    }
	    
	    public builder data(Date data){
	    	this.data = data;
			return this;
	    }
	    
	    public RequestError build() {
	    	return new RequestError(this);
	    }
	}

}
