package com.proyecto.Service.Impl;

import com.proyecto.Service.AyudaMaterialService;
import com.proyecto.dao.AyudaMaterialDao;
import com.proyecto.domain.AyudaMaterial;
import java.security.spec.NamedParameterSpec;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class AyudaMaterialServiceImpl implements AyudaMaterialService {

    @Autowired
    AyudaMaterialDao ayudaMaterialDao;

    @Override
    @Transactional(readOnly = true)
    public List<AyudaMaterial> getAyudasMateriales(boolean activa) {
        List<AyudaMaterial> AyudasMateriales = ayudaMaterialDao.findAll();
        if (activa) {
            AyudasMateriales.removeIf(x -> !x.isActiva());
        }
        return AyudasMateriales;
    }

    @Override
    @Transactional(readOnly = true)
    public AyudaMaterial getAyudaMaterial(AyudaMaterial ayudaMaterial) {
        return ayudaMaterialDao.findById(ayudaMaterial.getIdAyuda()).orElse(null);
    }

    @Override
    @Transactional
    public void save(AyudaMaterial ayudaMaterial) {
        ayudaMaterialDao.save(ayudaMaterial);
    }

    @Override
    @Transactional
    public void delete(AyudaMaterial ayudaMaterial) {
        ayudaMaterialDao.delete(ayudaMaterial);
    }

}
