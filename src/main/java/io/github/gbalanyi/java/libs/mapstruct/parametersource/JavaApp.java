package io.github.gbalanyi.java.libs.mapstruct.parametersource;

import org.mapstruct.factory.Mappers;

public class JavaApp {

    private PersonMapper personMapper = Mappers.getMapper(PersonMapper.class);

    public static void main(String[] args) {
        new JavaApp();
    }

    public JavaApp() {

        Person person = this.getPersonService().getPerson(1L);
        PersonDto personDto = personMapper.personToDto(person, System.currentTimeMillis());

        System.out.println(personDto.toString());
    }

    private PersonService getPersonService() {
        return new PersonService();
    }
}
