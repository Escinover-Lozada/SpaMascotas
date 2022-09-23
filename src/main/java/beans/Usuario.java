package beans;
public class Usuario {
    private String id_usuario;
    private String contrasena;
    private String primer_nombre;
    private String segundo_nombre;
    private String primer_apellido;
    private String segundo_apellido;
    private int celular;
    private String email;

    public Usuario(String id_usuario, String contrasena, String primer_nombre, String segundo_nombre, String primer_apellido, String segujndo_apellido, int celular, String email) {
        this.id_usuario = id_usuario;
        this.contrasena = contrasena;
        this.primer_nombre = primer_nombre;
        this.segundo_nombre = segundo_nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segujndo_apellido;
        this.celular = celular;
        this.email = email;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegujndo_apellido() {
        return segundo_apellido;
    }

    public void setSegujndo_apellido(String segujndo_apellido) {
        this.segundo_apellido = segujndo_apellido;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + ", contrasena=" + contrasena + ", primer_nombre=" + primer_nombre + ", segundo_nombre=" + segundo_nombre + ", primer_apellido=" + primer_apellido + ", segujndo_apellido=" + segundo_apellido + ", celular=" + celular + ", email=" + email + '}';
    }
    
    
    
}
