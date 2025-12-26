package com.sysnormal.libs.db.entities.integrations.ep_entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "EPTIPOSMOVIMENTACOES")
public class EpTiposMovimentacoes extends BaseEpTableModel {

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "ENTRADA")
    private Integer entrada;

    @Column(name = "SAIDA")
    private Integer saida;

    @Column(name = "SIGLA")
    private String sigla;


    protected static final long TABLE_ID = 40003L;
    public static long getTableId() {
        return TABLE_ID;
    }
}
