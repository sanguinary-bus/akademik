package com.prodemy.gen16.akademik.service;

import com.prodemy.gen16.akademik.model.Pengampu;
import com.prodemy.gen16.akademik.model.PengampuId;
import com.prodemy.gen16.akademik.repository.PengampuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PengampuServiceImpl implements PengampuService {

    @Autowired
    private PengampuRepository pengampuRepository;

    @Override
    public List<Pengampu> getAll() {
        return pengampuRepository.findAll();
    }

    @Override
    public void insert(Pengampu pengampu) {
        pengampuRepository.save(pengampu);
    }

    @Override
    public void deleteById(PengampuId pengampuId) {
        pengampuRepository.deleteById(pengampuId);
    }
}
