
package AccesoADatos;



import Entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AlumnoData {
    private Connection con;

    public AlumnoData() {
        con = Conexion.getConexion();
    }

    /*
       Método guardarAlumno cambiado para poder usarlo en las vistas.
       Ahora retorna un String en vez de un sout.
    */
    public String guardarAlumno(Alumno alumno) {
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, java.sql.Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
            }
            ps.close();
            return "¡Se ha completado el envio!";
        } catch (SQLException ex) {
            System.out.println("Error al guardar el alumno: " + ex.getMessage());
            return "No se ha podido establecer la conexión: " + ex.getMessage();
        }
    }

    public Alumno buscarAlumnoPorId(int id) {
        Alumno alumno = null;
        String sql = "SELECT * FROM alumno WHERE idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar alumno: " + ex.getMessage());
        }
        return alumno;
    }
    
    public Alumno buscarAlumnoPorDni(int dni) {
            Alumno alumno = null;
            String sql = "SELECT * FROM alumno WHERE dni = ?";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, dni);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    alumno = new Alumno();
                    alumno.setIdAlumno(rs.getInt("idAlumno"));
                    alumno.setDni(rs.getInt("dni"));
                    alumno.setApellido(rs.getString("apellido"));
                    alumno.setNombre(rs.getString("nombre"));
                    alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                    alumno.setEstado(rs.getBoolean("estado"));
                }
                ps.close();
            } catch (SQLException ex) {
                System.out.println("Error al buscar alumno por DNI: " + ex.getMessage());
            }
            return alumno;
    }
    
        public List<Alumno> listarAlumnos() {
           List<Alumno> alumnos = new ArrayList<>();
            String sql = "SELECT * FROM alumno WHERE estado = 1"; // Solo alumnos activos
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    Alumno alumno = new Alumno();
                    alumno.setIdAlumno(rs.getInt("idAlumno"));
                    alumno.setDni(rs.getInt("dni"));
                    alumno.setApellido(rs.getString("apellido"));
                    alumno.setNombre(rs.getString("nombre"));
                    alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                    alumno.setEstado(rs.getBoolean("estado"));
                    alumnos.add(alumno);
                }
                ps.close();
            } catch (SQLException ex) {
                System.out.println("Error al obtener alumnos: " + ex.getMessage());
            }
            return alumnos;
        }
        
        public String modificarAlumno(Alumno alumno) {
            String sql = "UPDATE alumno SET dni = ?, apellido = ?, nombre = ?, fechaNacimiento = ?, estado = ? WHERE idAlumno = ?";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, alumno.getDni());
                ps.setString(2, alumno.getApellido());
                ps.setString(3, alumno.getNombre());
                ps.setDate(4, java.sql.Date.valueOf(alumno.getFechaNacimiento()));
                ps.setBoolean(5, alumno.isEstado());
                ps.setInt(6, alumno.getIdAlumno());
                ps.executeUpdate();
                ps.close();
                return "¡Alumno actualizado con éxito!";
            } catch (SQLException ex) {
                System.out.println("Error al actualizar alumno: " + ex.getMessage());
                return "Error al actualizar alumno: " + ex.getMessage();
            }

        }
        
        public String eliminarAlumno(int idAlumno) {
            String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = ?";
            try {
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, idAlumno);
                ps.executeUpdate();
                ps.close();
                return "¡Alumno eliminado (desactivado) con éxito!";
            } catch (SQLException ex) {
                System.out.println("Error al eliminar alumno: " + ex.getMessage());
                return "Error al eliminar alumno: " + ex.getMessage();
            }
        }
}