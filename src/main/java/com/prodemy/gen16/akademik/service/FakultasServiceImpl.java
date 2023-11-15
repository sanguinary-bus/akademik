package com.prodemy.gen16.akademik.service;

import com.prodemy.gen16.akademik.model.Fakultas;
import com.prodemy.gen16.akademik.repository.FakultasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakultasServiceImpl implements FakultasService {

    @Autowired
    private FakultasRepository fakultasRepository;

    @Override
    public void insert(Fakultas fakultas) {
        fakultasRepository.save(fakultas);
    }

    @Override
    public List<Fakultas> getAll() {
        return fakultasRepository.findAll();
    }

    @Override
    public List<Fakultas> getAllByNamaContaining(String nama) {
        return fakultasRepository.findAllByNamaContaining(nama);
    }

    @Override
    public Fakultas getByKode(String kode) {
        return fakultasRepository.findById(kode).orElse(null);
    }

    @Override
    public String updateByKode(String kode, Fakultas fakultas) {
        fakultas.setKode(kode);
        fakultasRepository.save(fakultas);
        return kode;
    }

    @Override
    public void deleteByKode(String kode) {
        fakultasRepository.deleteById(kode);
    }
}
