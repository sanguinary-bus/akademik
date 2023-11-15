package com.prodemy.gen16.akademik.repository;

import com.prodemy.gen16.akademik.model.MataKuliah;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MataKuliahRepository extends JpaRepository<MataKuliah, String> {
}
