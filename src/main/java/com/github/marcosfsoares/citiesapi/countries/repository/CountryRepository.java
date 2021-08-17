package com.github.marcosfsoares.citiesapi.countries.repository;

import com.github.marcosfsoares.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
