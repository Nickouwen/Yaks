package com.restrezos.restrezos.restaurant;

public record Restaurant(
    Integer id,
    String name,
    String description,
    Integer maxOccupancy
) {}
