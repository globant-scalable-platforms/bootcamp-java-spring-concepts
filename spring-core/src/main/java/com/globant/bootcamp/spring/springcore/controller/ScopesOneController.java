package com.globant.bootcamp.spring.springcore.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globant.bootcamp.spring.springcore.domain.Counter;


@RestController
public class ScopesOneController {
    
    @Autowired
    @Qualifier(value="counterSingleton")
    private Counter counterSingleton;
    
    @Autowired
    @Qualifier(value="counterPrototype")
    private Counter counterPrototype;
    
    @RequestMapping(value="/scopes-one")
    public List<Counter> getScopes() {
        final List<Counter> result = new ArrayList<>();
        counterSingleton.setCount(counterSingleton.getCount()+1);
        counterPrototype.setCount(counterPrototype.getCount()+1);
        result.add(counterSingleton);
        result.add(counterPrototype);
        
        return result;
    }    
}
