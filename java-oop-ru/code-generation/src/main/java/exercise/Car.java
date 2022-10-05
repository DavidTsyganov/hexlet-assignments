package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

@Value
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    public static void main(String[] args) throws JsonProcessingException {
        User owner = new User(1, "Sergei", "Ivanov", 29);
        Car car = new Car(1, "bmv", "x5", "black", owner);
        String jsonRepresentation = car.serialize();
        System.out.println(jsonRepresentation);


    }

    public String serialize() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(this);
        return json;
    }

    public static Car unserialize(String jsonRepresentation) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Car car = mapper.readValue(jsonRepresentation, Car.class);
        return car;
    }
}
