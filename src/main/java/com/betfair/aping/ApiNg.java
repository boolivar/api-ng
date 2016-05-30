package com.betfair.aping;

import java.util.List;
import java.util.Set;

import com.betfair.aping.entities.CancelExecutionReport;
import com.betfair.aping.entities.CancelInstruction;
import com.betfair.aping.entities.ClearedOrderSummaryReport;
import com.betfair.aping.entities.CompetitionResult;
import com.betfair.aping.entities.CountryCodeResult;
import com.betfair.aping.entities.CurrentOrderSummaryReport;
import com.betfair.aping.entities.EventResult;
import com.betfair.aping.entities.EventTypeResult;
import com.betfair.aping.entities.MarketBook;
import com.betfair.aping.entities.MarketCatalogue;
import com.betfair.aping.entities.MarketFilter;
import com.betfair.aping.entities.MarketProfitAndLoss;
import com.betfair.aping.entities.MarketTypeResult;
import com.betfair.aping.entities.PlaceExecutionReport;
import com.betfair.aping.entities.PlaceInstruction;
import com.betfair.aping.entities.PriceProjection;
import com.betfair.aping.entities.ReplaceExecutionReport;
import com.betfair.aping.entities.ReplaceInstruction;
import com.betfair.aping.entities.RunnerId;
import com.betfair.aping.entities.TimeRange;
import com.betfair.aping.entities.TimeRangeResult;
import com.betfair.aping.entities.UpdateExecutionReport;
import com.betfair.aping.entities.UpdateInstruction;
import com.betfair.aping.entities.VenueResult;
import com.betfair.aping.enums.BetStatus;
import com.betfair.aping.enums.GroupBy;
import com.betfair.aping.enums.MarketProjection;
import com.betfair.aping.enums.MarketSort;
import com.betfair.aping.enums.MatchProjection;
import com.betfair.aping.enums.OrderBy;
import com.betfair.aping.enums.OrderProjection;
import com.betfair.aping.enums.Side;
import com.betfair.aping.enums.SortDir;
import com.betfair.aping.enums.TimeGranularity;

public interface ApiNg {
	
	/**
	 * Returns a list of Event Types (i.e. Sports) associated with the markets selected by the MarketFilter.
	 * 
	 * @param filter the filter to select desired markets. All markets that match the criteria in the filter are selected.
	 * @param locale the language used for the response. If not specified, the default is returned.
	 */
	List<EventTypeResult> listEventTypes(MarketFilter filter, String locale);

	/**
	 * Returns a list of Competitions (i.e., World Cup 2013) associated with the markets selected by the MarketFilter.
	 * Currently only Football markets have an associated competition.
	 * 
	 * @param filter the filter to select desired markets. All markets that match the criteria in the filter are selected.
	 * @param locale the language used for the response. If not specified, the default is returned.
	 */
	List<CompetitionResult> listCompetitions(MarketFilter filter, String locale);

	/**
	 * Returns a list of time ranges in the granularity specified in the request
	 * (i.e. 3PM to 4PM, Aug 14th to Aug 15th) associated with the markets selected by the MarketFilter.
	 * 
	 * @param filter the filter to select desired markets. All markets that match the criteria in the filter are selected.
	 * @param granularity the granularity of time periods that correspond to markets selected by the market filter.
	 */
	List<TimeRangeResult> listTimeRanges(MarketFilter filter, TimeGranularity granularity);

	/**
	 * Returns a list of Events (i.e, Reading vs. Man United) associated with the markets selected by the MarketFilter.
	 * 
	 * @param filter the filter to select desired markets. All markets that match the criteria in the filter are selected.
	 * @param locale the language used for the response. If not specified, the default is returned.
	 */
	List<EventResult> listEvents(MarketFilter filter, String locale);

	/**
	 * Returns a list of market types (i.e. MATCH_ODDS, NEXT_GOAL) associated with the markets selected by the MarketFilter.
	 * The market types are always the same, regardless of locale.
	 * 
	 * @param filter the filter to select desired markets. All markets that match the criteria in the filter are selected.
	 * @param locale the language used for the response. If not specified, the default is returned.
	 */
	List<MarketTypeResult> listMarketTypes(MarketFilter filter, String locale);

	/**
	 * Returns a list of Countries associated with the markets selected by the MarketFilter.
	 * 
	 * @param filter the filter to select desired markets. All markets that match the criteria in the filter are selected.
	 * @param locale the language used for the response. If not specified, the default is returned.
	 */
	List<CountryCodeResult> listCountries(MarketFilter filter, String locale);

