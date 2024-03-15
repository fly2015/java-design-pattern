package creational.factory.method.search.validation.strategies;

import creational.factory.method.search.dto.SearchForm;

public class PhoneSeachValidationStrategy implements ISearchValidationStrategy{

	public void validate(SearchForm searchForm) {
		System.out.println("Validating the search with Phone: " + searchForm);
	}

}
