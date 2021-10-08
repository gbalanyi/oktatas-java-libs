package io.github.gbalanyi.java.libs.mapstruct.collection;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class AddressDto {
    private final String country;
    private final String city;
}
