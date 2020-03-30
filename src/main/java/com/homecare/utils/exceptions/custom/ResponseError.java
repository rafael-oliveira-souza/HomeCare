package com.homecare.utils.exceptions.custom;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

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

}
