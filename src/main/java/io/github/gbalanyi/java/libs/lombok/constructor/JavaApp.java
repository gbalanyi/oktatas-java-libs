package io.github.gbalanyi.java.libs.lombok.constructor;

public class JavaApp {

    public static void main(String[] args) {
        new JavaApp();
    }

    public JavaApp(){
        PersonDto personDto = PersonDto.of("First name", "Last name");
    }
}
