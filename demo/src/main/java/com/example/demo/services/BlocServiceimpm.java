package com.example.demo.services;

import com.example.demo.entities.Bloc;
import com.example.demo.repositories.BlocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlocServiceimpm implements IBlocService {

    @Autowired
    private BlocRepository blocRepository;

    @Override
    public List<Bloc> retrieveAllBlocs() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc retrieveBloc(Long blocId) {
        return blocRepository.findById(blocId).get();
    }

    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public void removeBloc(Long blocId) {
        blocRepository.deleteById(blocId);
    }

    @Override
    public Bloc modifyBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public List<Bloc> AfficherBlocs() {
        return retrieveAllBlocs();
    }

    @Override
    public Bloc AfficherblocParId(long idBloc) {
        return retrieveBloc(idBloc);
    }

}
