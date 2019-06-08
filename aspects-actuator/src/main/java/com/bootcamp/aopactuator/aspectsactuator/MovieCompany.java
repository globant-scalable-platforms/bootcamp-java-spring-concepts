package com.bootcamp.aopactuator.aspectsactuator;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class MovieCompany {

    public List<String> getMovies(){
        return Arrays.asList("Avengers","Batman gay");
    }
}