	/**
	 * Returns a list of Venues (i.e. Cheltenham, Ascot) associated with the markets selected by the MarketFilter.
	 * Currently, only Horse Racing markets are associated with a Venue.
	 * 
	 * @param filter the filter to select desired markets. All markets that match the criteria in the filter are selected.
	 * @param locale the language used for the response. If not specified, the default is returned.
	 */
	List<VenueResult> listVenues(MarketFilter filter, String locale);

	/**
	 * Returns a list of information about published (ACTIVE/SUSPENDED) markets that does not change (or changes very rarely).
	 * You use listMarketCatalogue to retrieve the name of the market, the names of selections and other information about markets.  Market Data Request Limits apply to requests made to listMarketCatalogue.
	 * 
	 * <p><strong>Please note:</strong>
	 * listMarketCatalogue does not return markets that are CLOSED.
	 * 
	 * @param filter the filter to select desired markets. All markets that match the criteria in the filter are selected.
	 * @param marketProjection the type and amount of data returned about the market.
	 * @param sort the order of the results. Will default to RANK if not passed.
	 *        RANK is an assigned priority that is determined by our Market Operations team in our back-end system.
	 *        A result's overall rank is derived from the ranking given to the flowing attributes for the result.
	 *        EventType, Competition, StartTime, MarketType, MarketId.
	 *        For example, EventType is ranked by the most popular sports types and marketTypes are ranked in the following order:
	 *        ODDS ASIAN LINE RANGE.
	 *        If all other dimensions of the result are equal, then the results are ranked in MarketId order.
	 * @param maxResults limit on the total number of results returned,
	 *        must be greater than 0 and less than or equal to 1000
	 * @param locale the language used for the response. If not specified, the default is returned.
	 */
	List<MarketCatalogue> listMarketCatalogue(MarketFilter filter, Set<MarketProjection> marketProjection, MarketSort sort, int maxResults, String locale);

	/**
	 * Returns a list of dynamic data about markets.
	 * Dynamic data includes prices, the status of the market, the status of selections,
	 * the traded volume, and the status of any orders you have placed in the market.
	 * 
	 * <p><strong>Please note:</strong> Separate requests should be made for OPEN & CLOSED markets.
	 * Request that include both OPEN & CLOSED markets will only return those markets that are OPEN.
	 * 
	 * <p><a href="http://docs.developer.betfair.com/docs/display/1smk3cen4v3lu3yomq5qye0ni/Market+Data+Request+Limits">Market Data Request Limits</a>
	 * apply to requests made to listMarketBook that include price or order projections.
	 * Calls to listMarketBook should be made up to a maximum of 5 times per second to a single marketId.
	 * 
	 * <p><strong>Best Practice:</strong>
	 * Customers seeking to use listMarketBook to obtain price, volume, unmatched (EXECUTABLE) orders
	 * and matched position in a single operation should provide an OrderProjection of “EXECUTABLE” in
	 * their listMarketBook request and receive all unmatched (EXECUTABLE) orders and the aggregated
	 * matched volume from all orders irrespective of whether they are partially or fully matched.
	 * The level of matched volume aggregation (MatchProjection) requested should be
	 * ROLLED_UP_BY_AVG_PRICE or ROLLED_UP_BY_PRICE, the former being preferred.
	 * This provides a single call in which you can track prices, traded volume, unmatched orders
	 * and your evolving matched position with a reasonably fixed, minimally sized response.
	 * 
	 * @param marketIds one or more market ids. The number of markets returned depends on the amount of data you request via the price projection.
	 * @param priceProjection the projection of price data you want to receive in the response.
	 * @param orderProjection the orders you want to receive in the response.
	 * @param matchProjection if you ask for orders, specifies the representation of matches.
	 * @param currencyCode a Betfair standard currency code. If not specified, the default currency code is used.
	 * @param locale the language used for the response. If not specified, the default is returned.
	 */
	List<MarketBook> listMarketBook(List<String>marketIds, PriceProjection priceProjection, OrderProjection orderProjection, MatchProjection matchProjection, String currencyCode, String locale);
	
