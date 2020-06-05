package com.hajj.dto;

public class MessageResponse {
	private boolean message;

	public MessageResponse(boolean message) {
		this.message = message;
	}

	public boolean getMessage() {
		return message;
	}

	public void setMessage(boolean message) {
		this.message = message;
	}

}
