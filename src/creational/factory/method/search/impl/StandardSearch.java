package creational.factory.method.search.impl;

import creational.factory.method.search.dto.SearchForm;
import creational.factory.method.search.dto.SearchResponse;

public class StandardSearch extends AbstractSearch{

	@Override
	public SearchResponse search(SearchForm input) {
	    validation(input);
		System.out.println("Performing standard search: " + input);
		return null;
	}

}
