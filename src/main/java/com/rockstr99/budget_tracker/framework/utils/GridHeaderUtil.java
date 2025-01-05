package com.rockstr99.budget_tracker.framework.utils;

import com.rockstr99.budget_tracker.framework.customAnnotations.GridHeader;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

@Component
public class GridHeaderUtil {

    public LinkedHashMap<String, String> getGridHeaderMap(Object gridObj) {
        Class<?> gridClass = gridObj.getClass();
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        Arrays.stream(gridClass.getDeclaredFields())
                .filter(field -> field.isAnnotationPresent(GridHeader.class))
                .forEach(field -> {
                    map.put(field.getName(), field.getAnnotation(GridHeader.class).name());
                });
        return map;
    }

    public String createGridHeader(LinkedHashMap<String, String> gridHeaderMap) {
        StringBuffer grid = new StringBuffer();
        gridHeaderMap.forEach((key, value) -> grid.append("<th>").append(value).append("</th>"));
        return grid.toString();
    }

    public String createGridData(LinkedHashMap<String, String> gridHeaderMap, List<?> gridDataList)
    {
        return "";
    }

}
