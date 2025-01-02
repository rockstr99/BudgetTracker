package com.rockstr99.budget_tracker.entity;

import com.rockstr99.budget_tracker.framework.customAnnotations.GridHeader;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Source {
    @GridHeader(name = "Source Code")
    private String sourceCode;

    @GridHeader(name = "Source Description")
    private String sourceDescription;

    @GridHeader(name = "Source Balance")
    private double sourceBalance;

}
