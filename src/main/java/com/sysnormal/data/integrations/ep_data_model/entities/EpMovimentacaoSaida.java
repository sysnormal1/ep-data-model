package com.sysnormal.data.integrations.ep_data_model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Entity class
 */
@Getter
@Setter
@Entity
@Table(name = "EPMOVIMENTACOESSAIDA")
public class EpMovimentacaoSaida extends BaseEpTableModel {

    @Column(name = "NUMTRANSITEMORIGEM")
    private Long numTransItemOrigem;

    @Column(name = "CODNFSAIDA")
    private Long codNfSaida;

    @Column(name = "CODPROD")
    private Long codProd;

    @Column(name = "CODFORNEC")
    private Long codFornec;

    @Column(name = "CODOPER")
    private Long codOper;

    @Column(name = "CODEPTO")
    private Long codepto;

    @Column(name = "CODUNIDADE")
    private Long codUnidade;

    @Column(name = "QTSAIDA")
    private BigDecimal qtSaida;

    @Column(name = "QTDEVOLVIDA")
    private BigDecimal qtDevolvida;

    @Column(name = "VLUN")
    private BigDecimal vlUn;

    @Column(name = "PESOLIQUN")
    private BigDecimal pesoLiqUn;

    @Column(name = "PESOBRUTOUN")
    private BigDecimal pesoBrutoUn;

    @Column(name = "DTMOVIMENTACAO")
    private LocalDateTime dtMovimentacao;

    @Column(name = "DTCANCEL")
    private LocalDateTime dtCancel;

    @Column(name = "PERCDESCFIN")
    private BigDecimal percDescFin;}
