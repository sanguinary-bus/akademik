package com.prodemy.gen16.akademik.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "t_mahasiswa")
public class Mahasiswa {
    @Id
    @Column(name = "mhsnim",length = 15)
    private String nim;

    @Column(name = "mhsnm", length = 100)
    private String nama;

    @Column(name = "mhsdob")
    private LocalDate tanggalLahir;

    @Column(name = "mhsaddr",length = 255)
    private String alamat;

}
