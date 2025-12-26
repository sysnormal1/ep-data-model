package com.sysnormal.libs.db.entities.integrations.ep_entities;

import com.sysnormal.libs.db.entities.base_entities.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "EPUNIFCARGAS")
@Immutable
public class EpUnifCarga extends BaseEntity {

    @EmbeddedId
    private EpUnifCargaId embebedId;

    @Column(name = "ID")
    private Long id;

    @Column(name = "DTUNIFICACAO")
    private LocalDateTime dtUnificacao;

    @Column(name = "MAQUINAUNIFICACAO")
    private String maquinaUnificacao;

    protected static final long TABLE_ID = 40100L;
    public static long getTableId() {
        return TABLE_ID;
    }
}
