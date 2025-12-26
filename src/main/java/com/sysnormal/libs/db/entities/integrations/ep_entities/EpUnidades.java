package com.sysnormal.libs.db.entities.integrations.ep_entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "EPUNIDADES")
public class EpUnidades extends BaseEpTableModel {

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "SIGLA")
    private String sigla;


    protected static final long TABLE_ID = 40004L;
    public static long getTableId() {
        return TABLE_ID;
    }
}
