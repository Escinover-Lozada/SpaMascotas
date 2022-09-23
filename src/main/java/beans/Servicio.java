package beans;

public class Servicio {  
    private int id_servicio;
    private String nombre_servicio;
    private Double coste;

    public Servicio(int id_servicio, String nombre_servicio, Double coste) {
        this.id_servicio = id_servicio;
        this.nombre_servicio = nombre_servicio;
        this.coste = coste;   
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getNombre_servicio() {
        return nombre_servicio;
    }

    public void setNombre_servicio(String nombre_servicio) {
        this.nombre_servicio = nombre_servicio;
    }

    public Double getCoste() {
        return coste;
    }

    public void setCoste(Double coste) {
        this.coste = coste;
    }

    @Override
    public String toString() {
        return "Servicio{" + "id_servicio=" + id_servicio + ", nombre_servicio=" + nombre_servicio + ", coste=" + coste + '}';
    } 
    
}