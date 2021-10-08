package io.github.gbalanyi.java.libs.lombok.gettersetter;

import java.time.LocalDate;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    private String gender;
    private LocalDate dateOfBirth;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private Integer internalField;
}
