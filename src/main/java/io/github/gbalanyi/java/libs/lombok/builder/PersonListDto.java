package io.github.gbalanyi.java.libs.lombok.builder;

import java.util.List;

import lombok.Builder;
import lombok.Singular;

@Builder
public class PersonListDto {
    @Singular
    private List<Person> persons;
}
