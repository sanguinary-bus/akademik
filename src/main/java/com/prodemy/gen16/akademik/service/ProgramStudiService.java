package com.prodemy.gen16.akademik.service;

import com.prodemy.gen16.akademik.model.ProgramStudi;

import java.util.List;

public interface ProgramStudiService {
    List<ProgramStudi> getAll();

    void insert(ProgramStudi programStudi);

    ProgramStudi getByKode(String kode);

    String updateByKode(String kode, ProgramStudi programStudi);

    void deleteByKode(String kode);
}
