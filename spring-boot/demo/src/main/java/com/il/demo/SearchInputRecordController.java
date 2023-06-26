package com.il.demo;


import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;


@Controller
public class SearchInputRecordController {

    @QueryMapping
    public SearchInputRecord inputByQuery(@Argument String query) {
        return SearchInputRecord.getByQuery(query);
    }
    @QueryMapping
    public SearchInputRecord inputById(@Argument String id){
        return SearchInputRecord.getById(id);
    }

}
