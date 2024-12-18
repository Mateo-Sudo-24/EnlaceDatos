import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:postgresql://localhost:5432/TallerEnlace";
    private static final String USER = "postgres";
    private static final String PASSWORD = "123456";

    public static Connection conectar() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a PostgreSQL.");
        } catch (SQLException e) {
            System.out.println("Error al conectar con PostgreSQL: " + e.getMessage());
        }
        return conexion;
    }
}
