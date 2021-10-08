package io.github.gbalanyi.java.libs.mapstruct.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface PersonMapper {

    @Mapping(source = "dateOfBirth", target = "dob")
    @Mapping(target = "firstName", ignore = true)
    @Mapping(target = "constantValue", constant = "CONSTANT")
    PersonDto personToDto(Person person);
}
