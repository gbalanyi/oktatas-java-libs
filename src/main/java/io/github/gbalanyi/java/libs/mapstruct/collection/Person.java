package io.github.gbalanyi.java.libs.mapstruct.collection;

import java.time.LocalDate;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.Singular;

@Getter
@Setter
@Builder
public class Person {
    private Long id;
    private String gender;
    private LocalDate dateOfBirth;
    private String firstName;
    private String lastName;
    private String email;
    @Singular
    private List<Address> addresses;
}
