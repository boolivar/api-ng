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
	
	List<EventTypeResult> listEventTypes(MarketFilter filter, String locale);

	List<CompetitionResult> listCompetitions(MarketFilter filter, String locale);

	List<TimeRangeResult> listTimeRanges(MarketFilter filter, TimeGranularity granularity);

	List<EventResult> listEvents(MarketFilter filter, String locale);

	List<MarketTypeResult> listMarketTypes(MarketFilter filter, String locale);

	List<CountryCodeResult> listCountries(MarketFilter filter, String locale);

	List<VenueResult> listVenues(MarketFilter filter, String locale);

	List<MarketCatalogue> listMarketCatalogue(MarketFilter filter, Set<MarketProjection> marketProjection, MarketSort sort, int maxResults, String locale);

	List<MarketBook> listMarketBook(List<String>marketIds, PriceProjection priceProjection, OrderProjection orderProjection, MatchProjection matchProjection, String currencyCode, String locale);
	
	List<MarketProfitAndLoss> listMarketProfitAndLoss(Set<String> marketIds, boolean includeSettledBets, boolean includeBspBets, boolean netOfCommission);

	CurrentOrderSummaryReport listCurrentOrders(Set<String> betIds, Set<String>marketIds, OrderProjection orderProjection, TimeRange placedDateRange, OrderBy orderBy, SortDir sortDir, int fromRecord, int recordCount);

	ClearedOrderSummaryReport listClearedOrders(BetStatus betStatus, Set<String> eventTypeIds, Set<String> eventIds, Set<String> marketIds, Set<RunnerId> runnerIds, Set<String> betIds, Side side, TimeRange settledDateRange, GroupBy groupBy, boolean includeItemDescription, String locale, int fromRecord, int recordCount);

	PlaceExecutionReport placeOrders(String marketId, List<PlaceInstruction> instructions, String customerRef);

	CancelExecutionReport cancelOrders(String marketId, List<CancelInstruction> instructions, String customerRef);

	ReplaceExecutionReport replaceOrders(String marketId, List<ReplaceInstruction> instructions, String customerRef);

	UpdateExecutionReport updateOrders(String marketId, List<UpdateInstruction> instructions, String customerRef);
}
