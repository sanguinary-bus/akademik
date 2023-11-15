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
@Table(name = "t_fakultas")
public class Fakultas {
    @Id
    @Column(name = "fakkd", length = 10)
    private String kode;

    @Column(name = "faknm", length = 50)
    private String nama;

    // @OneToMany()
    // private List<ProgramStudi> programStudi;
}
