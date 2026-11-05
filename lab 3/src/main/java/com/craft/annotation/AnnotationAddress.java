package com.craft.annotation;

import org.springframework.stereotype.Component;

@Component
public class AnnotationAddress {

    private String city = "Addis Ababa";
    private String country = "Ethiopia";

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Address [city=" + city
                + ", country=" + country + "]";
    }
}