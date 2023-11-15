package com.prodemy.gen16.akademik.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "t_dosen")
public class Dosen {
    @Id
    @Column(name = "doskd", length = 20)
    private String kode;

    @Column(name = "dosnm", length = 100)
    private String nama;

    @Column(name = "dosaddr", length = 255)
    private String alamat;
}
