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
@Table(name = "EPPESSOAS")
public class EpPessoa extends BaseEpTableModel {

    @Column(name = "CODTIPODOCIDENTIFICADOR")
    private Long codTipoDocIdentificador;

    @Column(name = "CODDOCIDENTIFICADOR")
    private String codDocIdentificador;

    @Column(name = "NOMERAZAO")
    private String nomeRazao;

    @Column(name = "FANTASIA")
    private String fantasia;}
