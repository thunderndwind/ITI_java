
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
// import java.util.Map;
// import java.util.function.BiConsumer;
// import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exercise2 {

    public static void main(String[] args) {
        CountryDao countryDao = InMemoryWorldDao.getInstance();
        // write your answer here

        // first
        List<City> maxPopulationCities = countryDao.findAllCountries().stream().map(Country::getCities)
                .map(cities -> cities.stream()
                        .max(Comparator.comparing(City::getPopulation)))
                .filter(Optional::isPresent).map(city -> city.get())
                .collect(Collectors.toList());

        // List<City> maxPopulationCitiesOfContents = countryDao.getAllContinents()
        // .stream()
        // .map(content -> maxPopulationCities
        // .stream()
        // .filter(city ->
        // countryDao.findCountryByCode(city.getCountryCode()).getContinent()
        // .equals(content))
        // .max(Comparator.comparing(City::getPopulation)))
        // .filter(Optional::isPresent)
        // .map(city -> city.get())
        // .collect(Collectors.toList());

        // second
        // List<City> maxPopulationCitiesOfContents = countryDao.findAllCountries()
        // .stream()
        // .collect(Collectors.groupingBy(Country::getContinent))
        // .values()
        // .stream()
        // .map(countries -> countries.stream()
        // .flatMap(country -> country.getCities().stream())
        // .max(Comparator.comparing(City::getPopulation)))
        // .filter(Optional::isPresent)
        // .map(Optional::get)
        // .collect(Collectors.toList());

        // third
        // List<City> maxPopulationCitiesOfContents = countryDao.getAllContinents()
        // .stream()
        // .map(cntnt -> countryDao.findCountriesByContinent(cntnt))
        // .map(countries -> countries.stream().map(country ->
        // country.getCities()).collect(Collectors.toList()))
        // .map(countries -> countries.stream().flatMap(c -> c.stream())
        // .max(Comparator.comparingInt(City::getPopulation)))
        // .filter(Optional::isPresent)
        // .map(c -> c.get()).collect(Collectors.toList());

        System.out.println(maxPopulationCitiesOfContents);
    }

}
