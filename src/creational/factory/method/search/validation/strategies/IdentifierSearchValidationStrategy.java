package creational.factory.method.search.validation.strategies;

import creational.factory.method.search.dto.SearchForm;

public class IdentifierSearchValidationStrategy implements ISearchValidationStrategy{
	public void validate(SearchForm searchForm) {
		System.out.println("Validating the search with ID: " + searchForm);
	}

}
