package com.example.demo.repositories;

import com.example.demo.entities.Bloc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BlocRepository extends JpaRepository<Bloc,Long> {
}
