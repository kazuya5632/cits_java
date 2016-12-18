package iterator_pattern;

import java.util.Iterator;

public interface Aggregate {
	@SuppressWarnings("rawtypes")
	public abstract Iterator iterator();
}
