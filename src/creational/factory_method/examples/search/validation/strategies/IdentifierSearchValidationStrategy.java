package creational.factory_method.examples.search.validation.strategies;

import creational.factory_method.examples.search.dto.SearchForm;

public class IdentifierSearchValidationStrategy implements ISearchValidationStrategy{
	public void validate(SearchForm searchForm) {
		System.out.println("Validating the search with ID: " + searchForm);
	}

}
