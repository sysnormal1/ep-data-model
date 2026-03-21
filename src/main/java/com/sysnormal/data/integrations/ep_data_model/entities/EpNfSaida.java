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
@Table(name = "EPNFSSAIDA")
public class EpNfSaida extends BaseEpTableModel {

    @Column(name = "CODSUP")
    private Long codSup;

    @Column(name = "CODNFENTREF")
    private Long codNfEntRef;

    @Column(name = "NUMTRANSSAIDAORIGEM")
    private Long numTransSaidaOrigem;

    @Column(name = "NUMNOTAORIGEM")
    private Long numNotaOrigem;

    @Column(name = "CODESPECIENF")
    private Long codEspecieNf;

    @Column(name = "CODFILIAL")
    private Long codFilial;

    @Column(name = "CODCOMPRADOR")
    private Long codComprador;

    @Column(name = "CODFORNECEDOR")
    private Long codFornecedor;

    @Column(name = "CODADMINISTRADOR")
    private Long codAdministrador;

    @Column(name = "CODVENDEDOR")
    private Long codVendedor;

    @Column(name = "CODCLIENTE")
    private Long codCliente;

    @Column(name = "DTEMISSAO")
    private LocalDateTime dtEmissao;

    @Column(name = "DTMOVIMENTACAO")
    private LocalDateTime dtMovimentacao;

    @Column(name = "DTCANCEL")
    private LocalDateTime dtCancel;

    @Column(name = "CHAVENFE")
    private String chaveNfe;

    @Column(name = "NRCTE")
    private Long nrCte;

    @Column(name = "NRCARGA")
    private Long nrCarga;

    @Column(name = "PLACA")
    private String placa;

    @Column(name = "NUMTRANSCTE")
    private Long numTransCte;

    @Column(name = "NUMTRANSCTEITEM")
    private Long numTransCteItem;

    @Column(name = "NUMTRANSCTECOMP")
    private Long numTransCteComp;

    @Column(name = "NUMSTRANSCTECOMPLS")
    private String numsTransCteCompls;

    @Column(name = "CODVEICULO")
    private Long codVeiculo;

    @Column(name = "CODMOTORISTA")
    private Long codMotorista;}
