/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.beans;

import com.text.interfaces.IVivienda;

/**
 *
 * @author Daniel Casado
 */
public class Persona {
    
    private int id;
    private String nombre;
    private IVivienda vivienda;
    private Ciudad ciudad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public IVivienda getVivienda() {
        return vivienda;
    }

    public void setVivienda(IVivienda vivienda) {
        this.vivienda = vivienda;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }
}

