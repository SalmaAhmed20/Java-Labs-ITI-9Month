package testpkg;

import world.City;
import world.Country;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import static java.util.stream.Collectors.toList;


public class MainClass {
    public static void main(String[] args) {
        List<Country> countryList = CSVReader.readCountryFromCSV("E:\\Materials\\ITI\\Java\\Lab5\\Lab5.3\\Countries.csv");
        List<City> cityList = CSVReader.readCityFromCSV("E:\\Materials\\ITI\\Java\\Lab5\\Lab5.3\\Cities.csv");
        List<City> llcityEachCountry = new ArrayList<>();
        Optional<City> cityEachCountry;
        System.out.println("\n  ---Task1: ");
        for (Country c : countryList) {
            cityEachCountry = cityList.stream().filter(city -> city.getCountry().trim().equals(c.getCode())).max(Comparator.comparingInt(City::getPopulation));
            cityEachCountry.ifPresent(System.out::println);
        }
        //---------------------------------------------------------------------------
        System.out.println("\n  ---Task2: ");
        List<String> contient1 = countryList.stream().map(Country::getContient).distinct().collect(toList());
        List<String> contient=new ArrayList<>();
        for (String s:contient1) {
            if(!contient.contains(s.trim()))contient.add(s.trim());
        }
        System.out.println("Continent number#: " + contient.size() + " \n" + contient);
        List<List<String>> countryEachContinent = new ArrayList<>();
        List<List<City>> cityEachContinent = new ArrayList<>();
        for (String cont : contient) {
            countryEachContinent.add(countryList.stream().filter(country -> country.getContient().equals(cont)).map(Country::getCode).collect(toList()));
        }
        for (List<String> strings : countryEachContinent) {
            for (String s : strings)
                llcityEachCountry = cityList.stream().filter(city -> city.getCountry().equals(" " + s)).collect(toList());
            cityEachContinent.add(llcityEachCountry);
        }
        int i = 1;
        for (List<City> cities : cityEachContinent) {

            Optional<City> hp = cities.stream().max(Comparator.comparingInt(City::getPopulation));
            int finalI = i;
            hp.ifPresent(city -> {
                System.out.print(finalI + "- ");
                if (!city.toString().isEmpty())
                    System.out.println(city);
            });
            i++;
        }
        //------------------------------------------------------------
        System.out.println("\n  ---Task3: ");
        List<Integer> capital = countryList.stream().map(Country::getCapital).collect(toList());
        String c = "";
        for (Integer integer : capital) {
            c = cityList.stream().filter(city -> city.getId() == integer).max(Comparator.comparingInt(City::getPopulation)).toString();
        }
        System.out.println(c);
    }

}
