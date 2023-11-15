package com.prodemy.gen16.akademik.service;

import com.prodemy.gen16.akademik.model.MataKuliah;

import java.util.List;

public interface MataKuliahService {
    List<MataKuliah> getAll();

    void insert(MataKuliah mataKuliah);

    MataKuliah getByKode(String kode);

    String updateByKode(String kode, MataKuliah mataKuliah);

    void deleteByKode(String kode);
}
