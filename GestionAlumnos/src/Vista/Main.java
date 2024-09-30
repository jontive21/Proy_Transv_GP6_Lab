
package Vista;

import Modelo.Alumno;
import Persistencia.AlumnoData;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AlumnoData alumnoData = new AlumnoData();

        // Crear un nuevo alumno
        Alumno nuevoAlumno = new Alumno(0, "Carlos", "Perez", 12345678, LocalDate.of(1995, 5, 20), true);
        alumnoData.guardarAlumno(nuevoAlumno);

        // Mostrar todos los alumnos
        List<Alumno> alumnos = alumnoData.obtenerAlumnos();
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        }
    }
}

