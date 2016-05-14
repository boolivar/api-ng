package com.betfair.aping.entities;

import java.util.Date;

import com.betfair.aping.enums.InstructionReportErrorCode;
import com.betfair.aping.enums.InstructionReportStatus;

public class CancelInstructionReport {
	private InstructionReportStatus status;
	private InstructionReportErrorCode errorCode;
	private CancelInstruction instruction;
	private double sizeCancelled;
	private Date cancelledDate;
	
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
	
	/** The instruction that was requested */
	public CancelInstruction getInstruction() {
		return instruction;
	}
	
	public void setInstruction(CancelInstruction instruction) {
		this.instruction = instruction;
	}
	
	public double getSizeCancelled() {
		return sizeCancelled;
	}
	
	public void setSizeCancelled(double sizeCancelled) {
		this.sizeCancelled = sizeCancelled;
	}
	
	public Date getCancelledDate() {
		return cancelledDate;
	}
	
	public void setCancelledDate(Date cancelledDate) {
		this.cancelledDate = cancelledDate;
	}
}
