package io.github.gbalanyi.java.libs.lombok.util;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class Address {
    String country;
    String zipCode;
    String city;
    String street;
    String houseNumber;
    String floor;
    String door;
}
