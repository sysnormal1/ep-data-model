package com.sysnormal.libs.db.entities.integrations.ep_entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "EPCLIENTES")
public class EpCliente extends BaseEpTableModel {

    @Column(name = "CODPESSOA")
    private Long codPessoa;

    @Column(name = "CODFILIAL")
    private Long codFilial;

    @Column(name = "CODATIV")
    private Long codAtiv;

    @Column(name = "CODPRACA")
    private Long codPraca;

    @Column(name = "CODREDE")
    private Long codRede;

    @Column(name = "CODADMINISTRADOR1")
    private Long codAdministrador1;

    @Column(name = "CODADMINISTRADOR2")
    private Long codAdministrador2;

    @Column(name = "CODVENDEDOR1")
    private Long codVendedor1;

    @Column(name = "CODVENDEDOR2")
    private Long codVendedor2;

    @Column(name = "DTEXCLUSAO")
    private LocalDateTime dtExclusao;

    @Column(name = "DTULTCOMP")
    private LocalDateTime dtUltComp;

    protected static final long TABLE_ID = 40020L;
    public static long getTableId() {
        return TABLE_ID;
    }
}
