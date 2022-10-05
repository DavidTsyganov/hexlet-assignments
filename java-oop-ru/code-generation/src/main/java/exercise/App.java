package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("/home/dts/Untitled Document 1");
        System.out.println(extract(path));
    }
    public static Car extract(Path path) throws IOException {
        List<String> lines = Files.readAllLines(path);
        StringBuilder builder = new StringBuilder();

        int i = 0;
        while (i < lines.size()) {
            builder.append(lines.get(i));
            i++;
        }
        System.out.println(builder.toString());




        Car car = Car.unserialize(builder.toString());
        return car;
    }

    public static void save(Path path, Car car) throws JsonProcessingException, IOException{
        String jsonRepresentation = car.serialize();
        BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile()));
        writer.write(jsonRepresentation);
        writer.close();
    }

}
