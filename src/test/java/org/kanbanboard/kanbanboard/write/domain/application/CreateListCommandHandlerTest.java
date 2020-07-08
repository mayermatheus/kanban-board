package org.kanbanboard.kanbanboard.write.domain.application;

import org.junit.jupiter.api.Test;
import org.kanbanboard.kanbanboard.write.domain.core.ListAggregate;

import java.util.UUID;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CreateListCommandHandlerTest {

    @Test
    void GivenValidCommandMustDelegateToListAggregate() {
        // GIVEN
        UUID id = UUID.randomUUID();
        int position = 1;
        String name = "TODO";
        CreateListCommand command = new CreateListCommand(id, position, name);
        ListAggregate listAggregate = mock(ListAggregate.class);


        // WHEN
        CreateListCommandHandler handler = new CreateListCommandHandler(listAggregate);
        handler.handle(command);

        // THEN
        verify(listAggregate).create(id, position, name);
    }
}
