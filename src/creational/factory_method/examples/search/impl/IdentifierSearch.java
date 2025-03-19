package creational.factory_method.examples.search.impl;

import creational.factory_method.examples.search.dto.SearchForm;
import creational.factory_method.examples.search.dto.SearchResponse;

public class IdentifierSearch extends AbstractSearch{

	@Override
	public SearchResponse search(SearchForm input) {
	    validation(input);
		System.out.println("Performing search with identifier: " + input);
		return new SearchResponse();
	}

}
