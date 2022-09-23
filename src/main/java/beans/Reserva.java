package beans;
import java.sql.Date;

public class Reserva {
    private int id_reserva;
    private String nombre_servicio;
    private String id_usuario;
    private int id_mascota;
    private int id_servicio;
    private Date fecha;
    private Date hora;
    private Double costo;
    private Double total;

    public Reserva(int id_reserva, String nombre_servicio, String id_usuario, int id_mascota, int id_servicio, Date fecha, Date hora, Double costo, Double total) {
        this.id_reserva = id_reserva;
        this.nombre_servicio = nombre_servicio;
        this.id_usuario = id_usuario;
        this.id_mascota = id_mascota;
        this.id_servicio = id_servicio;
        this.fecha = fecha;
        this.hora = hora;
        this.costo = costo;
        this.total = total;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public String getNombre_servicio() {
        return nombre_servicio;
    }

    public void setNombre_servicio(String nombre_servicio) {
        this.nombre_servicio = nombre_servicio;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Reserva{" + "id_reserva=" + id_reserva + ", nombre_servicio=" + nombre_servicio + ", id_usuario=" + id_usuario + ", id_mascota=" + id_mascota + ", id_servicio=" + id_servicio + ", fecha=" + fecha + ", hora=" + hora + ", costo=" + costo + ", total=" + total + '}';
    }
    
    
}
