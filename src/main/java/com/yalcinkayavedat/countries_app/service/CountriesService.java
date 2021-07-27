package com.yalcinkayavedat.countries_app.service;

import com.yalcinkayavedat.countries_app.dao.CountryDao;
import com.yalcinkayavedat.countries_app.entity.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@Service
@Transactional
public class CountriesService {
    @Autowired
    private CountryDao countryDao;

    public Country saveCountry(Country country){
        return countryDao.saveCountry(country);
    }

    public Country getCountryById(Long id) {
        return countryDao.getCountryById(id);
    }

    public Country deleteCountryById(Long id) {
        return countryDao.deleteCountryById(id);
    }

    public Country updateCountry(Country country){
        Country isExistCountry = countryDao.getCountryById(country.getId());
        if (isExistCountry == null) {
            throw new EntityNotFoundException("Ülke Bulunmamadı");
        }else {
            Country updatingCountry = countryDao.getCountryById(country.getId());
            updatingCountry.setCapital(country.getCapital());
            updatingCountry.setName(country.getName());
            updatingCountry.setCurrencyTypes(country.getCurrencyTypes());
            updatingCountry.setPopulation(country.getPopulation());
            countryDao.updateCountry(updatingCountry);
            return updatingCountry;
        }

    }
}
