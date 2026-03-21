package com.sysnormal.data.integrations.ep_data_model.entities;

import com.sysnormal.data.base_data_model.entities.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

/**
 * Entity class
 */
@MappedSuperclass
@Getter
@Setter
public abstract class BaseEpTableModel extends BaseEntity {

    @Id
    @Column(name = "COD")
    private Long cod;

    @Column(name = "CODORIGEMINFO")
    private Long codOrigemInfo;

    @Column(name = "CODSTATUSREG")
    private String codStatusReg;

}
