package com.proyecto.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity 
@Table(name ="AyudaMaterial")
public class AyudaMaterial implements Serializable{
    
    private static final long serialVersiobUID = 1L;
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ayuda")      
    private long idAyuda; // el Serializable lo TRANFORMAR EN id_categoria de la base de datos
    private String descripcion; 
    private String entrega;
    private boolean activa;

    public AyudaMaterial() {
    }

    public AyudaMaterial(String descripcion, String entrega, boolean activa) {
        this.descripcion = descripcion;
        this.entrega = entrega;
        this.activa = activa;
    }

    
}

