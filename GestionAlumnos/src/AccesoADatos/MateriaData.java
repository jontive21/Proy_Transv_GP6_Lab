/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeso_
 */
public class MateriaData {
    private Connection con;

    public MateriaData() {
        con = Conexion.getConexion();
    }

    public String guardarMateria(Materia materia) {
        String sql = "INSERT INTO materia (nombre, anio, activo) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
            }
            ps.close();
            return "La materia se ha enviado correctamente.";
        } catch (SQLException ex) {
            return "Error al guardar la materia " + ex;
        }
    }

    public Materia buscarMateriaPorId(int id) {
        Materia materia = null;
        String sql = "SELECT * FROM Materia WHERE idMateria = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                materia = new Materia(rs.getInt("idMateria"), rs.getString("nombre"), rs.getInt("anio"), rs.getBoolean("activo"));
            }
        } catch (SQLException ex) {
            System.out.println("Error al buscar materia: " + ex.getMessage());
        }
        return materia;
    }
    
    public String modificarMateria(Materia materia) {
        String sql = "UPDATE Materia SET nombre = ?, anio = ?, activo = ? WHERE idMateria = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isActivo());
            ps.setInt(4, materia.getIdMateria());
            ps.executeUpdate();
            ps.close();
            return "La matería se actualizó correctamente";
        } catch (SQLException ex) {
            return "No se ha podido actualizar la materia: " + ex;
        }
    }
    
    public String eliminarMateria(int id) {
        String sql = "UPDATE Materia SET activo = 0 WHERE idMateria = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            return "La materia se ha eliminado correctamente";
        } catch (SQLException ex) {
            return "No se pudo eliminar la materia";
        }
    }
    
    public List<Materia> listarMaterias() {
        List<Materia> materias = new ArrayList<>();
        String sql = "SELECT * FROM Materia";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia(rs.getInt("idMateria"), rs.getString("nombre"),
                    rs.getInt("anio"), rs.getBoolean("activo"));
                materias.add(materia);
            }
        } catch (SQLException ex) {
            System.out.println("Error al listar materias: " + ex.getMessage());
        }
        return materias;
    }
    
    public String borrarMateria(int id) {
        String sql = "DELETE FROM Materia WHERE idMateria = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            return "La materia se ha eliminado correctamente";
        } catch (SQLException ex) {
            return "No se pudo eliminar la materia";
        }
    }
}
