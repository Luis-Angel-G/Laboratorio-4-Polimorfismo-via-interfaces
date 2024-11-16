import java.util.ArrayList;
import java.util.List;

/**
* @Project : Labaratorio 4
* @author Marcelo Detlefsen
* Creacion 08.11.2024
* Ultima modificacion 15.11.2024
* @File Name: Radio.java
*/

public class Radio 
{
    protected boolean encendido = false;
    protected double emisoraActual;
    protected int volumen = 0;
    protected int canci = 0;
    protected ArrayList<Double> emisorasGuardadasAM = new ArrayList<>();
    protected ArrayList<Double> emisorasGuardadasFM = new ArrayList<>();
    protected ArrayList<Cancion> YoungMikoSpotify = new ArrayList<>();
    protected ArrayList<Cancion> AnaMenaCD = new ArrayList<>();
    protected ArrayList<Cancion> EmiliaMP3 = new ArrayList<>();
    protected ArrayList<Cancion> RockSpotify = new ArrayList<>();
    protected ArrayList<Cancion> ClasicaCD = new ArrayList<>();
    protected ArrayList<Cancion> PopMP3 = new ArrayList<>();
    protected Cancion cancionActual;
    protected boolean band = true;
    protected int list;
    protected double emisoraActualFM = 87.5;
    protected double emisoraActualAM = 520;
    protected int conexion = 1;
    protected String cambiar;

    // Constructor de la clase Radio
    public Radio() {
        // Lista de canciones de Young Miko en Spotify
        YoungMikoSpotify.add(new Cancion("Tamagotchi", "Young Miko", "Trap", 2.95f));
        YoungMikoSpotify.add(new Cancion("Princess Peach", "Young Miko", "Urbano", 2.78f));
        YoungMikoSpotify.add(new Cancion("Classy 101", "Young Miko", "Urbano", 3.27f));

        // Lista de canciones de Ana Mena en CD
        AnaMenaCD.add(new Cancion("Carita Triste", "Ana Mena", "Pop Latino", 2.93f));
        AnaMenaCD.add(new Cancion("La Razon", "Ana Mena", "Pop", 2.72f));
        AnaMenaCD.add(new Cancion("Las 12", "Ana Mena", "Pop Latino", 3.13f));

        // Lista de canciones de Emilia Mernes en MP3
        EmiliaMP3.add(new Cancion("La_Playlist.mpeg", "Emilia Mernes", "Pop", 2.50f));
        EmiliaMP3.add(new Cancion("Una Foto Remix", "Emilia Mernes", "Reggaeton", 4.07f));
        EmiliaMP3.add(new Cancion("La_Original.mp3", "Emilia Mernes", "Pop Latino", 2.37f));

        // Lista de canciones de Rock en Spotify
        RockSpotify.add(new Cancion("Bohemian Rhapsody", "Queen", "Rock", 5.55f));
        RockSpotify.add(new Cancion("Stairway to Heaven", "Led Zeppelin", "Rock", 8.02f));
        RockSpotify.add(new Cancion("Back In Black", "AC/DC", "Rock", 4.15f));

        // Lista de canciones de música clásica en CD
        ClasicaCD.add(new Cancion("Canon in D Major", "Johann Pachelbel", "Clásica", 4.00f));
        ClasicaCD.add(new Cancion("Für Elise", "Ludwig van Beethoven", "Clásica", 2.53f));
        ClasicaCD.add(new Cancion("Symphony No. 5", "Ludwig van Beethoven", "Clásica", 7.05f));

        // Lista de canciones de Pop en MP3
        PopMP3.add(new Cancion("Blinding Lights", "The Weeknd", "Pop", 3.20f));
        PopMP3.add(new Cancion("Bad Romance", "Lady Gaga", "Pop", 4.55f));
        PopMP3.add(new Cancion("Shape of You", "Ed Sheeran", "Pop", 3.53f));
    }

    public String encenderApagar() 
    {
        encendido = !encendido;
        return encendido ? "Radio encendida" : "Radio apagada";
    }

    public String cambiarVolumen(String cambio) 
    {
        if (cambio.equals("<")) 
        {
            if (volumen == 0){
                return "Volumen actual: " + volumen;
            } else{
                volumen -= 1;
                return "Volumen actual: " + volumen;
            }
        } else if (cambio.equals(">")){
            if (volumen == 100){
                return "Volumen actual: " + volumen;
            } else{
                volumen += 1;
                return "Volumen actual: " + volumen;
            }
        } 
        else 
        {
            return "Comando no reconocido.";
        }
    }

