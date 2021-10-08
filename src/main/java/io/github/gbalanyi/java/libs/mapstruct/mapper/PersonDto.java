package io.github.gbalanyi.java.libs.mapstruct.mapper;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PersonDto {
    private final LocalDate dateOfBirth;
    private final String firstName;
    private final String lastName;
}
