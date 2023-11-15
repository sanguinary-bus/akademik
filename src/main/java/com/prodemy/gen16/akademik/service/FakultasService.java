package com.prodemy.gen16.akademik.service;

import com.prodemy.gen16.akademik.model.Fakultas;

import java.util.List;

public interface FakultasService {
    void insert(Fakultas fakultas);

    List<Fakultas> getAll();

    List<Fakultas> getAllByNamaContaining(String nama);

    Fakultas getByKode(String kode);

    String updateByKode(String kode, Fakultas fakultas);

    void deleteByKode(String kode);
}
