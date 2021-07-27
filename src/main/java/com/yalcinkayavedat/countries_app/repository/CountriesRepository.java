package com.yalcinkayavedat.countries_app.repository;

import com.yalcinkayavedat.countries_app.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.management.monitor.CounterMonitor;

@Repository
public interface CountriesRepository extends JpaRepository<Country, Long> {

    Country getCountryById(Long id);

}