    public String cambiarBanda() 
    {
        band = !band;
        emisoraActual = band ? emisoraActualAM : emisoraActualFM;
        return "Banda cambiada a: " + (band ? "AM" : "FM");
    }

    public String cambiarEmisora() 
    {
        if (!band) {
            emisoraActualFM = emisoraActualFM + 0.5 > 108.0 ? 87.5 : emisoraActualFM + 0.5;
            emisoraActual = emisoraActualFM;
        } else {
            emisoraActualAM = emisoraActualAM + 5 > 1605 ? 520 : emisoraActualAM + 5;
            emisoraActual = emisoraActualAM;
        }
        return "Emisora actual: " + emisoraActual;
    }

    public String guardarEmisora(int guardar) {
        // Verifica que el índice esté dentro del rango 1-50
        if (guardar > 0 && guardar <= 50) {
            // Ajusta el índice para que funcione con la lista (0 a 49)
            int index = guardar - 1;
            
            if (band) { // AM
                // Asegura que la lista tenga el tamaño adecuado
                while (emisorasGuardadasAM.size() <= index) {
                    emisorasGuardadasAM.add(null); // Rellena con null si es necesario
                }
                // Verifica que la posición esté vacía
                if (emisorasGuardadasAM.get(index) == null) {
                    emisorasGuardadasAM.set(index, emisoraActualAM);
                    return "Emisora AM " + emisoraActualAM + " guardada en: " + guardar;
                } else {
                    return "Ese espacio está lleno.";
                }
            } else { // FM
                // Asegura que la lista tenga el tamaño adecuado
                while (emisorasGuardadasFM.size() <= index) {
                    emisorasGuardadasFM.add(null); // Rellena con null si es necesario
                }
                // Verifica que la posición esté vacía
                if (emisorasGuardadasFM.get(index) == null) {
                    emisorasGuardadasFM.set(index, emisoraActualFM);
                    return "Emisora FM " + emisoraActualFM + " guardada en: " + guardar;
                } else {
                    return "Ese espacio está lleno.";
                }
            }
        }
        return "No existe ese espacio para guardar.";
    }

    public String cargarEmisora(int indice) 
    {
        if (band){
            if (indice > 0 && indice <= emisorasGuardadasAM.size()) 
            {
                if (emisorasGuardadasAM.get(indice - 1) != null){
                    emisoraActualAM = emisorasGuardadasAM.get(indice - 1);
                    return "Emisora cargada: " + emisoraActualAM;
                } else{
                    return "No hay ninguna emisora guardada en esta posicion.";
                }
            } 
            else 
            {
                return "Indice de emisora no valido." + "\n" + -1;
            }
        } else {
            if (indice > 0 && indice <= emisorasGuardadasFM.size()) 
            {
                if (emisorasGuardadasFM.get(indice - 1) != null){
                    emisoraActualFM = emisorasGuardadasFM.get(indice - 1);
                    return "Emisora cargada: " + emisoraActualFM;
                }else{
                    return "No hay ninguna emisora guardada en esta posicion.";
                }
            } 
            else 
            {
                return "Indice de emisora no valido." + "\n" + -1;
            }
        }
    }

    public String seleccionarListaSpotify(int lista){
        if (lista == 1){
            list = 1;
            return "Se selecciono la lista de Young Miko.";
        } else if (lista == 2){
            list = 4;
            return "Se selecciono la lista de rock.";
        } else{
            return "No existen mas listas de reproduccion.";
        }
    }

    public String seleccionarListaCD(int lista){
        if (lista == 1){
            list = 2;
            return "Se selecciono la lista de Ana Mena.";
        } else if (lista == 2){
            list = 5;
            return "Se selecciono la lista de clasica.";
        } else{
            return "No existen mas listas de reproduccion.";
        }
    }

    public String seleccionarListaMP3(int lista){
        if (lista == 1){
            list = 3;
            return "Se selecciono la lista de Emilia Mernes.";
        } else if (lista == 2){
            list = 6;
            return "Se selecciono la lista de pop.";
        } else{
            return "No existen mas listas de reproduccion.";
        }
    }


