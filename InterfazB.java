import java.util.ArrayList;

/**
* @Project : Labaratorio 4
* @author (ponen su nombre el que lo sube)
* Creacion 08.11.2024
* Ultima modificacion 15.11.2024
* @File Name: InterfazB.java
*/

public interface InterfazB 
{
    String imprimirtarjeta(Usuario usuario);
    String imprimirtarjetas(ArrayList<Usuario> usuarios);
    String llamarultimo(ArrayList<Usuario> usuariosllamados);
}