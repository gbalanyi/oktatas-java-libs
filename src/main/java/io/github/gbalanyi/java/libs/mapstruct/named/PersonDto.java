package io.github.gbalanyi.java.libs.mapstruct.named;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class PersonDto {
    private final Long dateOfBirth;
    private final String firstName;
    private final String lastName;
}
