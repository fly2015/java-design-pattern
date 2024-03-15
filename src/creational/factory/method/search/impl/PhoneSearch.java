package creational.factory.method.search.impl;

import creational.factory.method.search.dto.SearchForm;
import creational.factory.method.search.dto.SearchResponse;

public class PhoneSearch extends AbstractSearch{

	@Override
	public SearchResponse search(SearchForm input) {
	    validation(input);
		System.out.println("Performing search with phone: " + input);
		return null;
	}

}
