/**
* @Project : Labaratorio 4
* @author Marcelo Detlefsen
* Creacion 08.11.2024
* Ultima modificacion 15.11.2024
* @File Name: Cancion.java
*/

public class Cancion 
{
    private String titulo;
    private String artista;
    private String genero;
    private float duracion;

    public Cancion(String titulo, String artista, String genero, float duracion) 
    {
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
    }

    public String reproducir() 
    {
        return "Reproduciendo: " + titulo + "\nArtista: " + artista + "\n[" + genero + "]\nDuracion: " + duracion + " min";
    }

    public String getTitulo() 
    {
        return titulo;
    }

    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }

    public String getArtista() 
    {
        return artista;
    }

    public void setArtista(String artista) 
    {
        this.artista = artista;
    }

    public String getGenero() 
    {
        return genero;
    }

    public void setGenero(String genero) 
    {
        this.genero = genero;
    }

    public float getDuracion() 
    {
        return duracion;
    }

    public void setDuracion(float duracion) 
    {
        this.duracion = duracion;
    }
}