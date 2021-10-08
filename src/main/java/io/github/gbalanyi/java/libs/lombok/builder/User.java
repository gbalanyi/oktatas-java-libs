package io.github.gbalanyi.java.libs.lombok.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public class User extends BaseUser {
    private String userName;
    private String password;
}
