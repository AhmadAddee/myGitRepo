package company.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class Main {
    public static class Countries{
        ArrayList<String> theCountriesList;

        public Countries() {
            this.theCountriesList = new ArrayList<>();
        }

        public void addCountry(String aCountry){
            theCountriesList.add(aCountry);
        }

        public ArrayList<String> getCountriesList(){
            return theCountriesList;
        }
    }


    public static void main(String[] args) {
        Countries countries = new Countries();
        countries.addCountry("sweden");
        countries.addCountry("london");
        countries.addCountry("usa");
        countries.addCountry("syria");
        countries.addCountry("iraq");

//        ArrayList<String> copy = countries.getCountriesList();
//        Collections.sort(copy);
//        for (String country : copy){
//            country = country.toUpperCase();
//            if (!country.startsWith("C"))
//                System.out.println(country);
//        }

        countries.getCountriesList().stream()
                .map(s -> s.toUpperCase())
                .filter(s -> !s.startsWith("C"))
                .sorted()
                .forEach(s -> System.out.println(s));

    }
}
