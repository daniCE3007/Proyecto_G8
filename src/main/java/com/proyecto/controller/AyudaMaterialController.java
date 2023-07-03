package com.proyecto.controller;

import com.proyecto.Service.AyudaMaterialService;
import com.proyecto.domain.AyudaMaterial;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ayudaMaterial")
@Slf4j

public class AyudaMaterialController {
    
    @Autowired
    private AyudaMaterialService ayudaMaterialService;
    
    @GetMapping("/listado")
    public String page(Model model) {
        log.info("Consumo del recurso /ayudaMaterial/listado");
        List<AyudaMaterial> AyudasMateriales = ayudaMaterialService.getAyudasMateriales(false);
        model.addAttribute("AyudasMateriales", AyudasMateriales);
        model.addAttribute("Total", AyudasMateriales.size());
        return "/ayudaMaterial/listado";
    }
    
}
