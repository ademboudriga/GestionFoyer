package com.example.demo.services;

import com.example.demo.entities.Bloc;

import java.util.List;

public interface IBlocService {
    public List<Bloc> retrieveAllBlocs();

    public Bloc retrieveBloc(Long blocId);

    public Bloc addBloc(Bloc b);

    public void removeBloc(Long blocId);

    public Bloc modifyBloc(Bloc b);

    public List<Bloc> AfficherBlocs();

    public Bloc AfficherblocParId(long idBloc);
}
