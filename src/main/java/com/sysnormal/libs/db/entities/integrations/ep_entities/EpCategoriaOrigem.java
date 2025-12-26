package com.sysnormal.libs.db.entities.integrations.ep_entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "EPCATEGORIASORIGEM")
public class EpCategoriaOrigem extends BaseEpTableModel {

    @Column(name = "DESCRICAO")
    private String descricao;

    protected static final long TABLE_ID = 40191L;
    public static long getTableId() {
        return TABLE_ID;
    }
}
