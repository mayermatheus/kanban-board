package org.kanbanboard.kanbanboard.write.domain.core;

import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ListAggregateTest {

    @Test
    void GivenValidDateMustPersistInDatabase() {
        // GIVEN
        UUID id = UUID.randomUUID();
        int position = 1;
        String name = "TODO";
        ListRepository repository = mock(ListRepository.class);

        // WHEN
        ListAggregate listAggregate = new ListAggregate(repository);
        listAggregate.create(id, position, name);

        // THEN
        verify(repository).create(id, position, name);
//        Optional<ListAggregate> listEntity = repository.findById(id);
//        assertThat(listEntity.getId()).isEqualTo(id);
//        assertThat(listEntity.getPosition()).isEqualTo(position);
//        assertThat(listEntity.getName()).isEqualTo(name);
    }
}
