
package com.unitec.diper;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Perfil {
    
    @Id
    private String id;
    private String nombre;
    private String paterno;
    private String email;
    private String celular;
    private int edad;
    
    //El siguiente es para la ultima localizacion, todavia no el historial
    Localizacion loca;

    @Override
    public String toString() {
        return "Perfil{" + "id=" + id + ", nombre=" + nombre + ", paterno=" + paterno + ", email=" + email + ", celular=" + celular + ", edad=" + edad + ", loca=" + loca + '}';
    }

    public Localizacion getLoca() {
        return loca;
    }

    public void setLoca(Localizacion loca) {
        this.loca = loca;
    }

    public Perfil() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
}
