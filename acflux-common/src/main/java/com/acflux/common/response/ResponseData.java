package com.acflux.common.response;

/**
 * @author narenderk
 *
 */
public class ResponseData {
	int status;

	Object data;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
