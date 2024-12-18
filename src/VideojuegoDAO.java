import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VideojuegoDAO {
    public boolean insertarVideojuego(Videojuego videojuego) {
        String sql = "INSERT INTO videojuegos (nombre, anio_salida, genero) VALUES (?, ?, ?)";
        try (Connection conexion = Conexion.conectar();
             PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setString(1, videojuego.getNombre());
            ps.setInt(2, videojuego.getAnioSalida());
            ps.setString(3, videojuego.getGenero());
            ps.executeUpdate();
            System.out.println("Videojuego insertado correctamente.");
            return true;
        } catch (SQLException e) {
            System.out.println("Error al insertar videojuego: " + e.getMessage());
            return false;
        }
    }
}
