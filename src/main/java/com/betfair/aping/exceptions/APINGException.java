package com.betfair.aping.exceptions;

public class APINGException extends RuntimeException {

	private static final long serialVersionUID = 8175125329220902203L;

	private String errorDetails;
	private String errorCode;
	private String requestUUID;

	public APINGException() {
	}

	public APINGException(String errorDetails, String errorCode, String requestUUID) {
		this.errorCode = errorCode;
		this.errorDetails = errorDetails;
		this.requestUUID = requestUUID;
	}

	@Override
	public String getMessage() {
		String message = super.getMessage();
		return message != null ? message
				: "ErrorCode: " + errorCode + " ErrorDetails: " + errorDetails + " RequestUUID: " + requestUUID;
	}

	public String getErrorDetails() {
		return errorDetails;
	}

	public void setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getRequestUUID() {
		return requestUUID;
	}

	public void setRequestUUID(String requestUUID) {
		this.requestUUID = requestUUID;
	}
}
