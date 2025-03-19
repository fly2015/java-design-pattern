package creational.factory_method.examples.search.util;


import creational.factory_method.examples.search.dto.SearchForm;

public final class SearchHelper {
	private static SearchHelper INSTANCE;
	
	private SearchHelper() {

	}

	public static SearchHelper getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new SearchHelper();
		}

		return INSTANCE;
	}
	
	public SearchType determineSearchType(SearchForm searchForm) {
		if (searchForm.getId() != null && !searchForm.getId().isEmpty()) 
		{
			return SearchType.IDENTIFIER_SEARCH;
		}
		else if (searchForm.getPhone() != null && !searchForm.getPhone().isEmpty()) 
		{
			return SearchType.PHONE_SEARCH;
		} 
		else 
		{
			return SearchType.STANDARD_SEARCH;
		}
	}
}
