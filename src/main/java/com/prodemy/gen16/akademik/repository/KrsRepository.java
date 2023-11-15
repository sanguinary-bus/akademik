package com.prodemy.gen16.akademik.repository;

import com.prodemy.gen16.akademik.model.Krs;
import com.prodemy.gen16.akademik.model.KrsId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KrsRepository extends JpaRepository<Krs, KrsId> {
    void deleteAllByIdKodeMataKuliah(String mataKuliah);
}
