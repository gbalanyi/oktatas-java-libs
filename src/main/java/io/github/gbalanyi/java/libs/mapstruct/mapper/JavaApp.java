package io.github.gbalanyi.java.libs.mapstruct.mapper;

import org.mapstruct.factory.Mappers;

public class JavaApp {

    private PersonMapper personMapper = Mappers.getMapper(PersonMapper.class);

    public static void main(String[] args) {
        new JavaApp();
    }

    public JavaApp() {

        Person person = this.getPersonService().getPerson(1L);
        PersonDto personDto = personMapper.personToDto(person);

        System.out.println(String.format("Person DTO. %s %s", personDto.getFirstName(), personDto.getLastName()));
    }

    private PersonService getPersonService() {
        return new PersonService();
    }
}
