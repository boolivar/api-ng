package com.betfair.aping.enums;

public enum MarketStatus {
	/** The market has been created but isn't yet available */
	INACTIVE,
	
	/** The market is open for betting */
	OPEN,
	
	/** The market is suspended and not available for betting */
	SUSPENDED,
	
	/** The market has been settled and is no longer available for betting */
	CLOSED;
}
