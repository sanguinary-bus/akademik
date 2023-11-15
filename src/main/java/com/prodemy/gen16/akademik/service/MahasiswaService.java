package com.prodemy.gen16.akademik.service;

import com.prodemy.gen16.akademik.model.Mahasiswa;

import java.util.List;

public interface MahasiswaService {
    List<Mahasiswa> getAll();

    void insert(Mahasiswa mahasiswa);

    Mahasiswa getByNim(String nim);

    String updateByNim(String nim, Mahasiswa mahasiswa);

    void deleteByNim(String nim);
}
