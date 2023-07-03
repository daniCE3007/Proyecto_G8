package com.proyecto.Service;

import com.proyecto.domain.AyudaMaterial;
import java.util.List;

public interface AyudaMaterialService {

    public List<AyudaMaterial> getAyudasMateriales(boolean activa);

    public AyudaMaterial getAyudaMaterial(AyudaMaterial ayudaMaterial);

    public void save(AyudaMaterial ayudaMaterial);

    public void delete(AyudaMaterial ayudaMaterial);

}
