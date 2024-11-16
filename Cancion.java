/**
 * Clase Cancion que representa una canción en una lista de reproducción.
 * 
 * @Project : Laboratorio 4
 * @author Marcelo Detlefsen
 * @Creacion : 08.11.2024
 * @Ultima modificacion : 15.11.2024
 * @File Name: Cancion.java
 */
public class Cancion {

    private String titulo;   // Título de la canción.
    private String artista;  // Artista de la canción.
    private String genero;   // Género musical de la canción.
    private float duracion;  // Duración de la canción en minutos.

    /**
     * Constructor de la clase Cancion que inicializa los atributos con los valores proporcionados.
     * 
     * @param titulo el título de la canción.
     * @param artista el artista de la canción.
     * @param genero el género musical de la canción.
     * @param duracion la duración de la canción en minutos.
     */
    public Cancion(String titulo, String artista, String genero, float duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
    }

    /**
     * Método que simula la reproducción de la canción, mostrando sus detalles.
     * 
     * @return una cadena de texto con el título, artista, género y duración de la canción.
     */
    public String reproducir() {
        return "Reproduciendo: " + titulo + "\nArtista: " + artista + "\n[" + genero + "]\nDuracion: " + duracion + " min";
    }

    /**
     * Obtiene el título de la canción.
     * 
     * @return el título de la canción.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título de la canción.
     * 
     * @param titulo el nuevo título de la canción.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el nombre del artista de la canción.
     * 
     * @return el nombre del artista de la canción.
     */
    public String getArtista() {
        return artista;
    }

    /**
     * Establece el nombre del artista de la canción.
     * 
     * @param artista el nuevo nombre del artista.
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    /**
     * Obtiene el género musical de la canción.
     * 
     * @return el género musical de la canción.
     */
    public String getGenero() {
        return genero;
    }

    /**
     * Establece el género musical de la canción.
     * 
     * @param genero el nuevo género musical de la canción.
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Obtiene la duración de la canción.
     * 
     * @return la duración de la canción en minutos.
     */
    public float getDuracion() {
        return duracion;
    }

    /**
     * Establece la duración de la canción.
     * 
     * @param duracion la nueva duración de la canción en minutos.
     */
    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }
}