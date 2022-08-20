package com.ecommerce.ecommerce.common;

import org.springframework.stereotype.Service;

@Service
public class Response {

	private Object data;
	private Object error;
	private int status;

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Object getError() {
		return error;
	}

	public void setError(Object error) {
		this.error = error;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}
