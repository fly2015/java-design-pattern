package creational.factory_method.examples.search.validation.strategies;

import creational.factory_method.examples.search.dto.SearchForm;

public class StandardSearchValidationStrategy implements ISearchValidationStrategy
{
	public void validate(SearchForm searchForm) {
		System.out.println("Validating the search with standard: " + searchForm);
		
	}
}
