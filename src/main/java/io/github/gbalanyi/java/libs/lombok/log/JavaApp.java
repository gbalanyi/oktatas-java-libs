package io.github.gbalanyi.java.libs.lombok.log;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import io.github.gbalanyi.java.libs.lombok.builder.Person;
import io.github.gbalanyi.java.libs.lombok.builder.PersonListDto;
import io.github.gbalanyi.java.libs.lombok.builder.User;

public class JavaApp {

    public static void main(String[] args) {
        new JavaApp();
    }

    public JavaApp() {
        Person person = Person.builder()
                .id(1L)
                .dateOfBirth(LocalDate.now().minusYears(20))
                .firstName("John")
                .lastName("Doe")
                .gender("MALE")
                .address("Address")
                .email("john.doe@mail.com")
                .build();

        PersonService personService = new PersonService();
        personService.savePerson(person);
    }
}
