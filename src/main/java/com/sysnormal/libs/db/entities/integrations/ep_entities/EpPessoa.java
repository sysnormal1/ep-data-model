package com.sysnormal.libs.db.entities.integrations.ep_entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

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
    private String fantasia;


    protected static final long TABLE_ID = 40009L;
    public static long getTableId() {
        return TABLE_ID;
    }
}
