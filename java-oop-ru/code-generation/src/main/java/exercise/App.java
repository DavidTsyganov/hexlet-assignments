package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;
import static exercise.Car.unserialize;

public class App {
    public static Car extract(Path path) throws IOException {
        String json = Files.readString(path);
        return unserialize(json);
    }

    public static void save(Path path, Car car) throws IOException{
        String json = car.serialize();
        BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile()));
        writer.write(json);
        writer.close();
    }
}
