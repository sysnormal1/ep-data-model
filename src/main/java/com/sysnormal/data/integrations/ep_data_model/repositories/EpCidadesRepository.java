package com.sysnormal.data.integrations.ep_data_model.repositories;

import com.sysnormal.data.base_data_model.repositories.BaseRepository;
import com.sysnormal.data.integrations.ep_data_model.entities.EpCidade;
import org.springframework.stereotype.Repository;

@Repository
public interface EpCidadesRepository extends BaseRepository<EpCidade, Long> {
}
