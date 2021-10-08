package io.github.gbalanyi.java.libs.lombok.builder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class JavaApp {

    public static void main(String[] args) {
        new JavaApp();
    }

    public JavaApp() {
        // @Builder
        Person person1 = Person.builder()
                .id(1L)
                .dateOfBirth(LocalDate.now().minusYears(20))
                .firstName("John")
                .lastName("Doe")
                .gender("MALE")
                .address("Address")
                .email("john.doe@mail.com")
                .build();

        Person person2 = Person.builder()
                .id(2L)
                .dateOfBirth(LocalDate.now().minusYears(20))
                .firstName("Jane")
                .lastName("Doe")
                .gender("FEMALE")
                .address("Address")
                .email("jane.doe@mail.com")
                .build();

        // @Builder with @Singular
        PersonListDto personListDto = PersonListDto.builder()
                .person(person1)
                .person(person2)
                .build();

        // @Builder without @Singular
        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        PersonListDto personListDto1 = PersonListDto.builder()
                .persons(persons)
                .build();

        // @SuperBuilder
        User user1 = User.builder()
                .userName("User name")
                .password("Password")
                .id(3L)
                .dateOfBirth(LocalDate.now().minusYears(20))
                .firstName("John")
                .lastName("Doe")
                .gender("MALE")
                .address("Address")
                .email("john.doe@mail.com")
                .build();
    }
}
