package creational.factory.method.search.validation.strategies;

import creational.factory.method.search.dto.SearchForm;

public interface ISearchValidationStrategy {
	public void validate(SearchForm searchForm);
}