    public String cambiarCancion(String cambio) {
        List<Cancion> playlist;

        // Asignamos la lista según el valor de "list"
        switch (list) {
            case 1:
                playlist = YoungMikoSpotify;
                break;
            case 2:
                playlist = AnaMenaCD;
                break;
            case 3:
                playlist = EmiliaMP3;
                break;
            case 4:
                playlist = RockSpotify;
                break;
            case 5:
                playlist = ClasicaCD;
                break;
            case 6:
                playlist = PopMP3;
                break;
            default:
                return "Lista no encontrada.";
        }

        // Validamos el comando
        if (cambio.equals("<")) {
            canci = (canci > 0) ? canci - 1 : playlist.size() - 1;
        } else if (cambio.equals(">")) {
            canci = (canci < playlist.size() - 1) ? canci + 1 : 0;
        } else {
            return "Comando no reconocido.";
        }

        // Obtenemos y reproducimos la canción actualizada
        Cancion cancion = playlist.get(canci);
        return cancion.getTitulo();
    }

    public String escucharCancion() {
        List<Cancion> playlist;
    
        // Asignamos la lista según el valor de "list"
        switch (list) {
            case 1:
                playlist = YoungMikoSpotify;
                break;
            case 2:
                playlist = AnaMenaCD;
                break;
            case 3:
                playlist = EmiliaMP3;
                break;
            case 4:
                playlist = RockSpotify;
                break;
            case 5:
                playlist = ClasicaCD;
                break;
            case 6:
                playlist = PopMP3;
                break;
            default:
                return "Lista no encontrada.";
        }
    
        // Reproducimos la canción actual
        Cancion cancion = playlist.get(canci);
        return cancion.reproducir();
    }

    public String toStringRadio() {

        String onda;
        double frecuencia;
        String guard;
        int guardado;

        if (band){
            onda = "AM";
            frecuencia = emisoraActualAM;
            if (emisorasGuardadasAM.contains(frecuencia)){
                guardado = emisorasGuardadasAM.indexOf(frecuencia) + 1;
                guard = "la frecuencia se encuentra guardada en " + guardado;
            } else{
                guard = "la frecuencia no se encuentra guardada";
            }
        } else {
            onda = "FM";
            frecuencia = emisoraActualFM;
            if (emisorasGuardadasFM.contains(frecuencia)){
                guardado = emisorasGuardadasFM.indexOf(frecuencia) + 1;
                guard = "la frecuencia se encuentra guardada en " + guardado;
            } else{
                guard = "la frecuencia no se encuentra guardada";
            }
        }


        return "Se encuentra en la banda " + onda + ", emisora " + frecuencia + ", " + guard + ", con volumen " + volumen;
    }

    public void cambiarConexion(int conexion) 
    {
        if (conexion == 1){
            cambiar = "CD";
        } else if (conexion == 2){
            cambiar = "MP3";
        } else{
            cambiar = "Spotify";
        }
    }

    public String toStringReproduccion() {
        String lista;
    
        // Seleccionar el nombre de la lista de reproducción según el valor de "list"
        switch (list) {
            case 1:
                lista = "en la lista de Young Miko";
                break;
            case 2:
                lista = "en la lista de Ana Mena";
                break;
            case 3:
                lista = "en la lista de Emilia Mernes";
                break;
            case 4:
                lista = "en la lista de rock";
                break;
            case 5:
                lista = "en la lista de clasica";
                break;
            case 6:
                lista = "en la lista de pop";
                break;
            default:
                lista = "sin utilizar lista";
        }
    
        // Verificar si no hay lista seleccionada
        if (lista.equals("sin utilizar lista")) {
            return "No se esta reproduciendo ninguna lista de canciones.";
        } else {
            // Obtener la canción actual según la lista
            Cancion cancion = null;
            switch (list) {
                case 1:
                    cancion = YoungMikoSpotify.get(canci);
                    break;
                case 2:
                    cancion = AnaMenaCD.get(canci);
                    break;
                case 3:
                    cancion = EmiliaMP3.get(canci);
                    break;
                case 4:
                    cancion = RockSpotify.get(canci);
                    break;
                case 5:
                    cancion = ClasicaCD.get(canci);
                    break;
                case 6:
                    cancion = PopMP3.get(canci);
                    break;
            }
    
            // Validar que la canción no sea nula antes de reproducir
            if (cancion != null) {
                return "Se encuentra utilizando " + cambiar + " " + lista + ".\n" + cancion.reproducir();
            } else {
                return "No se encuentra en ninguna coneccion, " + lista;
            }
        }
    }
}