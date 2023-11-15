package com.prodemy.gen16.akademik.repository;

import com.prodemy.gen16.akademik.model.Mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MahasiswaRepository extends JpaRepository<Mahasiswa, String> {
}
