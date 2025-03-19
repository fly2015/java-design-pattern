package creational.factory_method.examples.search.validation.strategies;

import creational.factory_method.examples.search.dto.SearchForm;

public interface ISearchValidationStrategy {
	public void validate(SearchForm searchForm);
}
