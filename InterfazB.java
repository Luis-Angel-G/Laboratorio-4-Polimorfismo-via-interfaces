import java.util.ArrayList;

/**
 * La interfaz InterfazB define los métodos necesarios para la impresión de tarjetas y la llamada al último usuario.
* @Project : Labaratorio 4
* @author Julián Divas
* Creacion 08.11.2024
* Ultima modificacion 15.11.2024
* @File Name: InterfazB.java
 */
public interface InterfazB {

    /**
     * Imprime la tarjeta de un usuario específico.
     *
     * @param usuario El usuario del cual se imprimirá la tarjeta.
     * @return Una cadena que representa la tarjeta del usuario.
     */
    String imprimirtarjeta(Usuario usuario);

    /**
     * Imprime las tarjetas de una lista de usuarios.
     *
     * @param usuarios Una lista de usuarios cuyos datos se usarán para imprimir las tarjetas.
     * @return Una cadena que representa las tarjetas de todos los usuarios.
     */
    String imprimirtarjetas(ArrayList<Usuario> usuarios);

    /**
     * Llama al último usuario de una lista de usuarios llamados.
     *
     * @param usuariosllamados Una lista de usuarios que han sido llamados.
     * @return Una cadena que representa al último usuario llamado.
     */
    String llamarultimo(ArrayList<Usuario> usuariosllamados);
}