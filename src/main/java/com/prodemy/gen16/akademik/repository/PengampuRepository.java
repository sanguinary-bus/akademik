package com.prodemy.gen16.akademik.repository;

import com.prodemy.gen16.akademik.model.Pengampu;
import com.prodemy.gen16.akademik.model.PengampuId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PengampuRepository extends JpaRepository<Pengampu, PengampuId> {
    void deleteAllByIdKodeMataKuliah(String mataKuliah);
}
