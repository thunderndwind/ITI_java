
// import java.util.Objects;
import java.util.Optional;
// import java.util.stream.Collectors;

// import static java.lang.System.out;
// import static java.util.Comparator.comparing;
// import static java.util.stream.Collectors.maxBy;

import java.util.Comparator;
// import java.util.List;

public class Exercise5 {

    public static void main(String[] args) {
        CountryDao countryDao = InMemoryWorldDao.getInstance();
        CityDao cityDao = InMemoryWorldDao.getInstance();
        // cityDao.findCitiesByCountryCode

        // write your answer here
        City maxPopulationCapitalCity = countryDao
                .findAllCountries()
                .stream()
                .map(country -> country.getCities().stream()
                        .filter(countryCity -> countryCity.getId() == country.getCapital())
                        .findFirst())
                .filter(Optional::isPresent)
                .map(city -> city.get())
                .max(Comparator.comparing(City::getPopulation))
                .get();

        // City maxPopulationCapitalCity = countryDao
        // .findAllCountries()
        // .stream()
        // .map(country -> country.getCapital())
        // .map(cityId -> cityDao.findCityById(cityId))
        // .filter(city -> city != null)
        // .max(Comparator.comparing(City::getPopulation))
        // .get();

        System.out.println(maxPopulationCapitalCity);
    }

}