package com.il.demo.data;
import java.util.Arrays;
import java.util.List;

public record SearchInputRecord (String query) {

    private static List<SearchInputRecord> inputs = Arrays.asList(
            new SearchInputRecord("q-1"),
            new SearchInputRecord("q-2"),
            new SearchInputRecord("q-3")
    );

    public static SearchInputRecord getByQuery(String query) {
        return inputs.stream()
				.filter(input -> input.query().equals(query))
				.findFirst()
				.orElse(null);
    }
}