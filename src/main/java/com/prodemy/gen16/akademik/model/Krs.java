package com.prodemy.gen16.akademik.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "t_krs")
public class Krs {
    @EmbeddedId
    private KrsId id;

    @ManyToOne
    @JoinColumn(
            name = "nim", nullable = false, insertable = false, updatable = false,
            foreignKey = @ForeignKey(name = "fk_krs__mahasiswa")
    )
    private Mahasiswa mahasiwa;

    @ManyToOne
    @JoinColumn(
            name = "matkd", nullable = false, insertable = false, updatable = false,
            foreignKey = @ForeignKey(name = "fk_krs__matkul")
    )
    private MataKuliah mataKuliah;

    @Column(name = "nilai_akhir", length = 2)
    private String nilaiAkhir;
}
