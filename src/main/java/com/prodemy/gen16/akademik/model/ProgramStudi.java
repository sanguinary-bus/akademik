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
@Table(name = "t_prodi")
public class ProgramStudi {
    @Id
    @Column(name = "prodkd", length = 20)
    private String kode;

    @Column(name = "prodnm", length = 100, nullable = false)
    private String nama;

    @Column(name = "fakkd", length = 20, nullable = false)
    private String kodeFakultas;

    @ManyToOne
    @JoinColumn(name = "fakkd", nullable = false, insertable = false, updatable = false)
    private Fakultas fakultas;
}
