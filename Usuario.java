public class Usuario 
{
    private String nombre;
    private String telefono;
    private String email;
    private String empresa;

    public Usuario(String nombre, String telefono, String email, String empresa) 
    {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.empresa = empresa;
    }

    public String obtenerTarjetaPresentacion() 
    {
        return "Nombre: " + nombre + "\nNumero de telefono: " + telefono + "\nCorreo electronico: " + email + "\nEmpresa: " + empresa;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getTelefono() 
    {
        return telefono;
    }

    public void setTelefono(String telefono) 
    {
        this.telefono = telefono;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmpresa() 
    {
        return empresa;
    }

    public void setEmpresa(String empresa) 
    {
        this.empresa = empresa;
    }
}