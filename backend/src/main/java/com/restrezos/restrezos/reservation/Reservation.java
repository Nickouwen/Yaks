package com.restrezos.restrezos.reservation;

import java.sql.Timestamp;

public record Reservation(
    Integer id,
    Timestamp dateFrom,
    Timestamp dateTo,
    Integer tableId,
    Integer restaurantId,
    Integer userId
) {}
