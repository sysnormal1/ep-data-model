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
@Table(name = "EPPRODUTOS")
public class EpProduto extends BaseEpTableModel {

    @Column(name = "ATIVO")
    private Integer ativo;

    @Column(name = "CODCATEGORIAORIGEM")
    private Long codCategoriaOrigem;

    @Column(name = "CODEPTO")
    private Long codepto;

    @Column(name = "CODFORNEC")
    private Long codFornec;

    @Column(name = "CODNEGOCIOORIGEM")
    private Long codNegocioOrigem;

    @Column(name = "CODUNIDADE")
    private Long codUnidade;

    @Column(name = "CURVA_ARBITRARIA")
    private String curvaArbitraria;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "DTEXCLUSAO")
    private LocalDateTime dtExclusao;

    @Column(name = "PESOBRUTOUN")
    private BigDecimal pesoBrutoUn;

    @Column(name = "PESOLIQUN")
    private BigDecimal pesoLiqUn;

    @Column(name = "TEMPERARMAZPADRAO")
    private BigDecimal temperArmazPadrao;}
