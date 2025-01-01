package com.rockstr99.budget_tracker.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Source {
    private String sourceCode;
    private String sourceDescription;
    private double sourceBalance;

}
