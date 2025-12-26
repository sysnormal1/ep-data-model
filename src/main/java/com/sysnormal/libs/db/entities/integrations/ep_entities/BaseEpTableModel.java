package com.sysnormal.libs.db.entities.integrations.ep_entities;

import com.sysnormal.libs.db.entities.base_entities.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

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
