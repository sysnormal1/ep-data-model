package com.sysnormal.data.integrations.ep_data_model.entities;

import com.sysnormal.data.base_data_model.entities.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;

import java.time.LocalDateTime;

/**
 * Entity class
 */
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
    private String maquinaUnificacao;}
