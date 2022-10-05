package exercise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

@Value
@Getter
@Setter
class User {
    int id;
    String firstName;
    String lastName;
    int age;
}
