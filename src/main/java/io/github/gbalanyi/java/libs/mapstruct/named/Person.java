package io.github.gbalanyi.java.libs.mapstruct.named;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Person {
    private Long id;
    private String gender;
    private LocalDate dateOfBirth;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
}
