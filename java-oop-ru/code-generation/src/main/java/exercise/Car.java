package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

import java.io.IOException;

@Value
@Getter
@AllArgsConstructor
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    public String serialize() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(this);
        return json;
    }

    public static Car unserialize(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Car car = mapper.readValue(json, Car.class);
        return car;
    }
}
