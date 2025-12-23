package core4;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface Repository<T, ID> {
	boolean add(T t);

	boolean remove(ID id);

	Optional<T> findById(ID id);

	List<T> findByAll(Predicate<T> condition);
}
