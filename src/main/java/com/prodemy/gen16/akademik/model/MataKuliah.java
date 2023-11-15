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
@Table(name = "t_matkul")
public class MataKuliah {
    @Id
    @Column(name = "matkd", length = 20)
    private String kode;

    @Column(name = "matnm", length = 100)
    private String nama;

    // @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    // private Set<Pengampu> pengampus;
    //
    // @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    // private Set<Krs> krs;
}
