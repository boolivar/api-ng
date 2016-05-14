package com.betfair.aping.entities;

import com.betfair.aping.enums.PersistenceType;

/** Instruction to update LIMIT bet's persistence of an order that do not affect exposure */
public class UpdateInstruction {
	private String betId;
	private PersistenceType newPersistenceType;
	
	public String getBetId() {
		return betId;
	}
	
	public void setBetId(String betId) {
		this.betId = betId;
	}
	
	/** The new persistence type to update this bet to */
	public PersistenceType getNewPersistenceType() {
		return newPersistenceType;
	}
	
	/** The new persistence type to update this bet to */
	public void setNewPersistenceType(PersistenceType newPersistenceType) {
		this.newPersistenceType = newPersistenceType;
	}
}
