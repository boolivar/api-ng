package com.betfair.aping.enums;

public enum ExecutionReportErrorCode {
	
	ERROR_IN_MATCHER("The matcher's not healthy"),
	PROCESSED_WITH_ERRORS("The order itself has been accepted, but at least one (possibly all) actions have generated errors"),
	BET_ACTION_ERROR("There is an error with an action that has caused the entire order to be rejected (check the instructionReports errorCode for the reason for the rejection of the order)"),
	INVALID_ACCOUNT_STATE("Order rejected due to the account's status (suspended, inactive, dup cards)"),
	INVALID_WALLET_STATUS("Order rejected due to the account's wallet's status"),
	INSUFFICIENT_FUNDS("Account has exceeded its exposure limit or available to bet limit"),
	LOSS_LIMIT_EXCEEDED("The account has exceed the self imposed loss limit"), 
	MARKET_SUSPENDED("Market is suspended"),
	MARKET_NOT_OPEN_FOR_BETTING("Market is not open for betting, either inactive, suspended or closed awaiting settlement"),
	DUPLICATE_TRANSACTION("Duplicate customer referece data submitted (please note: there is a time window associated with the de-duplication of duplicate submissions which is 60 second)"),
	INVALID_ORDER("Order cannot be accepted by the matcher due to the combination of actions. For example, bets being edited are not on the same market, or order includes both edits and placement"),
	INVALID_MARKET_ID("Market doesn't exist"),
	PERMISSION_DENIED("Business rules do not allow order to be placed, you are either attempting to place the order using a Delayed Application Key or from a restricted jurisdiction (i.e. USA)"),
	DUPLICATE_BETIDS("Duplicate bet ids found"),
	NO_ACTION_REQUIRED("Order hasn't been passed to matcher as system detected there will be no state change"),
	SERVICE_UNAVAILABLE("The requested service is unavailable"),
	REJECTED_BY_REGULATOR("The regulator rejected the order, on the Italian Exchange this error will occur if more than 50 bets are sent in a single placeOrders request"),
	NO_CHASING("Bet placed contravenes the Spanish regulatory rules relating to loss chasing");
	
	private final String message;
	
	private ExecutionReportErrorCode(String message){
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
