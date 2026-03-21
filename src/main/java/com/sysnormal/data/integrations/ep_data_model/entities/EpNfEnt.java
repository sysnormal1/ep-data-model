package com.sysnormal.data.integrations.ep_data_model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Entity class
 */
@Getter
@Setter
@Entity
@Table(name = "EPNFSENT")
public class EpNfEnt extends BaseEpTableModel {


    @Column(name = "CODSUP", precision = 38)
    private Long codSup;

    @Column(name = "CODNFSAIDAREF", precision = 38)
    private Long codNfSaidaRef;

    @Column(name = "NUMTRANSENTORIGEM", precision = 38)
    private Long numTransEntOrigem;

    @Column(name = "NUMNOTAORIGEM", precision = 38)
    private Long numNotaOrigem;

    @Column(name = "CODESPECIENF", nullable = false, precision = 9)
    private Integer codEspecieNf;

    @Column(name = "CODFILIAL", nullable = false, precision = 9)
    private Integer codFilial ;

    @Column(name = "CODCOMPRADOR", precision = 9)
    private Integer codComprador;

    @Column(name = "CODFORNECEDOR", precision = 9)
    private Integer codFornecedor;

    @Column(name = "CODADMINISTRADOR", precision = 9)
    private Integer codAdministrador;

    @Column(name = "CODVENDEDOR", precision = 9)
    private Integer codVendedor;

    @Column(name = "CODCLIENTE", precision = 38)
    private Long codCliente;

    @Column(name = "DTEMISSAO", nullable = false)
    private LocalDateTime dtEmissao;

    @Column(name = "DTMOVIMENTACAO", nullable = false)
    private LocalDateTime dtMovimentacao;

    @Column(name = "DTCANCEL")
    private LocalDateTime dtCancel;

    @Column(name = "CHAVENFE", length = 100)
    private String chaveNfe;

    @Column(name = "NRCTE", precision = 38)
    private Long nrCte;

    @Column(name = "NRCARGA", precision = 38)
    private Long nrCarga;

    @Column(name = "PLACA", length = 12)
    private String placa;

    @Column(name = "ORIGEMPED", length = 1)
    private String origemPed;}
