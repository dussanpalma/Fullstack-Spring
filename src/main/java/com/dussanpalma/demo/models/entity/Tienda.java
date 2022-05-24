package com.dussanpalma.demo.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tiendas")
public class Tienda implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_tiendas;
    
    private String nombre;

    private String direccion;

    private static final long serialVersionUID = 1L;

        
    public Long getId_tienda() {
        return id_tiendas;
    }

    public void setId_tienda(Long id_tienda) {
        this.id_tiendas = id_tienda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Long getId_tiendas() {
        return id_tiendas;
    }

    public void setId_tiendas(Long id_tiendas) {
        this.id_tiendas = id_tiendas;
    }
    

   

}
