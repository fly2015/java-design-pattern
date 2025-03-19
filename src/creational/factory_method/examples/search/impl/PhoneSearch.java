package creational.factory_method.examples.search.impl;

import creational.factory_method.examples.search.dto.SearchForm;
import creational.factory_method.examples.search.dto.SearchResponse;

public class PhoneSearch extends AbstractSearch{

	@Override
	public SearchResponse search(SearchForm input) {
	    validation(input);
		System.out.println("Performing search with phone: " + input);
		return null;
	}

}