	/**
	 * Retrieve profit and loss for a given list of OPEN markets.
	 * The values are calculated using matched bets and optionally settled bets.
	 * Only odds (MarketBettingType = ODDS) markets  are implemented, markets of other types are silently ignored. 
	 * To retrieve your profit and loss for CLOSED markets, please use the listClearedOrders request.
	 * 
	 * <p><strong>Please note:</strong>
	 * <a href="http://docs.developer.betfair.com/docs/display/1smk3cen4v3lu3yomq5qye0ni/Market+Data+Request+Limits">Market Data Request Limits</a>
	 * apply to requests made to listMarketProfitAndLoss
	 * 
	 * @param marketIds list of markets to calculate profit and loss
	 * @param includeSettledBets option to include settled bets (partially settled markets only).
	 *        Defaults to false if not specified
	 * @param includeBspBets option to include BSP bets.
	 *        Defaults to false if not specified.
	 * @param netOfCommission option to return profit and loss net of users current
	 *        commission rate for this market including any special tariff.
	 *        Defaults to false if not specified.
	 */
	List<MarketProfitAndLoss> listMarketProfitAndLoss(Set<String> marketIds, boolean includeSettledBets, boolean includeBspBets, boolean netOfCommission);

	/**
	 * Returns a list of your current orders.
	 * Optionally you can filter and sort your current orders using the various parameters,
	 * setting none of the parameters will return all of your current orders
	 * up to a maximum of 1000 bets, ordered BY_BET and sorted EARLIEST_TO_LATEST.
	 * To retrieve more than 1000 orders, you need to make use of the fromRecord and recordCount parameters.
	 * 
	 * <p><strong>Best Practice:</strong>
	 * To efficiently track new bet matches from a specific time, customers should use
	 * a combination of the dateRange, orderBy "BY_MATCH_TIME" and orderProjection “ALL”
	 * to filter fully/partially matched orders from the list of returned bets.
	 * The response will then filter out any bet records that have no matched date and
	 * provide a list of betIds in the order which they are fully/partially matched from
	 * the date and time specified in the dateRange field.
	 * 
	 * @param betIds optionally restricts the results to the specified bet IDs.
	 *        A maximum of 250 betId's, or a combination of 250 betId's & marketId's are permitted.
	 * @param marketIds optionally restricts the results to the specified market IDs.
	 *        A maximum of 250 marketId's, or a combination of 250 marketId's & betId's are permitted.
	 * @param orderProjection optionally restricts the results to the specified order status.
	 * @param placedDateRange optionally restricts the results to be from/to the specified date,
	 *        these dates are contextual to the orders being returned and therefore the dates
	 *        used to filter on will change to placed, matched, voided or settled dates depending on the orderBy.
	 *        This date is inclusive, i.e. if an order was placed on exactly this date (to the millisecond)
	 *        then it will be included in the results.
	 *        If the from is later than the to, no results will be returned.
	 * @param orderBy specifies how the results will be ordered.
	 *        If no value is passed in, it defaults to BY_BET.
	 *        Also acts as a filter such that only orders with a valid value in the field being ordered by will be returned
	 *        (i.e. BY_VOID_TIME returns only voided orders, BY_SETTLED_TIME (applies to partially settled markets)
	 *        returns only settled orders and BY_MATCH_TIME returns only orders with a matched date (voided, settled, matched orders)).
	 *        Note that specifying an orderBy parameter defines the context of the date filter applied by the dateRange parameter
	 *        (placed, matched, voided or settled date) - see the dateRange parameter description (above) for more information.
	 *        See also the {@link OrderBy} type definition.
	 * @param sortDir specifies the direction the results will be sorted in.
	 *        If no value is passed in, it defaults to EARLIEST_TO_LATEST.
	 * @param fromRecord specifies the first record that will be returned.
	 *        Records start at index zero, not at index one.
	 * @param recordCount specifies how many records will be returned from the index position 'fromRecord'.
	 *        Note that there is a page size limit of 1000.
	 *        A value of zero indicates that you would like all records (including and from 'fromRecord') up to the limit.
	 */
	CurrentOrderSummaryReport listCurrentOrders(Set<String> betIds, Set<String> marketIds, OrderProjection orderProjection, TimeRange placedDateRange, OrderBy orderBy, SortDir sortDir, int fromRecord, int recordCount);

