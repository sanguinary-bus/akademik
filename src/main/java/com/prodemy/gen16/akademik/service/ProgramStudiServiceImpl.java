package com.prodemy.gen16.akademik.service;

import com.prodemy.gen16.akademik.model.ProgramStudi;
import com.prodemy.gen16.akademik.repository.ProgramStudiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramStudiServiceImpl implements ProgramStudiService {

    @Autowired
    private ProgramStudiRepository programStudiRepository;

    @Override
    public List<ProgramStudi> getAll() {
        return programStudiRepository.findAll();
    }

    @Override
    public void insert(ProgramStudi programStudi) {
        programStudiRepository.save(programStudi);
    }

    @Override
    public ProgramStudi getByKode(String kode) {
        return programStudiRepository.findById(kode).orElse(null);
    }

    @Override
    public String updateByKode(String kode, ProgramStudi programStudi) {
        programStudi.setKode(kode);
        programStudiRepository.save(programStudi);
        return kode;
    }

    @Override
    public void deleteByKode(String kode) {
        programStudiRepository.deleteById(kode);
    }
}
