package creational.factory_method.examples.search;

import creational.factory_method.examples.search.impl.AbstractSearch;
import creational.factory_method.examples.search.util.SearchType;

public interface ISearchFactory {
	public AbstractSearch createSearchStrategy(SearchType searchType);
}
