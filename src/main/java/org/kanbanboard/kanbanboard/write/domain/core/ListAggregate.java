package org.kanbanboard.kanbanboard.write.domain.core;

import java.util.UUID;

final public class ListAggregate {
    private final ListRepository repository;

    public ListAggregate(ListRepository repository) {
        this.repository = repository;
    }

    public void create(UUID id, int position, String name) {
        this.repository.create(id, position, name);
    }
}
