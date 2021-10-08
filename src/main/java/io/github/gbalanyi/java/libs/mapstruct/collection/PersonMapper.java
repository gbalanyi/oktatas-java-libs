package io.github.gbalanyi.java.libs.mapstruct.collection;

import org.mapstruct.Mapper;

@Mapper
public interface PersonMapper {

    PersonDto personToDto(Person person);
}
