package com.betfair.aping.entities;

import com.betfair.aping.enums.InstructionReportErrorCode;
import com.betfair.aping.enums.InstructionReportStatus;

public class UpdateInstructionReport {
	private InstructionReportStatus status;
	private InstructionReportErrorCode errorCode;
	private UpdateInstruction instruction;
	
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
	public UpdateInstruction getInstruction() {
		return instruction;
	}
	
	public void setInstruction(UpdateInstruction instruction) {
		this.instruction = instruction;
	}
}
