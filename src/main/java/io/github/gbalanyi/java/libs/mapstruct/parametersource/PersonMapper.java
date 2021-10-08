package io.github.gbalanyi.java.libs.mapstruct.parametersource;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface PersonMapper {

    PersonDto personToDto(Person person, Long created);
}
