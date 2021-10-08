package io.github.gbalanyi.java.libs.lombok.util;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
public class PersonDto {
    private final String firstName;
    private final String lastName;
}
