package creational.factory.method.search.impl;

import creational.factory.method.search.dto.SearchForm;
import creational.factory.method.search.dto.SearchResponse;
import creational.factory.method.search.validation.strategies.ISearchValidationStrategy;

public abstract class AbstractSearch {
	private ISearchValidationStrategy validationStrategy;

	public void setValidationStrategy(ISearchValidationStrategy validationStrategy) {
		this.validationStrategy = validationStrategy;
	}

	public abstract SearchResponse search(SearchForm input);

	void validation(SearchForm input) {
		validationStrategy.validate(input);
	}
}
