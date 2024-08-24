package com.restrezos.restrezos.reservation;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
public class ReservationRepository {

    private List<Reservation> reservations = new ArrayList<>();

    List<Reservation> findAll() {
        return reservations;
    }

    @PostConstruct
    private void init() {
        reservations.add(new Reservation(1, new Timestamp(0), new Timestamp(0), 1, 1, 1));
        reservations.add(new Reservation(2, new Timestamp(0), new Timestamp(0), 1, 1, 1));
    }
}
