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
@Table(name = "t_pengampu")
public class Pengampu {
    @EmbeddedId
    private PengampuId id;

    @ManyToOne
    @JoinColumn(name = "doskd", nullable = false, insertable = false, updatable = false)
    private Dosen dosen;

    @ManyToOne
    @JoinColumn(name = "matkd", nullable = false, insertable = false, updatable = false)
    private MataKuliah mataKuliah;

    public Pengampu(PengampuId id) {
        this.id = id;
    }
}
