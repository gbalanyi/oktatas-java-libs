package io.github.gbalanyi.java.libs.mapstruct.collection;

import java.time.LocalDate;

public class PersonService {

    public Person getPerson(Long id) {
        return Person.builder()
                .id(id)
                .dateOfBirth(LocalDate.now().minusYears(20))
                .firstName("John")
                .lastName("Doe")
                .gender("MALE")
                .email("john.doe@mail.com")
                .address(Address.builder()
                        .country("HU")
                        .zipCode("1094")
                        .city("Budapest")
                        .street("Kossuth u.")
                        .houseNumber("12")
                        .door("5")
                        .build())
                .build();
    }
}
