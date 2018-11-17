package com.kodilla.stream.word;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WordTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        //Tworze kraje
        Country country1 = new Country("Country1", new BigDecimal("11111111"));
        Country country2 = new Country("Country2", new BigDecimal("22222222"));
        Country country3 = new Country("Country3", new BigDecimal("33333333"));
        Country country4 = new Country("Country4", new BigDecimal("44444444"));
        Country country5 = new Country("Country5", new BigDecimal("55555555"));
        Country country6 = new Country("Country6", new BigDecimal("66666666"));

        //Tworze kontynenty
        Continent continent1 = new Continent("Continent1");
        Continent continent2 = new Continent("Continent2");
        Continent continent3 = new Continent("Continent3");

        //Tworze Swiat :)
        World world = new World();

        //When
        //Tworze listy dla kontynentów
        continent1.addCountry(country1);
        continent1.addCountry(country2);
        continent1.addCountry(country3);

        continent2.addCountry(country4);
        continent2.addCountry(country5);

        continent3.addCountry(country6);

        //dodaje kontynenty do world
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);

        //Then
        Assert.assertEquals(new BigDecimal("233333331"), world.getPeopleQuantity());
    }
}
