/**
 * Clase ControladorRadios que actúa como intermediario entre la interfaz de usuario y la lógica de la radio.
 * Proporciona métodos para gestionar las distintas funcionalidades de la radio.
 * 
* @Project : Labaratorio 4
* @author Julián Divas
* Creacion 08.11.2024
* Ultima modificacion 15.11.2024
* @File Name: ControladorRadios.java
 */

 public class ControladorRadios 
 {
     Radio radio; // Instancia de la clase Radio que se controla mediante este controlador.
 
     /**
      * Constructor de la clase ControladorRadios.
      * 
      * @param radio una instancia de la clase Radio que será gestionada por el controlador.
      */
     public ControladorRadios(Radio radio) {
         this.radio = radio;
     }
 
     /**
      * Ajusta el volumen de la radio según el cambio especificado.
      * 
      * @param cambio el ajuste de volumen (incrementar o disminuir).
      * @return una cadena que indica el nuevo estado del volumen.
      */
     public String ajustarVolumen(String cambio) {
         return radio.cambiarVolumen(cambio);
     }
 
     /**
      * Cambia la banda de la radio (AM/FM).
      * 
      * @return una cadena que indica la banda actual.
      */
     public String cambiarBanda() {
         return radio.cambiarBanda();
     }
 
     /**
      * Cambia la emisora de radio a la siguiente o anterior.
      * 
      * @return una cadena que indica la emisora actual.
      */
     public String cambiarEmisora() {
         return radio.cambiarEmisora();
     }
 
     /**
      * Guarda la emisora actual en una posición específica.
      * 
      * @param guardar el número de la posición donde se almacenará la emisora.
      * @return una cadena que confirma el guardado de la emisora.
      */
     public String guardarEmisora(int guardar) {
         return radio.guardarEmisora(guardar);
     }
 
     /**
      * Carga una emisora guardada en una posición específica.
      * 
      * @param cargar el número de la posición de la emisora guardada.
      * @return una cadena que indica la emisora cargada.
      */
     public String cargarEmisora(int cargar) {
         return radio.cargarEmisora(cargar);
     }
 
     /**
      * Selecciona una lista de reproducción de Spotify.
      * 
      * @param lista el número de la lista de reproducción a seleccionar.
      * @return una cadena que indica la lista seleccionada.
      */
     public String seleccionarListaSpotify(int lista) {
         return radio.seleccionarListaSpotify(lista);
     }
 
     /**
      * Selecciona una lista de reproducción de un CD.
      * 
      * @param lista el número de la lista de reproducción a seleccionar.
      * @return una cadena que indica la lista seleccionada.
      */
     public String seleccionarListaCD(int lista) {
         return radio.seleccionarListaCD(lista);
     }
 
     /**
      * Selecciona una lista de reproducción de un dispositivo MP3.
      * 
      * @param lista el número de la lista de reproducción a seleccionar.
      * @return una cadena que indica la lista seleccionada.
      */
     public String seleccionarListaMP3(int lista) {
         return radio.seleccionarListaMP3(lista);
     }
 
     /**
      * Cambia la canción en reproducción.
      * 
      * @param cambio indica si se debe avanzar o retroceder en la lista de canciones.
      * @return una cadena que indica la canción actual.
      */
     public String cambiarCancion(String cambio) {
         return radio.cambiarCancion(cambio);
     }
 
     /**
      * Escucha la canción actualmente seleccionada.
      * 
      * @return una cadena con información de la canción en reproducción.
      */
     public String escucharCancion() {
         return radio.escucharCancion();
     }
 
     // Métodos específicos para funcionalidades avanzadas de RadioB:
 
     /**
      * Agrega un contacto al directorio telefónico.
      * 
      * @param nombre el nombre del contacto.
      * @param telefono el número de teléfono del contacto.
      * @param email el correo electrónico del contacto.
      * @param empresa la empresa del contacto.
      * @return una cadena que confirma la adición del contacto.
      */
     public String agregarContacto(String nombre, String telefono, String email, String empresa) {
         return ((RadioB) radio).agregarContacto(nombre, telefono, email, empresa);
     }
 
     /**
      * Muestra todos los contactos almacenados.
      * 
      * @return una cadena con la lista de contactos.
      */
     public String mostrarContactos() {
         return ((RadioB) radio).mostrarContactos();
     }
 
     /**
      * Realiza una llamada al contacto especificado por su nombre.
      * 
      * @param nombre el nombre del contacto a llamar.
      * @return una cadena que indica el estado de la llamada.
      */
     public String llamarContacto(String nombre) {
         return ((RadioB) radio).llamarContacto(nombre);
     }
 
     /**
      * Finaliza la llamada actual.
      * 
      * @return una cadena que indica que la llamada ha sido finalizada.
      */
     public String finalizarLlamada() {
         return ((RadioB) radio).finalizarLlamada();
     }
 
     /**
      * Llama al último número marcado.
      * 
      * @return una cadena que indica el estado de la llamada al último contacto.
      */
     public String llamarUltimo() {
         return ((RadioB) radio).llamarultimo(null);
     }
 
     // Métodos relacionados con tarjetas de presentación:
 
     /**
      * Agrega una tarjeta de presentación con los datos proporcionados.
      * 
      * @param nombre el nombre del contacto.
      * @param telefono el número de teléfono.
      * @param email el correo electrónico.
      * @param empresa la empresa del contacto.
      * @return una cadena que confirma la adición de la tarjeta.
      */
     public String agregarTarjeta(String nombre, String telefono, String email, String empresa) {
         return ((RadioB) radio).agregarTarjeta(nombre, telefono, email, empresa);
     }
 
     /**
      * Busca una tarjeta de presentación por nombre.
      * 
      * @param nombre el nombre del contacto.
      * @return el objeto Usuario correspondiente a la tarjeta encontrada.
      */
     public Usuario encontrarTarjeta(String nombre) {
         return ((RadioB) radio).encontrarTarjeta(nombre);
     }
 
     /**
      * Imprime los datos de una tarjeta de presentación.
      * 
      * @param usuario el objeto Usuario a imprimir.
      * @return una cadena con los detalles de la tarjeta.
      */
     public String imprimirTarjeta(Usuario usuario) {
         return ((RadioB) radio).imprimirtarjeta(usuario);
     }
 
     /**
      * Imprime todas las tarjetas de presentación almacenadas.
      * 
      * @return una cadena con los detalles de todas las tarjetas.
      */
     public String imprimirTarjetas() {
         return ((RadioB) radio).imprimirtarjetas(null);
     }
 
     // Métodos de representación y configuración:
 
     /**
      * Devuelve una representación en cadena del estado de la radio.
      * 
      * @return una cadena con el estado de la radio.
      */
     public String toStringRadio() {
         return radio.toStringRadio();
     }
 
     /**
      * Cambia el estado de la conexión de la radio.
      * 
      * @param conexion el tipo de conexión (1: Bluetooth, 2: Auxiliar, etc.).
      */
     public void cambiarConexion(int conexion) {
         radio.cambiarConexion(conexion);
     }
 
     /**
      * Devuelve una representación en cadena del estado de reproducción.
      * 
      * @return una cadena con el estado de reproducción.
      */
     public String toStringReproduccion() {
         return radio.toStringReproduccion();
     }
 
     /**
      * Enciende o apaga el módulo de teléfono en la radio.
      * 
      * @param telefono true para encender, false para apagar.
      */
     public void encenderTelefono(boolean telefono) {
         ((RadioB) radio).encenderTelefono(telefono);
     }
 
     /**
      * Devuelve una representación en cadena del estado del módulo de teléfono.
      * 
      * @return una cadena con el estado del módulo de teléfono.
      */
     public String toStringTelefono() {
         return ((RadioB) radio).toStringTelefono();
     }
 }