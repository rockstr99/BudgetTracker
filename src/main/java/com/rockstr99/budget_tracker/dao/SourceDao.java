package com.rockstr99.budget_tracker.dao;

import com.rockstr99.budget_tracker.entity.Source;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SourceDao {
    List<Source> sources = new ArrayList<>();

    public List<?> getAllSources()
    {
        return sources;
    }

    public boolean addNewSource(Source source)
    {
        return sources.add(source);
    }

}
