package com.example.demo.services;

import com.example.demo.entities.Reservation;

import java.util.List;

public interface IReservationService {
    public List<Reservation> retrieveAllReservations();

    public Reservation retrieveReservation(Long reservationId);

    public Reservation addReservation(Reservation r);

    public void removeReservation(Long reservationId);

    public Reservation modifyReservation(Reservation r);
}
