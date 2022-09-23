package test;  /*esta es la conexion con la base de datos y traer la informacion de una tabla*/

import beans.Servicio;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {

    public static void main(String[] args) {
           listarServicio();
    }

    public static void actualizarServicio(int id_servicio, String nombre_servicio) {

        DBConnection con = new DBConnection();
        String sql = "UPDATE Servicio SET  nombre_servicio = " + " ' " + nombre_servicio + " ' WHERE id_servicio =" + id_servicio;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

    }

    public static void listarServicio() {
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM Servicio" ;
        try {
           Statement st = con.getConnection().createStatement();
           ResultSet rs= st.executeQuery(sql);
           while(rs.next()){
                  int id_servicio = rs.getInt("id_servicio");
                  String nombre_servicio = rs.getString("nombre_servicio");
                  Double coste = rs.getDouble("coste");
                  Servicio Servicios = new Servicio (id_servicio,nombre_servicio,coste);
                  System.out.println(Servicios.toString());
                  
            }
           st.executeQuery(sql);
           
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

    }
}