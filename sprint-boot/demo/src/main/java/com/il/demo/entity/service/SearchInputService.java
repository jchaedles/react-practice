package com.il.demo.entity.service;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.il.demo.entity.SearchInput;
import com.il.demo.entity.repository.SearchInputRepository;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class SearchInputService {
    
    private SearchInputRepository searchInputRepository;

    @Autowired
    public SearchInputService(SearchInputRepository searchInputRepository){
        this.searchInputRepository = searchInputRepository;
    }
    
    public List<SearchInput> getAllSearchInputs() {
        return StreamSupport.stream(searchInputRepository.findAll().spliterator(), false)
                            .collect(Collectors.toList());
    }
}
