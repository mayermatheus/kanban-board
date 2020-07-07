package org.kanbanboard.kanbanboard.write.domain.application;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;

public class CreateListCommandTest {

    @Test
    void GivenValidDataMustRetrieveSameData() {
        // GIVEN
        UUID id = UUID.randomUUID();
        int position = 1;
        String name = "TODO";

        // WHEN
        CreateListCommand command = new CreateListCommand(id, position, name);

        // THEN
        assertThat(command.getId()).isEqualTo(id);
        assertThat(command.getName()).isEqualTo(name);
        assertThat(command.getPosition()).isEqualTo(position);
    }
}
