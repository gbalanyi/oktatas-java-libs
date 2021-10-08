package io.github.gbalanyi.java.libs.mapstruct.named;

import java.time.LocalDate;
import java.time.ZoneId;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper
public abstract class PersonMapper {

    @Mapping(source = "dateOfBirth", target = "dateOfBirth", qualifiedByName = "convertDateToLong")
    public abstract PersonDto personToDto(Person person);

    @Named("convertDateToLong")
    protected Long convertDateToLong(LocalDate localDate){
        return localDate.atStartOfDay(ZoneId.systemDefault())
                .toInstant()
                .toEpochMilli();
    }
}
