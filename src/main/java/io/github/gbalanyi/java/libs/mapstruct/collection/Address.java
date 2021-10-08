package io.github.gbalanyi.java.libs.mapstruct.collection;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Address {
    private String country;
    private String zipCode;
    private String city;
    private String street;
    private String houseNumber;
    private String floor;
    private String door;
}
