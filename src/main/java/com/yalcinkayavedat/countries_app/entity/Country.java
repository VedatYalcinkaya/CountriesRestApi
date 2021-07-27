package com.yalcinkayavedat.countries_app.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Country {
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String capital;
    @Column
    private Long population;
    @Column
    @Enumerated
    private CurrencyTypes currencyTypes;
}
