/**
 * Clase Usuario que representa la información básica de un usuario.
 * Proporciona métodos para gestionar sus datos y generar una tarjeta de presentación.
 * 
* @Project : Labaratorio 4
* @author Luis Girón
* Creacion 08.11.2024
* Ultima modificacion 15.11.2024
* @File Name: Usuario.java
 */
public class Usuario {

    private String nombre;    // Nombre del usuario.
    private String telefono;  // Número de teléfono del usuario.
    private String email;     // Correo electrónico del usuario.
    private String empresa;   // Empresa del usuario.

    /**
     * Constructor de la clase Usuario que inicializa los atributos con los valores proporcionados.
     * 
     * @param nombre el nombre del usuario.
     * @param telefono el número de teléfono del usuario.
     * @param email el correo electrónico del usuario.
     * @param empresa la empresa del usuario.
     */
    public Usuario(String nombre, String telefono, String email, String empresa) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.empresa = empresa;
    }

    /**
     * Genera una tarjeta de presentación con los datos del usuario.
     * 
     * @return una cadena con el nombre, teléfono, correo electrónico y empresa del usuario.
     */
    public String obtenerTarjetaPresentacion() {
        return "Nombre: " + nombre + "\nNumero de telefono: " + telefono + "\nCorreo electronico: " + email + "\nEmpresa: " + empresa;
    }

    /**
     * Obtiene el nombre del usuario.
     * 
     * @return el nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del usuario.
     * 
     * @param nombre el nuevo nombre del usuario.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de teléfono del usuario.
     * 
     * @return el número de teléfono del usuario.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono del usuario.
     * 
     * @param telefono el nuevo número de teléfono del usuario.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el correo electrónico del usuario.
     * 
     * @return el correo electrónico del usuario.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Establece el correo electrónico del usuario.
     * 
     * @param email el nuevo correo electrónico del usuario.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Obtiene la empresa del usuario.
     * 
     * @return la empresa del usuario.
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * Establece la empresa del usuario.
     * 
     * @param empresa la nueva empresa del usuario.
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}