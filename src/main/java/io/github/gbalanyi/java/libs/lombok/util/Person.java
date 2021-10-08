package io.github.gbalanyi.java.libs.lombok.util;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString(of = {"id", "firstName", "lastName"})
public class Person {
    private Long id;
    private String gender;
    private LocalDate dateOfBirth;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
}
