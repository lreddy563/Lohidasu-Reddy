package in.javahome.ims.response;

import org.springframework.http.HttpStatus;


public class Response {
	private int status = HttpStatus.OK.value();
	private String message = "Success";
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
