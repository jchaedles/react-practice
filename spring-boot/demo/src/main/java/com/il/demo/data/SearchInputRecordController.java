package com.il.demo.data;


import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;


@Controller
public class SearchInputRecordController {

    @QueryMapping
    public SearchInputRecord inputByQuery(String query) {
        return SearchInputRecord.getByQuery(query);
    }

}
