package io.github.gbalanyi.java.libs.mapstruct.mapper;

import org.mapstruct.Mapper;

@Mapper
public interface PersonMapper {

    PersonDto personToDto(Person person);
}
