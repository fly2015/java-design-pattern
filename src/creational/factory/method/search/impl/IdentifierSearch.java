package creational.factory.method.search.impl;

import creational.factory.method.search.dto.SearchForm;
import creational.factory.method.search.dto.SearchResponse;

public class IdentifierSearch extends AbstractSearch{

	@Override
	public SearchResponse search(SearchForm input) {
	    validation(input);
		System.out.println("Performing search with identifier: " + input);
		return new SearchResponse();
	}

}
