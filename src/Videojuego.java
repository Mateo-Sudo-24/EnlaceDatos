public class Videojuego {
    private String nombre;
    private int anioSalida;
    private String genero;

    public Videojuego(String nombre, int anioSalida, String genero) {
        this.nombre = nombre;
        this.anioSalida = anioSalida;
        this.genero = genero;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioSalida() {
        return anioSalida;
    }

    public void setAnioSalida(int anioSalida) {
        this.anioSalida = anioSalida;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