	/**
	 * Returns a list of settled bets based on the bet status, ordered by settled date.
	 * To retrieve more than 1000 records, you need to make use of the fromRecord and recordCount parameters.
	 * By default the service will return all available data for the last 90 days (see Best Practice note below).
	 * The fields available at each roll-up are available <a href="http://docs.developer.betfair.com/docs/display/1smk3cen4v3lu3yomq5qye0ni/listClearedOrders+-+Roll-up+Fields+Available">here</a>
	 * 
	 * <p><strong>Best Practice:</strong>
	 * You should specify a settledDateRange "from" date when making requests for data.
	 * This reduces the amount of data that requires downloading & improves the speed of the response.
	 * Specifying a "from" date of the last call will ensure that only new data is returned. 
	 * 
	 * @param betStatus restricts the results to the specified status.
	 * @param eventTypeIds optionally restricts the results to the specified Event Type IDs.
	 * @param eventIds optionally restricts the results to the specified Event IDs.
	 * @param marketIds optionally restricts the results to the specified market IDs.
	 * @param runnerIds optionally restricts the results to the specified Runners.
	 * @param betIds optionally restricts the results to the specified bet IDs.
	 * @param side optionally restricts the results to the specified side.
	 * @param settledDateRange optionally restricts the results to be from/to the specified settled date.
	 *        This date is inclusive, i.e. if an order was cleared on exactly this date (to the millisecond)
	 *        then it will be included in the results.
	 *        If the from is later than the to, no results will be returned.
	 * @param groupBy how to aggregate the lines, if not supplied then the lowest level is returned,
	 *        i.e. bet by bet This is only applicable to SETTLED BetStatus.
	 * @param includeItemDescription if true then an ItemDescription object is included in the response.
	 * @param locale the language used for the itemDescription.
	 *        If not specified, the customer account default is returned.
	 * @param fromRecord specifies the first record that will be returned.
	 *        Records start at index zero.
	 * @param recordCount Specifies how many records will be returned, from the index position 'fromRecord'.
	 *        Note that there is a page size limit of 1000.
	 *        A value of zero indicates that you would like all records (including and from 'fromRecord')
	 *        up to the limit.
	 */
	ClearedOrderSummaryReport listClearedOrders(BetStatus betStatus, Set<String> eventTypeIds, Set<String> eventIds, Set<String> marketIds, Set<RunnerId> runnerIds, Set<String> betIds, Side side, TimeRange settledDateRange, GroupBy groupBy, boolean includeItemDescription, String locale, int fromRecord, int recordCount);

	/**
	 * Place new orders into market.
	 * This operation is atomic in that all orders will be placed or none will be placed.
	 * 
	 * <p>Please note that additional bet sizing rules apply to bets placed into the Italian Exchange.
	 * 
	 * @param marketId the market id these orders are to be placed on
	 * @param instructions The number of place instructions. 
	 *        The limit of place instructions per request is 200 for the UK/AUS Exchange and 50 for the Italian Exchange.
	 * @param customerRef optional parameter allowing the client to pass a unique string (up to 32 chars) that
	 *        is used to de-dupe mistaken re-submissions.
	 *        CustomerRef can contain: upper/lower chars, digits, chars : - . _ + * : ; ~ only.
	 *        <p>Please note: There is a time window associated with the de-duplication of duplicate
	 *        submissions which is 60 seconds.
	 */
	PlaceExecutionReport placeOrders(String marketId, List<PlaceInstruction> instructions, String customerRef);

	/**
	 * Cancel all bets OR cancel all bets on a market OR fully or partially cancel particular orders on a market.
	 * Only LIMIT orders can be cancelled or partially cancelled once placed
	 * 
	 * @param marketId if marketId and betId aren't supplied <strong>all bets</strong> are cancelled
	 * @param instructions all instructions need to be on the same market.
	 *        If not supplied all bets on the market (if market id is passed) are fully cancelled.
	 *        The limit of cancel instructions per request is 60
	 * @param customerRef Optional parameter allowing the client to pass a unique string (up to 32 chars)
	 *        that is used to de-dupe mistaken re-submissions.
	 */
	CancelExecutionReport cancelOrders(String marketId, List<CancelInstruction> instructions, String customerRef);

	/**
	 * This operation is logically a bulk cancel followed by a bulk place.
	 * The cancel is completed first then the new orders are placed.
	 * The new orders will be placed atomically in that they will all be placed or none will be placed.
	 * In the case where the new orders cannot be placed the cancellations will not be rolled back.
	 * 
	 * @param marketId the market id these orders are to be placed on
	 * @param instructions the number of replace instructions.
	 *        The limit of replace instructions per request is 60.
	 * @param customerRef optional parameter allowing the client to pass a unique string (up to 32 chars)
	 *        that is used to de-dupe mistaken re-submissions.
	 */
	ReplaceExecutionReport replaceOrders(String marketId, List<ReplaceInstruction> instructions, String customerRef);

	/**
	 * Update non-exposure changing fields.
	 * 
	 * @param marketId The market id these orders are to be placed on
	 * @param instructions The number of update instructions.
	 *        The limit of update instructions per request is 60
	 * @param customerRef Optional parameter allowing the client to pass a unique string (up to 32 chars)
	 *        that is used to de-dupe mistaken re-submissions.
	 */
	UpdateExecutionReport updateOrders(String marketId, List<UpdateInstruction> instructions, String customerRef);
}
