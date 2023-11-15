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
public class PengampuId implements Serializable {
    @Column(name = "doskd", length = 20)
    private String kodeDosen;

    @Column(name = "matkd",length = 20)
    private String kodeMataKuliah;
}
