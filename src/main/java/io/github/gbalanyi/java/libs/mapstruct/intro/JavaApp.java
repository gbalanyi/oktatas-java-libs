package io.github.gbalanyi.java.libs.mapstruct.intro;

public class JavaApp {

    public static void main(String[] args) {
        new JavaApp();
    }

    public JavaApp() {

        Person person = this.getPersonService().getPerson(1L);
        PersonDto personDto = this.convertPersonToDto(person);

        System.out.println(String.format("Person DTO. %s %s", personDto.getFirstName(), personDto.getLastName()));
    }

    private PersonDto convertPersonToDto(Person person) {
        return PersonDto.builder()
                .dateOfBirth(person.getDateOfBirth())
                .firstName(person.getFirstName())
                .lastName(person.getLastName())
                .build();
    }

    private PersonService getPersonService() {
        return new PersonService();
    }

}
