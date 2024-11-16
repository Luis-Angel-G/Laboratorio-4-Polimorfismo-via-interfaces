import java.util.ArrayList;
import java.util.List;

/**
 * Representa una radio con funcionalidades avanzadas, como cambiar emisoras AM/FM,
 * ajustar volumen, guardar emisoras y reproducir listas de canciones de diferentes artistas.
 * 
* @Project : Labaratorio 4
* @author Marcelo Detlefsen
* Creacion 08.11.2024
* Ultima modificacion 15.11.2024
* @File Name: Radio.java
 */
public class Radio {

    // Atributos protegidos para definir las propiedades de la radio
    protected boolean encendido = false; // Estado de encendido/apagado
    protected double emisoraActual; // Emisora actual de la radio
    protected int volumen = 0; // Nivel de volumen (0 a 100)
    protected int canci = 0; // Índice de la canción actual
    protected ArrayList<Double> emisorasGuardadasAM = new ArrayList<>(); // Emisoras AM guardadas
    protected ArrayList<Double> emisorasGuardadasFM = new ArrayList<>(); // Emisoras FM guardadas

    // Listas de canciones organizadas por artista y formato
    protected ArrayList<Cancion> YoungMikoSpotify = new ArrayList<>();
    protected ArrayList<Cancion> AnaMenaCD = new ArrayList<>();
    protected ArrayList<Cancion> EmiliaMP3 = new ArrayList<>();
    protected ArrayList<Cancion> RockSpotify = new ArrayList<>();
    protected ArrayList<Cancion> ClasicaCD = new ArrayList<>();
    protected ArrayList<Cancion> PopMP3 = new ArrayList<>();

    protected Cancion cancionActual; // Canción actualmente en reproducción
    protected boolean band = true; // Banda actual: true para AM, false para FM
    protected int list; // Identificador de la lista de reproducción seleccionada
    protected double emisoraActualFM = 87.5; // Frecuencia mínima FM
    protected double emisoraActualAM = 520; // Frecuencia mínima AM
    protected int conexion = 1; // Tipo de conexión actual (CD, MP3 o Spotify)
    protected String cambiar; // Tipo de conexión seleccionada

    /**
     * Constructor de la clase Radio. Inicializa listas de canciones predefinidas (las primeras 3 listas, favoritas de Luis) y emisoras base.
     */
    public Radio() {
        // Inicialización de listas de canciones con datos predefinidos
        YoungMikoSpotify.add(new Cancion("Tamagotchi", "Young Miko", "Trap", 2.95f));
        YoungMikoSpotify.add(new Cancion("Princess Peach", "Young Miko", "Urbano", 2.78f));
        YoungMikoSpotify.add(new Cancion("Classy 101", "Young Miko", "Urbano", 3.27f));

        AnaMenaCD.add(new Cancion("Carita Triste", "Ana Mena", "Pop Latino", 2.93f));
        AnaMenaCD.add(new Cancion("La Razon", "Ana Mena", "Pop", 2.72f));
        AnaMenaCD.add(new Cancion("Las 12", "Ana Mena", "Pop Latino", 3.13f));

        EmiliaMP3.add(new Cancion("La_Playlist.mpeg", "Emilia Mernes", "Pop", 2.50f));
        EmiliaMP3.add(new Cancion("Una Foto Remix", "Emilia Mernes", "Reggaeton", 4.07f));
        EmiliaMP3.add(new Cancion("La_Original.mp3", "Emilia Mernes", "Pop Latino", 2.37f));

        RockSpotify.add(new Cancion("Bohemian Rhapsody", "Queen", "Rock", 5.55f));
        RockSpotify.add(new Cancion("Stairway to Heaven", "Led Zeppelin", "Rock", 8.02f));
        RockSpotify.add(new Cancion("Back In Black", "AC/DC", "Rock", 4.15f));

        ClasicaCD.add(new Cancion("Canon in D Major", "Johann Pachelbel", "Clásica", 4.00f));
        ClasicaCD.add(new Cancion("Für Elise", "Ludwig van Beethoven", "Clásica", 2.53f));
        ClasicaCD.add(new Cancion("Symphony No. 5", "Ludwig van Beethoven", "Clásica", 7.05f));

        PopMP3.add(new Cancion("Blinding Lights", "The Weeknd", "Pop", 3.20f));
        PopMP3.add(new Cancion("Bad Romance", "Lady Gaga", "Pop", 4.55f));
        PopMP3.add(new Cancion("Shape of You", "Ed Sheeran", "Pop", 3.53f));
    }

    /**
     * Enciende o apaga la radio.
     * 
     * @return Mensaje indicando el estado actual de la radio.
     */
    public String encenderApagar() {
        encendido = !encendido;
        return encendido ? "Radio encendida" : "Radio apagada";
    }

