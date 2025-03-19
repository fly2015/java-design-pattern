package creational.factory_method.examples.search.impl;

import creational.factory_method.examples.search.dto.SearchForm;
import creational.factory_method.examples.search.dto.SearchResponse;
import creational.factory_method.examples.search.validation.strategies.ISearchValidationStrategy;

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
