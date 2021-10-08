package io.github.gbalanyi.java.libs.lombok.constructor;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Address {
    private final String country;
    private final String zipCode;
    private final String city;
    private final String street;
    private final String houseNumber;
    private final String floor;
    private final String door;
}
