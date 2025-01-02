package com.rockstr99.budget_tracker.framework.utils;

import com.rockstr99.budget_tracker.framework.customAnnotations.GridHeader;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;

@Component
public class GridHeaderUtil {

    public static HashMap<String, String> getGridHeaderMap(Object gridObj) {
        Class<?> gridClass = gridObj.getClass();
        HashMap<String, String> map = new HashMap<>();
        Arrays.stream(gridClass.getDeclaredFields())
                .filter(field -> field.isAnnotationPresent(GridHeader.class))
                .forEach(field -> {
                    map.put(field.getName(), field.getAnnotation(GridHeader.class).name());
                });
        return map;
    }
}
