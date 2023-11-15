package com.prodemy.gen16.akademik.service;

import com.prodemy.gen16.akademik.model.MataKuliah;
import com.prodemy.gen16.akademik.repository.KrsRepository;
import com.prodemy.gen16.akademik.repository.MataKuliahRepository;
import com.prodemy.gen16.akademik.repository.PengampuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MataKuliahServiceImpl implements MataKuliahService {

    @Autowired
    private MataKuliahRepository mataKuliahRepository;

    @Autowired
    private KrsRepository krsRepository;

    @Autowired
    private PengampuRepository pengampuRepository;

    @Override
    public List<MataKuliah> getAll() {
        return mataKuliahRepository.findAll();
    }

    @Override
    public void insert(MataKuliah mataKuliah) {
        mataKuliahRepository.save(mataKuliah);
    }

    @Override
    public MataKuliah getByKode(String kode) {
        return mataKuliahRepository.findById(kode).orElse(null);
    }

    @Override
    public String updateByKode(String kode, MataKuliah mataKuliah) {
        mataKuliah.setKode(kode);
        mataKuliahRepository.save(mataKuliah);
        return kode;
    }

    @Override
    public void deleteByKode(String kode) {
        pengampuRepository.deleteAllByIdKodeMataKuliah(kode);
        krsRepository.deleteAllByIdKodeMataKuliah(kode);
        mataKuliahRepository.deleteById(kode);
    }
}
