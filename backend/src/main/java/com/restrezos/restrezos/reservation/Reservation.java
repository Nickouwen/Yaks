package com.restrezos.restrezos.reservation;

import java.sql.Timestamp;

public record Reservation(
    Integer id,
    Timestamp dateFrom,
    Timestamp dateTo,
    String time,
    Integer tableId,
    Integer restaurantId,
    Integer userId
) {}
