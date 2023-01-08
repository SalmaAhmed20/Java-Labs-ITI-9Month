package testpkg;

import world.City;
import world.Country;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    public static List<Country> readCountryFromCSV(String fileName) {
        List<Country> countries = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);
        BufferedReader br = null;
        try {
            br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8);
            String line = br.readLine();
            while (line != null) {
                //System.out.println(line);
                String[] attributes = line.split(",");
                countries.add(new Country(attributes[0], attributes[1], attributes[2], Double.parseDouble(attributes[3]), (int) Double.parseDouble(attributes[4]),
                        Double.parseDouble(attributes[5]), Integer.parseInt(attributes[6])));
                line = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return countries;
    }

    public static List<City> readCityFromCSV(String fileName) {
        List<City> cities = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);
        BufferedReader br = null;
        try {
            br = Files.newBufferedReader(pathToFile,StandardCharsets.UTF_8);
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
                cities.add(new City(Integer.parseInt(attributes[0]), attributes[1], Integer.parseInt(attributes[2]), attributes[3]));
                line = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return cities;
    }
}
