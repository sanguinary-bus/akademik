package com.prodemy.gen16.akademik.service;

import com.prodemy.gen16.akademik.model.Mahasiswa;
import com.prodemy.gen16.akademik.repository.MahasiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MahasiswaServiceImpl implements MahasiswaService {

    @Autowired
    private MahasiswaRepository mahasiswaRepository;

    @Override
    public List<Mahasiswa> getAll() {
        return mahasiswaRepository.findAll();
    }

    @Override
    public void insert(Mahasiswa mahasiswa) {
        mahasiswaRepository.save(mahasiswa);
    }

    @Override
    public Mahasiswa getByNim(String nim) {
        return mahasiswaRepository.findById(nim).orElse(null);
    }

    @Override
    public String updateByNim(String nim, Mahasiswa mahasiswa) {
        mahasiswa.setNim(nim);
        mahasiswaRepository.save(mahasiswa);
        return nim;
    }

    @Override
    public void deleteByNim(String nim) {
        mahasiswaRepository.deleteById(nim);
    }
}
