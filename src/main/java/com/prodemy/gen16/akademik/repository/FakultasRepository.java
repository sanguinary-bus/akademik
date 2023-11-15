package com.prodemy.gen16.akademik.repository;

import com.prodemy.gen16.akademik.model.Fakultas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FakultasRepository extends JpaRepository<Fakultas, String> {
    // query like
    List<Fakultas> findAllByNamaContaining(String nama);
}
