package io.github.gbalanyi.java.libs.lombok.log;

import io.github.gbalanyi.java.libs.lombok.builder.Person;
import lombok.extern.java.Log;

@Log
// @Slf4j
// @Log4j2
// @CommonsLog
public class PersonService {

    public void savePerson(Person person) {
        // Save person...
        log.info(String.format("Saved person: %s %s", person.getFirstName(), person.getLastName()));
    }
}
