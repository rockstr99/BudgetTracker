package com.rockstr99.budget_tracker.framework.customTags;

import com.rockstr99.budget_tracker.framework.customAnnotations.GridHeader;
import com.rockstr99.budget_tracker.framework.utils.GridHeaderUtil;
import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class GridTag extends SimpleTagSupport {

    private String divClass;
    private String gridListName;
    private List<?> gridList;

    @Autowired
    GridHeaderUtil headerUtil;

    public String getDivClass() {
        return divClass;
    }

    public void setDivClass(String divClass) {
        this.divClass = divClass;
    }

    public String getGridListName() {
        return gridListName;
    }

    public void setGridListName(String gridListName) {
        this.gridListName = gridListName;
    }

    @Override
    public void doTag() throws JspException, IOException {
        JspWriter out = getJspContext().getOut();
        LinkedHashMap<String, String> gridHeaderMap = headerUtil.getGridHeaderMap(gridList.get(0));
        StringBuilder htmlElements = new StringBuilder();
        String tableClass = (divClass == null) ? "table table-striped table-hover table-bordered border-dark" : divClass;
        htmlElements.append(" <div class=\"container\">");
        htmlElements.append(" <div class=\"row\">");
        htmlElements.append(" <div class=\"col\">");
        htmlElements.append(" <table class=\"").append(tableClass).append("\">\"");
        htmlElements.append(" <thead>");
        htmlElements.append(" <tr>");
        htmlElements.append(headerUtil.createGridHeader(gridHeaderMap));
        htmlElements.append(" </tr>");
        htmlElements.append(" </thead>");
        htmlElements.append(" <tbody>");
        htmlElements.append(" <c:forEach var=\"source\" items=\"${sources}\">");
        htmlElements.append(" <tr>");
        htmlElements.append(" <td>${source.sourceCode}</td>");
        htmlElements.append(" <td>${source.sourceDescription}</td>");
        htmlElements.append(" <td>${source.sourceBalance}</td>");
        htmlElements.append(" </tr>");
        htmlElements.append(" </c:forEach>");
        htmlElements.append(" </tbody>");
        htmlElements.append(" </table>");
        htmlElements.append(" </div>");
        htmlElements.append(" </div>");
        htmlElements.append(" </div>");
    }
}


