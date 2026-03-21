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
@Table(name = "EPMOVIMENTACOESENT")
public class EpMovimentacaoEnt extends BaseEpTableModel {

    @Column(name = "NUMTRANSITEMORIGEM", precision = 38)
    private Long numtransitemorigem;

    @Column(name = "CODNFENT", nullable = false, precision = 38)
    private Long codnfent;

    @Column(name = "CODPROD", nullable = false, precision = 38)
    private Long codprod;

    @Column(name = "CODFORNEC", nullable = false, precision = 9)
    private Integer codfornec;

    @Column(name = "CODOPER", nullable = false, precision = 9)
    private Integer codoper;

    @Column(name = "CODEPTO", precision = 9)
    private Integer codepto;

    @Column(name = "CODUNIDADE", nullable = false, precision = 9)
    private Integer codunidade;

    @Column(name = "QTENT", nullable = false, precision = 38, scale = 10)
    private BigDecimal qtent;

    @Column(name = "QTDEVOLVIDA", precision = 38, scale = 10)
    private BigDecimal qtdevolvida;

    @Column(name = "VLUN", nullable = false, precision = 38, scale = 10)
    private BigDecimal vlun;

    @Column(name = "PESOLIQUN", precision = 38, scale = 10)
    private BigDecimal pesoliqun;

    @Column(name = "PESOBRUTOUN", precision = 38, scale = 10)
    private BigDecimal pesobrutoun;

    @Column(name = "DTMOVIMENTACAO", nullable = false)
    private LocalDateTime dtmovimentacao;

    @Column(name = "DTCANCEL")
    private LocalDateTime dtcancel;

    @Column(name = "CODMOTIVO", precision = 12)
    private Long codmotivo;

    @Column(name = "NUMNFSAIDA", precision = 22)
    private Long numnfsaida;

    @Column(name = "CODNFSAIDA", precision = 22)
    private Long codnfsaida;

    @Column(name = "NUMTRANASSAIDAORIGEM", precision = 22)
    private Long numtranassaidaorigem;

    @Column(name = "VLUNCMV", precision = 38, scale = 10)
    private BigDecimal vluncmv;}
