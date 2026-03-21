package com.sysnormal.data.integrations.ep_data_model.repositories;

import com.sysnormal.data.integrations.ep_data_model.entities.EpUnifCarga;
import com.sysnormal.data.integrations.ep_data_model.entities.EpUnifCargaId;
import com.sysnormal.data.base_data_model.repositories.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EpUnifCargasRepository extends BaseRepository<EpUnifCarga, EpUnifCargaId> {

    Optional<EpUnifCarga> findByEmbebedIdIdOrigemInfoAndEmbebedIdNrCarga(Long embebedIdIdOrigemInfo, Long embebedIdNrCarga);
    Optional<EpUnifCarga> findByIdAndEmbebedIdIdOrigemInfo(Long id, Long embebedIdIdOrigemInfo);
}
