package com.prodemy.gen16.akademik.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class KrsId implements Serializable {
    @Column(name = "nim", length = 15)
    private String nimMahasiswa;

    @Column(name = "semester", length = 2)
    private String semester;

    @Column(name = "matkd", length = 20)
    private String kodeMataKuliah;
}
