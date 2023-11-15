package com.prodemy.gen16.akademik.service;

import com.prodemy.gen16.akademik.model.Dosen;
import com.prodemy.gen16.akademik.repository.DosenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DosenServiceImpl implements DosenService {

    @Autowired
    private DosenRepository dosenRepository;

    @Override
    public List<Dosen> getAll() {
        return dosenRepository.findAll();
    }

    @Override
    public void insert(Dosen dosen) {
        dosenRepository.save(dosen);
    }

    @Override
    public Dosen getByKode(String kode) {
        return dosenRepository.findById(kode).orElse(null);
    }

    @Override
    public String updateByKode(String kode, Dosen dosen) {
        dosen.setKode(kode);
        dosenRepository.save(dosen);
        return kode;
    }

    @Override
    public void deleteByKode(String kode) {
        dosenRepository.deleteById(kode);
    }
}
