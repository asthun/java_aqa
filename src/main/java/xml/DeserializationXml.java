package xml;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeserializationXml {
    public static void main(String[] args) throws JsonProcessingException {
        XmlMapper objectMapper = new XmlMapper();
        String fileName = "HometaskXML.xml";
        String separator = File.separator;
        Path file = Paths.get("src" + separator + "main" + separator + "resources" + separator + fileName);

/*        Person person = objectMapper.readValue(file.toFile(), Person.class);
        System.out.println(person);
*/

    }
}
