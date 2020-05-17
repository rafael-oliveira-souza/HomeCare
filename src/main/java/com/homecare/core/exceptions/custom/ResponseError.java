package com.homecare.utils.exceptions.custom;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseError {
    private int status;
    private String description;
    private Date data;

    public ResponseError(){}

    public ResponseError(int status, String description, Date data) {
        this.status = status;
        this.description = description;
        this.data = data;
    }

    public ResponseError(builder builder) {
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
	    
	    public ResponseError build() {
	    	return new ResponseError(this);
	    }
	}

}
