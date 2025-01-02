package com.rockstr99.budget_tracker.framework.customAnnotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface GridHeader {
    String name();
}
