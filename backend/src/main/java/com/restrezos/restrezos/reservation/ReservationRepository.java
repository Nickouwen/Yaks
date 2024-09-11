package com.restrezos.restrezos.reservation;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
public class ReservationRepository {

    private List<Reservation> reservations = new ArrayList<>();

    List<Reservation> findAll() {
        return reservations;
    }

    Optional<Reservation> findById(Integer id) {
        return reservations.stream().filter(r -> r.id().equals(id)).findFirst();
    }

    void create(Reservation reservation) {
        reservations.add(reservation);
    }

    void update(Reservation reservation, Integer id) {
        Optional<Reservation> existingReservation = findById(id);
        if(existingReservation.isPresent()) {
            reservations.set(reservations.indexOf(existingReservation.get()), reservation);
        }
    }

    void delete(Integer id) {
        reservations.removeIf(reservation -> reservation.id().equals(id));
    }

    @PostConstruct
    private void init() {
        reservations.add(new Reservation(1, 5, new Timestamp(0), new Timestamp(0), 1, 1, 1));
        reservations.add(new Reservation(2, 5, new Timestamp(0), new Timestamp(0), 1, 1, 1));
    }
}
