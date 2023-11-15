package com.prodemy.gen16.akademik.service;

import com.prodemy.gen16.akademik.model.Pengampu;
import com.prodemy.gen16.akademik.model.PengampuId;

import java.util.List;

public interface PengampuService {
    List<Pengampu> getAll();

    void insert(Pengampu pengampu);

    void deleteById(PengampuId pengampuId);
}
