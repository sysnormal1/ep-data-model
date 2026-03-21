package com.sysnormal.data.integrations.ep_data_model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

/**
 * Entity class
 */
@Getter @Setter
@Embeddable
public class EpUnifCargaId implements Serializable {

    @Column(name = "IDORIGEMINFO")
    private Long idOrigemInfo;

    @Column(name = "NRCARGA")
    private Long nrCarga;

    // equals e hashCode obrigatórios para chaves compostas

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EpUnifCargaId)) return false;
        EpUnifCargaId that = (EpUnifCargaId) o;
        return Objects.equals(idOrigemInfo, that.idOrigemInfo)
                && Objects.equals(nrCarga, that.nrCarga);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOrigemInfo, nrCarga);
    }
}