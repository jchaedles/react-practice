package com.il.demo.entity.repository;

import com.il.demo.entity.SearchInput;
import org.springframework.data.repository.CrudRepository;

public interface SearchInputRepository extends CrudRepository<SearchInput, Long> {

    // Custom query method to find SearchInput by query
    SearchInput findByQuery(String query);

    // Custom query method to find SearchInput by ID and query
    SearchInput findByIdAndQuery(Long id, String query);
}
