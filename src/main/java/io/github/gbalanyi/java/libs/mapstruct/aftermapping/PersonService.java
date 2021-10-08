package io.github.gbalanyi.java.libs.mapstruct.aftermapping;

import java.time.LocalDate;

public class PersonService {

    public Person getPerson(Long id) {
        return Person.builder()
                .id(id)
                .dateOfBirth(LocalDate.now().minusYears(20))
                .firstName("John")
                .lastName("Doe")
                .gender("MALE")
                .address("Address")
                .email("john.doe@mail.com")
                .build();
    }
}
