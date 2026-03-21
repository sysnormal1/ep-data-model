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
@Table(name = "EPCATEGORIASORIGEM")
public class EpCategoriaOrigem extends BaseEpTableModel {

    @Column(name = "DESCRICAO")
    private String descricao;}
