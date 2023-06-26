package com.il.demo.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SearchInput {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String query;

    public SearchInput() {
    }

    public SearchInput(String query) {
        this.query = query;
    }

    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
    }
}
