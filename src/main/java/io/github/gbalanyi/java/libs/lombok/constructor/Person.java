package io.github.gbalanyi.java.libs.lombok.constructor;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String gender;
    private LocalDate dateOfBirth;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
}
