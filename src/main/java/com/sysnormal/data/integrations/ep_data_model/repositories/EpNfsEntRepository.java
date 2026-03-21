package com.sysnormal.data.integrations.ep_data_model.repositories;

import com.sysnormal.data.integrations.ep_data_model.entities.EpNfEnt;
import com.sysnormal.data.base_data_model.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpNfsEntRepository extends BaseRepository<EpNfEnt, Long> {

    }
