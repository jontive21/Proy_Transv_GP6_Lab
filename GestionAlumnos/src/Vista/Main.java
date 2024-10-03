
package Vista;

import Modelo.Alumno;
import Modelo.Materia;
import Persistencia.AlumnoData;
import Persistencia.InscripcionData;
import Persistencia.MateriaData;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AlumnoData alumnoData = new AlumnoData();
        MateriaData materiaData = new MateriaData();
        InscripcionData inscripcionData = new InscripcionData();
       
        Alumno nuevoAlumno = new Alumno(0, "Javier", "Perez", 39797677, LocalDate.of(1995, 5, 20), true);
        alumnoData.guardarAlumno(nuevoAlumno);
        
        Materia nuevaMateria = new Materia(0, "Ingles", 2024);
        materiaData.guardarMateria(nuevaMateria);
        
        inscripcionData.inscribirAlumnoEnMateria(nuevoAlumno, nuevaMateria);

        
        List<Alumno> alumnos = alumnoData.obtenerAlumnos();
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        }
        List<Materia> materiasCursadas = inscripcionData.obtenerMateriasCursadas(nuevoAlumno.getIdAlumno());
        for (Materia materia : materiasCursadas) {
            System.out.println(materia.getNombre());
        }
        
    }
}

