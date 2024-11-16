import java.util.ArrayList;

/**
 * La clase RadioB extiende de la clase Radio e implementa la interfaz InterfazB.
 * Esta clase maneja funcionalidades como agregar contactos, hacer llamadas, y gestionar
 * tarjetas de presentación de usuarios.
 * @Project : Labaratorio 4
 * @author Julián Divas
 * Creacion 08.11.2024
 * Ultima modificacion 15.11.2024
 * @File Name: RadioB.java
 */
public class RadioB extends Radio implements InterfazB {

    /** Lista de usuarios en los contactos. */
    protected ArrayList<Usuario> usuariosContactos = new ArrayList<>();

    /** Lista de usuarios que han sido llamados. */
    protected ArrayList<Usuario> usuariosLlamados = new ArrayList<>();

    /** Lista de tarjetas de presentación de usuarios. */
    protected ArrayList<Usuario> tarjetas = new ArrayList<>();

    /** Estado de conexión del teléfono. */
    String conectado;

    /** Indica si se está realizando una llamada (1) o si ha finalizado (2). */
    int llamada;

    /** Representa el estado actual de la llamada, si está en curso o finalizada. */
    String ll = "";

    /**
     * Agrega un nuevo contacto a la lista de usuariosContactos.
     *
     * @param nombre El nombre del contacto.
     * @param telefono El número de teléfono del contacto.
     * @param email El correo electrónico del contacto.
     * @param empresa La empresa del contacto.
     * @return Un mensaje indicando que el usuario ha sido agregado.
     */
    public String agregarContacto(String nombre, String telefono, String email, String empresa) {
        Usuario usuario = new Usuario(nombre, telefono, email, empresa);
        usuariosContactos.add(usuario);
        return "Se ha agregado al usuario";
    }

    /**
     * Muestra todos los nombres de los contactos agregados.
     *
     * @return Una cadena con los nombres de los contactos.
     */
    public String mostrarContactos() {
        StringBuilder nombres = new StringBuilder();
        for (Usuario usuario : usuariosContactos) {
            nombres.append(usuario.getNombre()).append("\n");
        }
        return nombres.toString();
    }

    /**
     * Realiza una llamada a un contacto por su nombre.
     *
     * @param nombre El nombre del contacto a llamar.
     * @return Un mensaje indicando si se está llamando o si el contacto no se encontró.
     */
    public String llamarContacto(String nombre) {
        for (Usuario usuario : usuariosContactos) {
            if (usuario.getNombre().equals(nombre)) {
                usuariosLlamados.add(usuario);
                llamada = 1;
                ll = "Llamando a: " + usuario.getNombre();
                return "Llamando a: " + usuario.getNombre();
            }
        }
        return "Contacto no encontrado";
    }

    /**
     * Finaliza la llamada actual.
     *
     * @return Un mensaje indicando que la llamada ha sido finalizada.
     */
    public String finalizarLlamada() {
        llamada = 2;
        ll = "Se finalizó la llamada";
        return "Llamada finalizada.";
    }

    /**
     * Llama al último contacto que ha sido llamado previamente.
     *
     * @param usuariosllamado Una lista de usuarios que han sido llamados.
     * @return Un mensaje indicando que se está llamando al último contacto, o que no hay contactos en el historial.
     */
    @Override
    public String llamarultimo(ArrayList<Usuario> usuariosllamado) {
        if (!usuariosLlamados.isEmpty()) {
            llamada = 1;
            ll = "Llamando a: " + usuariosLlamados.get(usuariosLlamados.size() - 1).getNombre();
            return "Llamando al último contacto: " + usuariosLlamados.get(usuariosLlamados.size() - 1).getNombre();
        } else {
            return "No hay contactos en el historial de llamadas.";
        }
    }

    /**
     * Agrega una tarjeta de presentación de un nuevo usuario.
     *
     * @param nombre El nombre del usuario.
     * @param telefono El número de teléfono del usuario.
     * @param email El correo electrónico del usuario.
     * @param empresa La empresa del usuario.
     * @return Un mensaje indicando que la tarjeta ha sido agregada.
     */
    public String agregarTarjeta(String nombre, String telefono, String email, String empresa) {
        Usuario usuario = new Usuario(nombre, telefono, email, empresa);
        tarjetas.add(usuario);
        return "Se ha agregado la tarjeta";
    }

    /**
     * Encuentra una tarjeta de presentación por nombre.
     *
     * @param nombre El nombre del usuario cuya tarjeta se desea encontrar.
     * @return El usuario encontrado o null si no se encuentra.
     */
    public Usuario encontrarTarjeta(String nombre) {
        for (Usuario usuario : tarjetas) {
            if (usuario.getNombre().equals(nombre)) {
                return usuario;
            }
        }
        return null;
    }

    /**
     * Imprime la tarjeta de un usuario específico.
     *
     * @param usuario El usuario del cual se imprimirá la tarjeta.
     * @return La tarjeta de presentación del usuario o un mensaje si el usuario no está en la lista.
     */
    @Override
    public String imprimirtarjeta(Usuario usuario) {
        for (Usuario usuari : tarjetas) {
            if (usuari.getNombre().equals(usuario.getNombre())) {
                return usuario.obtenerTarjetaPresentacion();
            }
        }
        return "Usuario no encontrado en tu lista.";
    }

    /**
     * Imprime todas las tarjetas de los usuarios almacenados.
     *
     * @param usuari Lista de usuarios cuyas tarjetas se desean imprimir.
     * @return Las tarjetas de presentación de todos los usuarios.
     */
    @Override
    public String imprimirtarjetas(ArrayList<Usuario> usuari) {
        StringBuilder tarjetas1 = new StringBuilder();
        tarjetas.forEach(usuario -> tarjetas1.append(usuario.obtenerTarjetaPresentacion()).append("\n"));
        return tarjetas1.toString();
    }

    /**
     * Enciende o apaga el teléfono.
     *
     * @param telefono Un valor booleano que indica si el teléfono está encendido o apagado.
     */
    public void encenderTelefono(boolean telefono) {
        if (telefono) {
            conectado = "El teléfono se encuentra encendido";
        } else {
            conectado = "El teléfono se encuentra desconectado";
        }
    }

    /**
     * Devuelve una representación del estado actual del teléfono y las llamadas.
     *
     * @return El estado del teléfono (encendido o apagado) y la llamada actual (si existe).
     */
    public String toStringTelefono() {
        return conectado + ". " + ll;
    }
}