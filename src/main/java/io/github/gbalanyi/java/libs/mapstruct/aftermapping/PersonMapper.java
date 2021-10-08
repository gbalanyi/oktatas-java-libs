package io.github.gbalanyi.java.libs.mapstruct.aftermapping;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public abstract class PersonMapper {

    public abstract PersonDto personToDto(Person person);

    @AfterMapping
    protected void afterPersonMapping(Person person, @MappingTarget PersonDto personDto) {
        personDto.setName(person.getFirstName() + " " + person.getLastName());
    }
}
