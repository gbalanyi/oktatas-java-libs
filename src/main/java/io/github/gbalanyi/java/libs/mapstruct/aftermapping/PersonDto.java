package io.github.gbalanyi.java.libs.mapstruct.aftermapping;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PersonDto {
    private LocalDate dateOfBirth;
    private String name;
}
