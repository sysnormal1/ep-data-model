package com.sysnormal.data.integrations.ep_data_model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity class
 */
@Getter
@Setter
@Entity
@Table(name = "EPCIDADES")
public class EpCidade extends BaseEpTableModel {

    @Column(name = "NOME")
    private String nome;

    @Column(name = "UF", length = 2)
    private String uf;

    @Column(name = "CODIBGE")
    private Long codIbge;

    @Column(name = "POPULACAO")
    private Long populacao;
}
