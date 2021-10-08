package io.github.gbalanyi.java.libs.mapstruct.collection;

import java.time.LocalDate;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class PersonDto {
    private final LocalDate dateOfBirth;
    private final String firstName;
    private final String lastName;
    private final List<AddressDto> addresses;
}