    /**
     * Cambia el volumen de la radio.
     * 
     * @param cambio Comando para aumentar (">") o disminuir ("<") el volumen.
     * @return Mensaje indicando el volumen actual o un error si el comando no es válido.
     */
    public String cambiarVolumen(String cambio) {
        if (cambio.equals("<")) {
            if (volumen > 0) volumen--;
        } else if (cambio.equals(">")) {
            if (volumen < 100) volumen++;
        } else {
            return "Comando no reconocido.";
        }
        return "Volumen actual: " + volumen;
    }

    /**
     * Cambia la banda entre AM y FM.
     * 
     * @return Mensaje indicando la banda actual.
     */
    public String cambiarBanda() {
        band = !band;
        emisoraActual = band ? emisoraActualAM : emisoraActualFM;
        return "Banda cambiada a: " + (band ? "AM" : "FM");
    }

    /**
     * Cambia la emisora ya sea de AM y FM con sus parametros correspondientes.
     * 
     * @return Mensaje indicando la emisora actual.
     */
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

    /**
     * Permite guardar 50 estaciones AM y 50 estaciones FM para que sean más facil su acceso.
     * 
     * @param guardar Es la variable que indica la cantidad de espacios restantes para guardar esatciones, si es menor a 50 se puede guardar.
     * @return Indica el lugar donde fue guardada la estación, o el porque no se pudo guardar.
     */
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

    /**
     * Carga una emisora guardada según el índice proporcionado y la banda seleccionada (AM o FM).
     * 
     * @param indice el índice de la emisora a cargar (debe estar dentro del rango válido).
     * @return un mensaje indicando si la emisora fue cargada con éxito o si ocurrió algún error.
     */
    public String cargarEmisora(int indice) {
        if (band) {
            if (indice > 0 && indice <= emisorasGuardadasAM.size()) {
                if (emisorasGuardadasAM.get(indice - 1) != null) {
                    emisoraActualAM = emisorasGuardadasAM.get(indice - 1);
                    return "Emisora cargada: " + emisoraActualAM;
                } else {
                    return "No hay ninguna emisora guardada en esta posicion.";
                }
            } else {
                return "Indice de emisora no valido.\n-1";
            }
        } else {
            if (indice > 0 && indice <= emisorasGuardadasFM.size()) {
                if (emisorasGuardadasFM.get(indice - 1) != null) {
                    emisoraActualFM = emisorasGuardadasFM.get(indice - 1);
                    return "Emisora cargada: " + emisoraActualFM;
                } else {
                    return "No hay ninguna emisora guardada en esta posicion.";
                }
            } else {
                return "Indice de emisora no valido.\n-1";
            }
        }
    }

    /**
     * Selecciona una lista de reproducción de Spotify según el índice proporcionado.
     * 
     * @param lista el índice de la lista (1 para Young Miko, 2 para rock).
     * @return un mensaje indicando la lista seleccionada o un error si el índice no es válido.
     */
    public String seleccionarListaSpotify(int lista) {
        if (lista == 1) {
            list = 1;
            return "Se selecciono la lista de Young Miko.";
        } else if (lista == 2) {
            list = 4;
            return "Se selecciono la lista de rock.";
        } else {
            return "No existen mas listas de reproduccion.";
        }
    }

    /**
     * Selecciona una lista de reproducción de CD según el índice proporcionado.
     * 
     * @param lista el índice de la lista (1 para Ana Mena, 2 para música clásica).
     * @return un mensaje indicando la lista seleccionada o un error si el índice no es válido.
     */
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

    /**
     * Selecciona una lista de reproducción de MP3 según el índice proporcionado.
     * 
     * @param lista el índice de la lista (1 para Emilia Mernes, 2 para pop).
     * @return un mensaje indicando la lista seleccionada o un error si el índice no es válido.
     */
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

    /**
     * Cambia la canción actual en la lista de reproducción seleccionada.
     * 
     * @param cambio un comando de cambio ("<" para retroceder, ">" para avanzar).
     * @return el título de la nueva canción actual o un mensaje de error si el comando no es válido.
     */
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

    /**
     * Reproduce la canción actual en la lista seleccionada.
     * 
     * @return el nombre de la canción que se está reproduciendo o un mensaje de error si no se encuentra ninguna lista activa.
     */
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

    /**
     * Devuelve el estado actual de la radio.
     * 
     * @return una descripción del estado actual, incluyendo banda, frecuencia y estado de guardado.
     */
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

    /**
     * Cambia el tipo de conexión de reproducción (CD, MP3 o Spotify).
     * 
     * @param conexion el índice de la conexión deseada (1 para CD, 2 para MP3, 3 para Spotify).
     */
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

    /**
     * Devuelve el estado actual de la reproducción.
     * 
     * @return una descripción del estado actual de la reproducción, incluyendo lista y canción.
     */
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