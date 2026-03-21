package com.sysnormal.data.integrations.ep_data_model.repositories;

import com.sysnormal.data.integrations.ep_data_model.entities.EpTiposMovimentacoes;
import com.sysnormal.data.base_data_model.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpTiposMovimentacoesRepository extends BaseRepository<EpTiposMovimentacoes, Long> {

    }
