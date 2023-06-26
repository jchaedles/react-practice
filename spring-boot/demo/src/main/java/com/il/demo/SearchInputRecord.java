package com.il.demo;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
public class SearchInputRecord {
    
    private String query;
    @Id
    private String id;
    private String userId;
    public SearchInputRecord(){
        // empty for spring
    }

    private static List<SearchInputRecord> inputs = Arrays.asList(
            new SearchInputRecord("q-1", "1", "u1"),
            new SearchInputRecord("q-2", "2", "u2"),
            new SearchInputRecord("q-3", "3", "u3")
    );

    public static SearchInputRecord getByQuery(String inputQuery) {
        SearchInputRecord ret = inputs.stream()
				.filter(input -> input.getQuery().equals(inputQuery))
				.findFirst()
				.orElse(null);
        return ret;
    }
    public static SearchInputRecord getById(String id){
        return inputs.stream()
                .filter(input-> input.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
    public static List<SearchInputRecord> getAllRecords(){
        return inputs;
    }
}