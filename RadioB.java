import java.util.ArrayList;

/**
* @Project : Labaratorio 4
* @author (ponen su nombre el que lo sube)
* Creacion 08.11.2024
* Ultima modificacion 15.11.2024
* @File Name: RadioB.java
*/

public class RadioB extends Radio implements InterfazB 
{
    protected ArrayList<Usuario> usuariosContactos = new ArrayList<>();
    protected ArrayList<Usuario> usuariosLlamados = new ArrayList<>();
    protected ArrayList<Usuario> tarjetas = new ArrayList<>();
    String conectado;
    int llamada;
    String ll = "";

    public String agregarContacto(String nombre, String telefono, String email, String empresa){
        Usuario usuario = new Usuario(nombre, telefono, email, empresa);
        usuariosContactos.add(usuario);
        return "Se a agregado al usuario";
    }

    public String mostrarContactos() {
        String nombres = "";
        for (Usuario usuario : usuariosContactos) {
            nombres += usuario.getNombre() + "\n";
        }
        return nombres;
    }    

    public String llamarContacto(String nombre) 
    {
        for (Usuario usuario : usuariosContactos){
            if (usuario.getNombre().equals(nombre)){
                usuariosLlamados.add(usuario);
                llamada = 1;
                ll = "Llamando a: " + usuario.getNombre();
            return "Llamando a: " + usuario.getNombre();
            }
        }
        return "Contacto no encontrado";
    }

    public String finalizarLlamada() 
    {
        llamada = 2;
        ll = "Se finalizo la llamada";
        return "Llamada finalizada."; 
    }

    @Override
    public String llamarultimo(ArrayList<Usuario> usuariosllamado) 
    {
        if (!usuariosLlamados.isEmpty()) 
        {
            llamada = 1;
            ll = "Llamando a: " +  usuariosLlamados.get(usuariosLlamados.size() - 1).getNombre();
            return "Llamando al ultimo contacto: " + usuariosLlamados.get(usuariosLlamados.size() - 1).getNombre();
        } 
        else 
        {
            return "No hay contactos en el historial de llamadas.";
        }
    }

    public String agregarTarjeta(String nombre, String telefono, String email, String empresa){
        Usuario usuario = new Usuario(nombre, telefono, email, empresa);
        tarjetas.add(usuario);
        return "Se a agregado la tarjeta";
    }

    public Usuario encontrarTarjeta(String nombre){
        for (Usuario usuario : tarjetas){
            if (usuario.getNombre().equals(nombre)){
                return usuario;
            }
        }
        return null;
    }

    @Override
    public String imprimirtarjeta(Usuario usuario) 
    { 
        for (Usuario usuari : tarjetas){
            if (usuari.getNombre().equals(usuario.getNombre())){
                return usuario.obtenerTarjetaPresentacion();
            }
        }
        return "Usuario no encontrado en tu lista.";
    }

    @Override
    public String imprimirtarjetas(ArrayList<Usuario> usuari) 
    {
        StringBuilder tarjetas1 = new StringBuilder();
        tarjetas.forEach(usuario -> tarjetas1.append(usuario.obtenerTarjetaPresentacion()).append("\n"));
        return tarjetas1.toString();
    }

    public void encenderTelefono(boolean telefono) 
    {
        if (telefono){
            conectado = "El telefono se encuentra encendido";
        } else{
            conectado = "El telefono se encuentra desconectado";
        }
    }

    public String toStringTelefono(){
        if (conectado.equals("El telefono se encuentra encendido")){

        }
        return conectado + ". " + ll;
    }
}