package br.com.homecare.core.error;

import java.util.List;

public class ErrorResponse {

    private String message;
    private int code;
    private String status;
    private String objectName;
    private List<ObjectError> errors;


    public class ObjectError {

        private String message;
        private String field;
		private Object parameter;
		
        public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public String getField() {
			return field;
		}
		public void setField(String field) {
			this.field = field;
		}
		public Object getParameter() {
			return parameter;
		}
		public void setParameter(Object parameter) {
			this.parameter = parameter;
		}
    }


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getObjectName() {
		return objectName;
	}


	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}


	public List<ObjectError> getErrors() {
		return errors;
	}


	public void setErrors(List<ObjectError> errors) {
		this.errors = errors;
	}

}