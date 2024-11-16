/**
* @Project : Labaratorio 4
* @author Julián Divas
* Creacion 08.11.2024
* Ultima modificacion 15.11.2024
* @File Name: ControladorRadios.java
*/

public class ControladorRadios 
{
    Radio radio;

    public ControladorRadios(Radio radio) 
    {
        this.radio = radio;
    }

    public String ajustarVolumen(String cambio) 
    {
        return radio.cambiarVolumen(cambio);
    }

    public String cambiarBanda(){
        return radio.cambiarBanda();
    }

    public String cambiarEmisora(){
        return radio.cambiarEmisora();
    }

    public String guardarEmisora(int guardar){
        return radio.guardarEmisora(guardar);
    }

    public String cargarEmisora(int cargar){
        return radio.cargarEmisora(cargar);
    }

    public String seleccionarListaSpotify(int lista){
        return radio.seleccionarListaSpotify(lista);
    }

    public String seleccionarListaCD(int lista){
        return radio.seleccionarListaCD(lista);
    }

    public String seleccionarListaMP3(int lista){
        return radio.seleccionarListaMP3(lista);
    }

    public String cambiarCancion(String cambio){
        return radio.cambiarCancion(cambio);
    }

    public String escucharCancion(){
        return radio.escucharCancion();
    }

    public String agregarContacto(String nombre, String telefono, String email, String empresa){
        return ((RadioB)radio).agregarContacto(nombre, telefono, email, empresa);
    }

    public String mostrarContactos(){
        return ((RadioB)radio).mostrarContactos();
    }

    public String llamarContacto(String nombre){
        return ((RadioB)radio).llamarContacto(nombre);
    }

    public String finalizarLlamada(){
        return ((RadioB)radio).finalizarLlamada();
    }

    public String llamarUltimo(){
        return ((RadioB)radio).llamarultimo(null);
    }

    public String agregarTarjeta(String nombre, String telefono, String email, String empresa){
        return ((RadioB)radio).agregarTarjeta(nombre, telefono, email, empresa);
    }

    public Usuario encontrarTarjeta(String nombre){
        return ((RadioB)radio).encontrarTarjeta(nombre);
    }

    public String imprimirTarjeta(Usuario usuario){
        return ((RadioB)radio).imprimirtarjeta(usuario);
    }

    public String imprimirTarjetas(){
        return ((RadioB)radio).imprimirtarjetas(null);
    }
    public String toStringRadio(){
         return radio.toStringRadio();
    }

    public void cambiarConexion(int conexion){
        radio.cambiarConexion(conexion);
    }

    public String toStringReproduccion(){
        return radio.toStringReproduccion();
    }

    public void encenderTelefono(boolean telefono){
        ((RadioB)radio).encenderTelefono(telefono);
    }
    public String toStringTelefono(){
        return ((RadioB)radio).toStringTelefono();
    }
}