package creational.factory.method.search;

import creational.factory.method.search.impl.AbstractSearch;
import creational.factory.method.search.util.SearchType;

public interface ISearchFactory {
	public AbstractSearch createSearchStrategy(SearchType searchType);
}
