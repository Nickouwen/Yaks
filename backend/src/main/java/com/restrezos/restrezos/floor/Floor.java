package com.restrezos.restrezos.floor;

public record Floor(
    Integer id,
    String name,
    String description,
    Integer maxOccupancy,
    Boolean indoor,
    Boolean bar
) {}
