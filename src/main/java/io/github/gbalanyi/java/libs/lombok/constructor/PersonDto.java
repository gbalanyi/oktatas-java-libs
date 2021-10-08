package io.github.gbalanyi.java.libs.lombok.constructor;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(staticName = "of")
public class PersonDto {
    private final String firstName;
    private final String lastName;
}
