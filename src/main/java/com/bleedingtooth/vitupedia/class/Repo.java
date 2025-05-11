import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class Repo<T> {
    protected Map<UUID, T> memberMap;

    public T findById(UUID id) {
        return tryFindById(id)
                .orElseThrow(() -> new IllegalArgumentException("No members by ID " + id + "!"));
    }

    private Optional<T> tryFindById(UUID id) {
        return Optional.ofNullable(memberMap.get(id));
    }

    public Repo() {
        super();
    }
}
