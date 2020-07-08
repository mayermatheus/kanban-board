package org.kanbanboard.kanbanboard.write.domain.application;

import org.kanbanboard.kanbanboard.write.domain.core.ListAggregate;

final public class CreateListCommandHandler {
    private final ListAggregate listAggregate;

    public CreateListCommandHandler(ListAggregate listAggregate) {
        this.listAggregate = listAggregate;
    }

    public void handle(CreateListCommand command) {
        listAggregate.create(
                command.getId(),
                command.getPosition(),
                command.getName()
        );
    }
}
