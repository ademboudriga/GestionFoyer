package com.example.demo.controleurs;

import com.example.demo.entities.Reservation;
import com.example.demo.services.IReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationRestController {

    @Autowired
    private IReservationService reservationService;

    @GetMapping("/all")
    public List<Reservation> getAllReservations() {
        return reservationService.retrieveAllReservations();
    }

    @GetMapping("/{reservationId}")
    public Reservation getReservation(@PathVariable("reservationId") Long reservationId) {
        return reservationService.retrieveReservation(reservationId);
    }

    @PostMapping("/add")
    public Reservation addReservation(@RequestBody Reservation r) {
        return reservationService.addReservation(r);
    }

    @DeleteMapping("/{reservationId}")
    public void deleteReservation(@PathVariable Long reservationId) {
        reservationService.removeReservation(reservationId);
    }

    @PutMapping("/modify")
    public Reservation modifyReservation(@RequestBody Reservation r) {
        return reservationService.modifyReservation(r);
    }

}
