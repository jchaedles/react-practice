package com.il.demo.entity.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.il.demo.entity.SearchInput;
import com.il.demo.entity.service.SearchInputService;
import java.util.List;

@Controller
public class SearchInputController {

    private final SearchInputService searchInputService;

    @Autowired
    public SearchInputController(SearchInputService searchInputService) {
        this.searchInputService = searchInputService;
    }
    @QueryMapping
    public List<SearchInput> getAllSearchInputs() {
        return searchInputService.getAllSearchInputs();
    }

}
