package com.prodemy.gen16.akademik.service;

import com.prodemy.gen16.akademik.model.Dosen;

import java.util.List;

public interface DosenService {
    List<Dosen> getAll();

    void insert(Dosen dosen);

    Dosen getByKode(String kode);

    String updateByKode(String kode, Dosen dosen);

    void deleteByKode(String kode);
}
