package json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Deserealization {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String fileName = "example2.json";
        String separator = File.separator;
        Path file = Paths.get("src" + separator + "main" + separator + "resources" + separator + fileName);
        Request request = objectMapper.readValue(file.toFile(), Request.class);
        System.out.println(request);
    }
}
