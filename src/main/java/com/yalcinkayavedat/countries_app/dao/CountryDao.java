package com.yalcinkayavedat.countries_app.dao;

import com.yalcinkayavedat.countries_app.entity.Country;
import com.yalcinkayavedat.countries_app.repository.CountriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CountryDao {
    @Autowired
    private CountriesRepository countriesRepository;


    public Country saveCountry(Country country){
        return countriesRepository.save(country);
    }

    public Country getCountryById(Long id) {
        return countriesRepository.getCountryById(id);
    }

    public Country deleteCountryById(Long id){
        Country country = countriesRepository.getCountryById(id);
        countriesRepository.deleteById(id);
        return country;
    }

    public Country updateCountry(Country country) {return countriesRepository.save(country);}
}
