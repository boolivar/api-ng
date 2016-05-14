package com.betfair.aping.entities;

import java.util.List;

import com.betfair.aping.enums.ExecutionReportErrorCode;
import com.betfair.aping.enums.ExecutionReportStatus;

public class CancelExecutionReport {
	private String customerRef;
	private ExecutionReportStatus status;
	private ExecutionReportErrorCode errorCode;
	private String marketId;
	private List<CancelInstructionReport> instructionReports;
	
	/** Echo of the customerRef if passed. */
	public String getCustomerRef() {
		return customerRef;
	}
	
	public void setCustomerRef(String customerRef) {
		this.customerRef = customerRef;
	}
	
	public ExecutionReportStatus getStatus() {
		return status;
	}
	
	public void setStatus(ExecutionReportStatus status) {
		this.status = status;
	}
	
	public ExecutionReportErrorCode getErrorCode() {
		return errorCode;
	}
	
	public void setErrorCode(ExecutionReportErrorCode errorCode) {
		this.errorCode = errorCode;
	}
	
	/** Echo of marketId passed */
	public String getMarketId() {
		return marketId;
	}
	
	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}
	
	public List<CancelInstructionReport> getInstructionReports() {
		return instructionReports;
	}
	
	public void setInstructionReports(List<CancelInstructionReport> instructionReports) {
		this.instructionReports = instructionReports;
	}
}
