package creational.factory_method.examples.search;

import creational.factory_method.examples.search.impl.AbstractSearch;
import creational.factory_method.examples.search.impl.IdentifierSearch;
import creational.factory_method.examples.search.impl.PhoneSearch;
import creational.factory_method.examples.search.impl.StandardSearch;
import creational.factory_method.examples.search.util.SearchType;
import creational.factory_method.examples.search.validation.strategies.IdentifierSearchValidationStrategy;
import creational.factory_method.examples.search.validation.strategies.PhoneSeachValidationStrategy;
import creational.factory_method.examples.search.validation.strategies.StandardSearchValidationStrategy;

import java.util.HashMap;
import java.util.Map;

public class SearchFactoryImpl implements ISearchFactory{
	static Map<SearchType, AbstractSearch> searchStrategies = new HashMap<SearchType, AbstractSearch>();
	
	static {
		StandardSearch standardSearch = new StandardSearch();
		standardSearch.setValidationStrategy(new StandardSearchValidationStrategy());
		
		PhoneSearch phoneSearch = new PhoneSearch();
		phoneSearch.setValidationStrategy(new PhoneSeachValidationStrategy());
		
		IdentifierSearch identifierSearch = new IdentifierSearch();
		identifierSearch.setValidationStrategy(new IdentifierSearchValidationStrategy());
		
		searchStrategies.put(SearchType.STANDARD_SEARCH, standardSearch);
		searchStrategies.put(SearchType.PHONE_SEARCH, phoneSearch);
		searchStrategies.put(SearchType.IDENTIFIER_SEARCH, identifierSearch);
	}
	
	public AbstractSearch createSearchStrategy(SearchType searchType) {
		// TODO Auto-generated method stub
		return searchStrategies.get(searchType);
	}

}
