/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeso_
 */
public class InscripcionData {
    private Connection con;

    public InscripcionData() {
        con = Conexion.getConexion();
    }

    public void guardarInscripcion(Inscripcion insc) {
        String sql = "INSERT INTO inscripcion (idAlumno, idMateria, nota) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, insc.getAlumno().getIdAlumno());
            ps.setInt(2, insc.getMateria().getIdMateria());
            ps.setDouble(3, insc.getNota());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al guardar inscripción: " + ex.getMessage());
        }
    }
    
    public List<Inscripcion> obtenerInscripciones() {
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                insc.setAlumno(alumno);
                insc.setMateria(materia);
                insc.setNota(rs.getDouble("nota"));
                
                inscripciones.add(insc);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener inscripciones: " + ex.getMessage());
        }
        return inscripciones;
    }
    
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno) {
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Inscripcion insc = new Inscripcion();
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                
                insc.setAlumno(alumno);
                insc.setMateria(materia);
                insc.setNota(rs.getDouble("nota"));
                
                inscripciones.add(insc);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener inscripciones por alumno: " + ex.getMessage());
        }
        return inscripciones;
    }
    
    public List<Materia> obtenerMateriasCursadas(int idAlumno) {
        List<Materia> materias = new ArrayList<>();
        String sql = "SELECT materia.idMateria, nombre, anio FROM inscripcion "
                   + "JOIN materia ON inscripcion.idMateria = materia.idMateria "
                   + "WHERE idAlumno = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener materias cursadas: " + ex.getMessage());
        }
        return materias;
    }
    
    public List<Materia> obtenerMateriasNOCursadas(int idAlumno) {
        List<Materia> materias = new ArrayList<>();
        String sql = "SELECT * FROM materia WHERE idMateria NOT IN "
                   + "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener materias no cursadas: " + ex.getMessage());
        }
        return materias;
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al borrar inscripción: " + ex.getMessage());
        }
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al actualizar nota: " + ex.getMessage());
        }
    }
    
    public List<Alumno> obtenerAlumnosXMateria(int idMateria) {
        List<Alumno> alumnos = new ArrayList<>();
        String sql = "SELECT alumno.idAlumno, alumno.dni, alumno.apellido, alumno.nombre "
                   + "FROM inscripcion JOIN alumno ON inscripcion.idAlumno = alumno.idAlumno "
                   + "WHERE idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumnos.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener alumnos por materia: " + ex.getMessage());
        }
        return alumnos;
    }
    
}
