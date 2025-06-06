package com.bleedingtooth.vitupedia.classes.repo;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;

/**
 * A repository of T.
 */
public class Repo<T> {
    /**
     * A map of T, mapped to UUID.
     */
    protected Map<UUID, T> memberMap;

    /**
     * Create a new repo.
     */
    public Repo() {
        super();
    }

    /**
     * Create a new repo, and assign a pre-existing member map.
     * 
     * @param memberMap The member map to assign.
     */
    public Repo(Map<UUID, T> memberMap) {
        this.memberMap = memberMap;
    }

    /**
     * Find by ID.
     * 
     * @param id The UUID of the target.
     * @return The target.
     * @throws IllegalArgumentException if not found.
     */
    public T findById(UUID id) {
        return tryFindById(id)
                .orElseThrow(() -> new IllegalArgumentException("No members by ID " + id + "!"));
    }

    /**
     * Get the member map of the repo.
     * 
     * @return The member map.
     */
    public Map<UUID, T> getMemberMap() {
        return memberMap;
    }

    /**
     * Try to find by ID.
     * 
     * @param id The UUID of the target.
     * @return An optional, nullable version of the target ID. Null if not found.
     */
    private Optional<T> tryFindById(UUID id) {
        return Optional.ofNullable(memberMap.get(id));
    }
}
