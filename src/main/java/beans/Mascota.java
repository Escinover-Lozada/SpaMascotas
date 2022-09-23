package beans;

import java.sql.Date;

public class Mascota {
    
    private int id_mascota;
    private String nombre_mascota;
    private String raza;
    private String genero;
    private String tamaño;
    private Date cumpleaños;
    private String vacunado;
    private String esterilizado;
    private String observaciones;

    public Mascota(int id_mascota, String nombre_mascota, String raza, String genero, String tamaño, Date cumpleaños, String vacunado, String esterilizado, String observaciones) {
        this.id_mascota = id_mascota;
        this.nombre_mascota = nombre_mascota;
        this.raza = raza;
        this.genero = genero;
        this.tamaño = tamaño;
        this.cumpleaños = cumpleaños;
        this.vacunado = vacunado;
        this.esterilizado = esterilizado;
        this.observaciones = observaciones;
    }

    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public String getNombre_mascota() {
        return nombre_mascota;
    }

    public void setNombre_mascota(String nombre_mascota) {
        this.nombre_mascota = nombre_mascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public Date getCumpleaños() {
        return cumpleaños;
    }

    public void setCumpleaños(Date cumpleaños) {
        this.cumpleaños = cumpleaños;
    }

    public String getVacunado() {
        return vacunado;
    }

    public void setVacunado(String vacunado) {
        this.vacunado = vacunado;
    }

    public String getEsterilizado() {
        return esterilizado;
    }

    public void setEsterilizado(String esterilizado) {
        this.esterilizado = esterilizado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id_mascota=" + id_mascota + ", nombre_mascota=" + nombre_mascota + ", raza=" + raza + ", genero=" + genero + ", tama\u00f1o=" + tamaño + ", cumplea\u00f1os=" + cumpleaños + ", vacunado=" + vacunado + ", esterilizado=" + esterilizado + ", observaciones=" + observaciones + '}';
    }
        
}