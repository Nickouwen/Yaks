package com.restrezos.restrezos.reservation;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

    private final ReservationRepository reservationRepository;

    public ReservationController(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }
    
    @GetMapping("")
    List<Reservation>  findAll() {
        return reservationRepository.findAll();
    }

    @GetMapping("/{id}")
    Reservation findById(@PathVariable Integer id) {
        Optional<Reservation> reservation = reservationRepository.findById(id);
        if(reservation.isEmpty()) {
            throw new ReservationNotFoundException();
        }
        return reservation.get();
    }

    // post
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    void create(@RequestBody Reservation reservation) {
        reservationRepository.create(reservation);
    }

    // put
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/{id}")
    void update(@RequestBody Reservation reservation, @PathVariable Integer id) {
        reservationRepository.update(reservation, id);
    }

    // delete
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void delete(@PathVariable Integer id) {
        reservationRepository.delete(id);
    }


}
