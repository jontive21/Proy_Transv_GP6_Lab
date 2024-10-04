
package AccesoADatos;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    private static final String URL = "jdbc:mariadb://localhost:3306/nombrebasededatos";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";
    private static Connection conexion = null;

    private Conexion() {}

    public static Connection getConexion() {
        if (conexion == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver"); // Cargar el driver
                conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
                System.out.println("Conexión exitosa.");
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conexion;
    }
}

