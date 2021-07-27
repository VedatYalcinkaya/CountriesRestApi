package com.yalcinkayavedat.countries_app.controller;

import com.yalcinkayavedat.countries_app.entity.Country;
import com.yalcinkayavedat.countries_app.service.CountriesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "country")
@RequestMapping("/api")
public class CountriesController {

    @Autowired
    private CountriesService countriesService;

    @PostMapping("/save")
    @ApiOperation(value = "save country")
    public ResponseEntity<Country> saveCountry(@RequestBody Country country) {
        return ResponseEntity.ok(countriesService.saveCountry(country));
    }

    @GetMapping("/get-by-id/{id}")
    @ApiOperation(value = "get country")
    public ResponseEntity<Country> getCountryById(@PathVariable("id") Long id){
        return ResponseEntity.ok(countriesService.getCountryById(id));
    }
    @DeleteMapping("/delete-by-id/{id}")
    @ApiOperation(value = "delete country")
    public ResponseEntity<Country> deleteCountryById(@PathVariable("id") Long id){
        return ResponseEntity.ok(countriesService.deleteCountryById(id));
    }

    @PutMapping("/update")
    @ApiOperation(value = "update country")
    public ResponseEntity<Country> updateCountry(@RequestBody Country country) {
        return ResponseEntity.ok(countriesService.updateCountry(country));
    }
}

