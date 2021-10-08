package io.github.gbalanyi.java.libs.mapstruct.mapping;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class PersonDto {
    private final LocalDate dob;
    private final String firstName;
    private final String lastName;
    private final String constantValue;
}
