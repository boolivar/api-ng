package com.betfair.aping.entities;

import com.betfair.aping.enums.InstructionReportErrorCode;
import com.betfair.aping.enums.InstructionReportStatus;

public class ReplaceInstructionReport {
	private InstructionReportStatus status;
	private InstructionReportErrorCode errorCode;
	private CancelInstructionReport cancelInstructionReport;
	private PlaceInstructionReport placeInstructionReport;
	
	/** whether the command succeeded or failed */
	public InstructionReportStatus getStatus() {
		return status;
	}
	
	public void setStatus(InstructionReportStatus status) {
		this.status = status;
	}
	
	/** cause of failure, or null if command succeeds */
	public InstructionReportErrorCode getErrorCode() {
		return errorCode;
	}
	
	public void setErrorCode(InstructionReportErrorCode errorCode) {
		this.errorCode = errorCode;
	}
	
	/** Cancelation report for the original order */
	public CancelInstructionReport getCancelInstructionReport() {
		return cancelInstructionReport;
	}
	
	public void setCancelInstructionReport(CancelInstructionReport cancelInstructionReport) {
		this.cancelInstructionReport = cancelInstructionReport;
	}

	/** Placement report for the new order */
	public PlaceInstructionReport getPlaceInstructionReport() {
		return placeInstructionReport;
	}
	
	public void setPlaceInstructionReport(PlaceInstructionReport placeInstructionReport) {
		this.placeInstructionReport = placeInstructionReport;
	}
}
