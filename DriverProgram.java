import java.util.Scanner;

/**
* Clase principal para ejecutar el programa de la radio.
* Gestiona la interacción con el usuario y las funcionalidades de la radio.
* @Project : Labaratorio 4
* @author Luis Girón
* Creacion 08.11.2024
* Ultima modificacion 15.11.2024
* @File Name: DriverProgram.java
*/

public class DriverProgram
{
    /**
     * Método principal que ejecuta el programa.
     * 
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) 
    {
        // Instancia inicial de la radio y controlador
        Radio rad = new RadioB();
        ControladorRadios controlador = new ControladorRadios(rad);
        Scanner scanner = new Scanner(System.in);
        boolean radio = false;
        boolean telefono = false;

        // Mensaje inicial de bienvenida
        System.out.println("Bienvenido usuario, ¿desea encender la radio?\nIngrese una opcion:");
        System.out.println("1. Encender");
        System.out.println("2. Apagar");

        int opcion = 10;
        boolean inputValido = false;

        // Ciclo para validar entrada del usuario al encender/apagar la radio
        while (!inputValido) 
        {
            System.out.print("Ingrese una opcion: ");
            try 
            {
                opcion = scanner.nextInt();
                inputValido = true; 
            } 
            catch (Exception e) 
            {
                System.out.println("Ingrese un valor valido");
                scanner.nextLine(); 
            }
        }
        scanner.nextLine();

        try 
        {
            if (opcion > 0 && opcion < 3)
            {
                if (opcion == 1)
                {
                    radio = true;
                } 
                else
                {
                    System.out.println("Tenga un buen viaje");
                    radio = false;
                }
            }
        } catch (Exception e) {
            System.out.println("Opcion no valida: " + e.getMessage());
        }

        // Ciclo principal del programa mientras la radio esté encendida
        while (radio)
        {
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Subir volumen");
            System.out.println("2. Cambiar modo");
            System.out.println("3. Apagar");

            int opcion1 = 10;
            boolean inputValido2 = false;

            // Validación de entrada para el menú principal
            while (!inputValido2) 
            {
                System.out.print("Ingrese una opcion: ");
                try 
                {
                    opcion1 = scanner.nextInt();
                    inputValido2 = true; 
                } 
                catch (Exception e) 
                {
                    System.out.println("Ingrese un valor valido");
                    scanner.nextLine(); 
                }
            }
            scanner.nextLine();
            try {
                if (opcion1 > 0 && opcion1 < 4)
                {
                    // Continuar con las opciones según la entrada
                }
            } 
            catch (Exception e) 
            {
                System.out.println("Opcion no valida: " + e.getMessage());
                continue;
            }
            
            switch (opcion1) 
            {
                case 1: // Ajustar volumen
                    System.out.println("Ingrese > para subir 1 de volumen o < para disminuirlo");
                    String volumen = "";
                    boolean inputValido3 = false;

                    // Validación de entrada para ajuste de volumen
                    while (!inputValido3) 
                    {
                        try 
                        {
                            volumen = scanner.nextLine();
                            inputValido3 = true; 
                        }
                        catch (Exception e) 
                        {
                            System.out.println("Ingrese un valor valido");
                            scanner.nextLine(); 
                        }
                    }
                    try 
                    {
                        if (volumen.equals("<") || volumen.equals(">"))
                        {
                            System.out.println(controlador.ajustarVolumen(volumen));
                        }
                    } 
                    catch (Exception e) 
                    {
                        System.out.println("Opcion no valida: " + e.getMessage());
                        continue;
                    }
                    break;

                case 2: // Cambiar modo de la radio
                    boolean modo = true;
                    while (modo) 
                    {
                        System.out.println("Seleccione una opcion:");
                        System.out.println("1. Modo Radio");
                        System.out.println("2. Modo Reproduccion");
                        System.out.println("3. Modo Telefono");
                        System.out.println("4. Modo Productividad");
                        System.out.println("5. Regresar al menu anterior");
    
                        int opcion2 = 10;
                        boolean inputValido4 = false;

                        // Validación de entrada para seleccionar modo
                        while (!inputValido4) 
                        {
                            try 
                            {
                                opcion2 = scanner.nextInt();
                                inputValido4 = true; 
                            } 
                            catch (Exception e) 
                            {
                                System.out.println("Ingrese un valor valido");
                                scanner.nextLine(); 
                            }
                        }
                        scanner.nextLine();

                        try 
                        {
                            if (opcion2 > 0 && opcion2 < 6)
                            {
                                // Continuar con las opciones según la entrada
                            }
                        } 
                        catch (Exception e) 
                        {
                            System.out.println("Opcion no valida: " + e.getMessage());
                            continue;
                        }
    
                        switch (opcion2) 
                        {
                            case 1: // Modo Radio
                                boolean radi = true;
                                while (radi) 
                                {
                                    System.out.println(controlador.toStringRadio());
                                    System.out.println("Seleccione una opcion:");
                                    System.out.println("1. Cambiar de onda");
                                    System.out.println("2. Cambiar emisora");
                                    System.out.println("3. Guardar emisora");
                                    System.out.println("4. Cargar emisora");
                                    System.out.println("5. Regresar al menu anterior");
        
                                    int opcion3 = 10;

                                    boolean inputValido5 = false;
                                    // Validación de entrada para submenú de modo radio
                                    while (!inputValido5) 
                                    {
                                        try 
                                        {
                                            opcion3 = scanner.nextInt();
                                            inputValido5 = true; 
                                        } 
                                        catch (Exception e) 
                                        {
                                            System.out.println("Ingrese un valor valido");
                                            scanner.nextLine(); 
                                        }
                                    }
                                    scanner.nextLine();
                                    try 
                                    {
                                        if (opcion3 > 0 && opcion3 < 6)
                                        {
                                            // Continuar con las opciones según la entrada
                                        }
                                    } catch (Exception e) 
                                    {
                                        System.out.println("Opcion no valida: " + e.getMessage());
                                        continue;
                                    }
        
                                    switch (opcion3) 
                                    {
                                        case 1: // Cambiar de onda
                                            System.out.println(controlador.cambiarBanda());
                                            break;
                                        case 2: // Cambiar emisora
                                            System.out.println(controlador.cambiarEmisora());
                                            break;
                                        case 3: // Guardar emisora
                                            System.out.println("Ingrese en que posicion quiere guardar la emisora");

                                            int guardar = 10;
                                            boolean inputValido6 = false;
                                            
                                            // Validación de entrada para guardar emisora
                                            while (!inputValido6) 
                                            {
                                                try 
                                                {
                                                    guardar = scanner.nextInt();
                                                    inputValido6 = true; 
                                                } 
                                                catch (Exception e) 
                                                {
                                                    System.out.println("Ingrese un valor valido");
                                                    scanner.nextLine(); 
                                                }
                                            }
                                            scanner.nextLine();
                                            try 
                                            {
                                                System.out.println(controlador.guardarEmisora(guardar));
                                            } 
                                            catch (Exception e) 
                                            {
                                                System.out.println("Opcion no valida: " + e.getMessage());
                                                continue;
                                            }
                                            break;
                                        case 4: // Cargar emisora
                                            System.out.println("Ingrese el numero de la emisora a cargar");
                                            int cargar = 0;
                                            boolean inputValido7 = false;

                                            // Validación de entrada para cargar emisora
                                            while (!inputValido7) 
                                            {
                                                try 
                                                {
                                                    cargar = scanner.nextInt();
                                                    inputValido7 = true; 
                                                } 
                                                catch (Exception e) 
                                                {
                                                    System.out.println("Ingrese un valor valido");
                                                    scanner.nextLine(); 
                                                }
                                            }
                                            scanner.nextLine();
                                            try 
                                            {
                                                System.out.println(controlador.cargarEmisora(cargar));
                                            } 
                                            catch (Exception e) 
                                            {
                                                System.out.println("Opcion no valida: " + e.getMessage());
                                                continue;
                                            }
                                            break;
                                        case 5: // Salir al menú anterior
                                            radi = false;
                                            break;
                                        default: // Manejo de opción no válida
                                            System.out.println("Opcion no valida");
                                            break;
                                    }
                                }
                                break;

                            case 2: //Modo Reproducción
                                // Variable para controlar el ciclo de reproducción
                                boolean rep = true;
                                while (rep) 
                                {
                                    // Muestra las opciones disponibles en el modo reproducción
                                    System.out.println(controlador.toStringReproduccion());
                                    System.out.println("Seleccione una opcion:");
                                    System.out.println("1. CD");
                                    System.out.println("2. MP3");
                                    System.out.println("3. Spotify");
                                    System.out.println("4. Regresar al menu anterior");
        
                                    int opcion4 = 0;
                                    boolean inputValido8 = false;

                                    // Valida la entrada del usuario para la selección del modo de reproducción
                                    while (!inputValido8) 
                                    {
                                        try 
                                        {
                                            opcion4 = scanner.nextInt();
                                            inputValido8 = true; 
                                        } 
                                        catch (Exception e) 
                                        {
                                            System.out.println("Ingrese un valor valido");
                                            scanner.nextLine(); 
                                        }
                                    }
                                    scanner.nextLine();        
                                    try 
                                    {
                                        // Cambia la conexión al modo de reproducción seleccionado
                                        if (opcion4 > 0 && opcion4 < 5)
                                        {
                                            controlador.cambiarConexion(opcion4);
                                        }
                                    } 
                                    catch (Exception e) 
                                    {
                                        System.out.println("Opcion no valida: " + e.getMessage());
                                        continue;
                                    }
        
                                    int opcion5 = 0;
                                    
                                    switch (opcion4) 
                                    {
                                        case 1: // Modo CD
                                            boolean cd = true;
                                            while (cd) 
                                            {
                                                // Opciones específicas para el modo CD
                                                System.out.println("Seleccione una opcion:");
                                                System.out.println("1. Seleccionar una lista de reproduccion");
                                                System.out.println("2. Cambiar cancion");
                                                System.out.println("3. Escuchar cancion");
                                                System.out.println("4. Regresar al menu anterior");

                                                boolean inputValido9 = false;
                                                // Valida la entrada del usuario para las opciones del modo CD
                                                while (!inputValido9) 
                                                {
                                                    try 
                                                    {
                                                        opcion5 = scanner.nextInt();
                                                        inputValido9 = true; 
                                                    } 
                                                    catch (Exception e) 
                                                    {
                                                        System.out.println("Ingrese un valor valido");
                                                        scanner.nextLine(); 
                                                    }
                                                }
                                                scanner.nextLine();
                                                try 
                                                {
                                                    if (opcion5 > 0 && opcion5 < 5)
                                                    {
                                                        // Continuar con las opciones según la entrada
                                                    }
                                                } 
                                                catch (Exception e) 
                                                {
                                                    System.out.println("Opcion no valida: " + e.getMessage());
                                                    continue;
                                                }
            
                                                int lista = 0;
            
                                                switch (opcion5) 
                                                {
                                                    case 1: // Selección de lista de reproducción
                                                        System.out.println("Seleccione una opcion:");
                                                        System.out.println("1. Ana Mena");
                                                        System.out.println("2. Clasica");

                                                        boolean inputValido10 = false;

                                                        // Valida la entrada para seleccionar una lista
                                                        while (!inputValido10) 
                                                        {
                                                            try 
                                                            {
                                                                lista = scanner.nextInt();
                                                                inputValido10 = true; 
                                                            } catch (Exception e) 
                                                            {
                                                                System.out.println("Ingrese un valor valido");
                                                                scanner.nextLine(); 
                                                            }
                                                        }
                                                        scanner.nextLine();
                                                        try 
                                                        {
                                                            // Llama al método correspondiente del controlador para seleccionar la lista
                                                            if (lista > 0 && lista < 3)
                                                            {
                                                                System.out.println(controlador.seleccionarListaCD(lista));
                                                            }
                                                        } 
                                                        catch (Exception e) 
                                                        {
                                                            System.out.println("Opcion no valida: " + e.getMessage());
                                                            continue;
                                                        }
                                                        break;
                                                    case 2: // Cambio de canción
                                                        System.out.println("Ingrese > para avanzar de cancion o < para regresar");
                                                        String cambio = "";
                                                        boolean inputValido11 = false;

                                                        // Valida la entrada del usuario para cambiar de canción
                                                        while (!inputValido11) 
                                                        {
                                                            try 
                                                            {
                                                                cambio = scanner.nextLine();
                                                                inputValido11 = true; 
                                                            } 
                                                            catch (Exception e) 
                                                            {
                                                                System.out.println("Ingrese un valor valido");
                                                                scanner.nextLine(); 
                                                            }
                                                        }
                                                        try 
                                                        {
                                                            // Llama al método para cambiar la canción
                                                            if (cambio.equals("<") || cambio.equals(">"))
                                                            {
                                                                System.out.println(controlador.cambiarCancion(cambio));
                                                            }
                                                        } 
                                                        catch (Exception e) 
                                                        {
                                                            System.out.println("Opcion no valida: " + e.getMessage());
                                                            continue;
                                                        }
                                                        break;
                                                    case 3: // Escuchar canción
                                                        // Llama al método del controlador para escuchar la canción actual
                                                        System.out.println(controlador.escucharCancion());
                                                        break;
                                                    case 4: // Regresar al menú anterior
                                                        cd = false;
                                                        break;
                                                    default: // Manejo de opción no válida
                                                        System.out.println("Opcion no valida");
                                                        break;
                                                }
                                            }
                                            break;
                                        case 2: //Modo MP3
                                            // Bandera para controlar el ciclo del menú MP3
                                            boolean mp3 = true;

                                            // Ciclo principal del menú MP3
                                            while (mp3) 
                                            {
                                                // Opciones disponibles para el reproductor MP3
                                                System.out.println("Seleccione una opcion:");
                                                System.out.println("1. Seleccionar una lista de reproduccion");
                                                System.out.println("2. Cambiar cancion");
                                                System.out.println("3. Escuchar cancion");
                                                System.out.println("4. Regresar al menu anterior");
            
                                                boolean inputValido12 = false;
                                                while (!inputValido12) 
                                                {
                                                    try 
                                                    {
                                                        opcion5 = scanner.nextInt();
                                                        inputValido12 = true; 
                                                    } 
                                                    catch (Exception e) 
                                                    {
                                                        System.out.println("Ingrese un valor valido");
                                                        scanner.nextLine(); 
                                                    }
                                                }
                                                // Verificar si la opción ingresada está en el rango permitido
                                                try 
                                                {
                                                    if (opcion5 > 0 && opcion5 < 5)
                                                    {
                                                        // Continuar si es válida
                                                    }
                                                } catch (Exception e) 
                                                {
                                                    System.out.println("Opcion no valida: " + e.getMessage());
                                                    continue;
                                                }
                                                // Variable para almacenar la lista seleccionada
                                                int lista1 = 0;

                                                // Submenú del reproductor MP3 según la opción ingresada
                                                switch (opcion5) 
                                                {
                                                    case 1: // Selección de lista de reproducción
                                                        System.out.println("Seleccione una opcion:");
                                                        System.out.println("1. Emilia Mernes");
                                                        System.out.println("2. Pop");
            
                                                        boolean inputValido13 = false;
                                                        while (!inputValido13) 
                                                        {
                                                            try 
                                                            {
                                                                lista1 = scanner.nextInt();
                                                                inputValido13 = true;
                                                            } 
                                                            catch (Exception e) 
                                                            {
                                                                System.out.println("Ingrese un valor valido");
                                                                scanner.nextLine(); 
                                                            }
                                                        }
                                                        try 
                                                        {
                                                            if (lista1 > 0 && lista1 < 3)
                                                            {
                                                                // Mostrar la lista seleccionada
                                                                System.out.println(controlador.seleccionarListaMP3(lista1));
                                                            }
                                                        } 
                                                        catch (Exception e) 
                                                        {
                                                            System.out.println("Opcion no valida: " + e.getMessage());
                                                            continue;
                                                        }
                                                        break;
                                                    case 2: // Cambiar canción
                                                        System.out.println("Ingrese > para avanzar de cancion o < para regresar");
                                                        String cambio = ""; // Almacena la dirección del cambio
                                                        boolean inputValido14 = false;
                                                        while (!inputValido14) 
                                                        {
                                                            try 
                                                            {
                                                                cambio = scanner.nextLine();
                                                                inputValido14 = true; 
                                                            } 
                                                            catch (Exception e) 
                                                            {
                                                                System.out.println("Ingrese un valor valido");
                                                                scanner.nextLine(); 
                                                            }
                                                        }
                                                        try 
                                                        {
                                                            if (cambio.equals("<") || cambio.equals(">"))
                                                            {
                                                                // Cambiar canción en la dirección seleccionada
                                                                System.out.println(controlador.cambiarCancion(cambio));
                                                            }
                                                        } 
                                                        catch (Exception e) 
                                                        {
                                                            System.out.println("Opcion no valida: " + e.getMessage());
                                                            continue;
                                                        }
                                                        break;
                                                    case 3: // Escuchar canción
                                                        System.out.println(controlador.escucharCancion());
                                                        break;
                                                    case 4: // Regresar al menú anterior
                                                        mp3 = false;
                                                        break;
                                                    default: // Caso de opción inválida
                                                        System.out.println("Opcion no valida");
                                                        break;
                                                }
                                            }
                                            break;
                                        case 3: //Modo Spotify
                                            boolean spotify = true;

                                            // Ciclo principal del menú Spotify
                                            while (spotify) 
                                            {
                                                System.out.println("Seleccione una opcion:");
                                                System.out.println("1. Seleccionar una lista de reproduccion");
                                                System.out.println("2. Cambiar cancion");
                                                System.out.println("3. Escuchar cancion");
                                                System.out.println("4. Regresar al menu anterior");
            
                                                boolean inputValido15 = false;
                                                while (!inputValido15) 
                                                {
                                                    try 
                                                    {
                                                        opcion5 = scanner.nextInt();
                                                        inputValido15 = true; 
                                                    } 
                                                    catch (Exception e) 
                                                    {
                                                        System.out.println("Ingrese un valor valido");
                                                        scanner.nextLine(); 
                                                    }
                                                }
                                                scanner.nextLine();
                                                try 
                                                {
                                                    if (opcion5 > 0 && opcion5 < 5)
                                                    {
                                                        // Continuar si es válida
                                                    }
                                                } 
                                                catch (Exception e) 
                                                {
                                                    System.out.println("Opcion no valida: " + e.getMessage());
                                                    continue;
                                                }
                                                // Variable para almacenar la lista seleccionada
                                                int lista2 = 0;
            
                                                // Submenú del reproductor Spotify según la opción ingresada
                                                switch (opcion5) 
                                                {
                                                    case 1: // Selección de lista de reproducción
                                                        System.out.println("Seleccione una opcion:");
                                                        System.out.println("1. Young Miko");
                                                        System.out.println("2. Rock");

                                                        boolean inputValido16 = false;
                                                        while (!inputValido16) 
                                                        {
                                                            try 
                                                            {
                                                                lista2 = scanner.nextInt();
                                                                inputValido16 = true; 
                                                            }
                                                            catch (Exception e) 
                                                            {
                                                                System.out.println("Ingrese un valor valido");
                                                                scanner.nextLine(); 
                                                            }
                                                        }
                                                        scanner.nextLine();
                                                        try 
                                                        {
                                                            if (lista2 > 0 && lista2 < 3)
                                                            {
                                                                // Mostrar la lista seleccionada
                                                                System.out.println(controlador.seleccionarListaCD(lista2));
                                                            }
                                                        } 
                                                        catch (Exception e) 
                                                        {
                                                            System.out.println("Opcion no valida: " + e.getMessage());
                                                            continue;
                                                        }
                                                        break;
                                                    case 2: // Cambiar canción
                                                        System.out.println("Ingrese > para avanzar de cancion o < para regresar");
                                                        String cambio = ""; // Almacena la dirección del cambio
                                                        boolean inputValido17 = false;

                                                        while (!inputValido17) 
                                                        {
                                                            try 
                                                            {
                                                                cambio = scanner.nextLine();
                                                                inputValido17 = true; 
                                                            } 
                                                            catch (Exception e) 
                                                            {
                                                                System.out.println("Ingrese un valor valido");
                                                                scanner.nextLine(); 
                                                            }
                                                        }
                                                        try 
                                                        {
                                                            if (cambio.equals("<") || cambio.equals(">"))
                                                            // Cambiar canción en la dirección seleccionada
                                                            {
                                                                System.out.println(controlador.cambiarCancion(cambio));
                                                            }
                                                        } 
                                                        catch (Exception e) 
                                                        {
                                                            System.out.println("Opcion no valida: " + e.getMessage());
                                                            continue;
                                                        }
                                                        break;
                                                    case 3: // Escuchar canción
                                                        System.out.println(controlador.escucharCancion());
                                                        break;
                                                    case 4: // Regresar al menú anterior
                                                        spotify = false; // Finaliza el ciclo del menú Spotify
                                                        break;
                                                    default: // Caso de opción inválida
                                                        System.out.println("Opcion no valida");
                                                        break;
                                                }
                                            }
                                            break;
                                        case 4: // Salir del programa
                                            rep = false; // Finaliza el ciclo principal del caso 2
                                            break;
                                        default: // Caso de opción inválida
                                            System.out.println("Opcion no valida");
                                            break;
                                    }
                                }
                                break;
                            case 3: //Modo Telefono
                                System.out.println("Desea conectar el telefono?\nIngrese una opcion:");
                                System.out.println("1. Conectar");
                                System.out.println("2. Desconectar");
                                int opcion6 = 0;
                                boolean inputValido18 = false;
                                // Validación de la entrada del usuario para escoger entre conectar o desconectar.
                                while (!inputValido18) 
                                {
                                    try 
                                    {
                                        opcion6 = scanner.nextInt();
                                        inputValido18 = true; 
                                    } 
                                    catch (Exception e) 
                                    {
                                        System.out.println("Ingrese un valor valido");
                                        scanner.nextLine(); 
                                    }
                                }
                                scanner.nextLine();
                                try 
                                {
                                     // Validación de la opción seleccionada para conectar o desconectar el teléfono
                                    if (opcion6 > 0 && opcion6 < 3)
                                    {
                                        if (opcion6 == 1)
                                        {
                                            telefono = true; // Conectar el teléfono
                                        } 
                                        else
                                        {
                                            telefono = false; // Desconectar el teléfono y salir del proceso
                                            break;
                                        }
                                        controlador.encenderTelefono(telefono); // Enciende o apaga el teléfono según la selección.
                                    }
                                    else
                                    {
                                        System.out.println("Opcion no valida, regresando al menu anterior");
                                        break; // Opción inválida, regresa al menú anterior.
                                    }
                                } 
                                catch (Exception e) 
                                {
                                    System.out.println("Opcion no valida: " + e.getMessage());
                                    continue; // Si hay una excepción, continúa con el ciclo.
                                }
    
                                // Si el teléfono está conectado, entra en el menú de operaciones del teléfono.
                                while (telefono)
                                {
                                    boolean tel = true;
                                    // Muestra las opciones disponibles mientras el teléfono está conectado.
                                    while (tel) 
                                    {
                                        System.out.println(controlador.toStringTelefono());
                                        System.out.println("Seleccione una opcion:");
                                        System.out.println("1. Agregar contacto");
                                        System.out.println("2. Mostrar contactos");
                                        System.out.println("3. Llamar a contacto");
                                        System.out.println("4. Finalizar llamada");
                                        System.out.println("5. Llamar a ultimo contacto llamado");
                                        System.out.println("6. Desconectar");
                            
                                        int opcion7 = 0;
                                        boolean inputValido19 = false;
                                        // Validación de la entrada del usuario para escoger una opción del menú.
                                        while (!inputValido19) 
                                        {
                                            try 
                                            {
                                                opcion7 = scanner.nextInt();
                                                scanner.nextLine();
                                                inputValido19 = true; 
                                            } 
                                            catch (Exception e) 
                                            {
                                                System.out.println("Ingrese un valor valido");
                                                scanner.nextLine(); 
                                            }
                                        }
                                        try 
                                        {
                                            if (opcion7 > 0 && opcion7 < 7)
                                            {
                                                // Aquí iría la validación de la opción, aunque no se usa en el código.
                                            }
                                        } 
                                        catch (Exception e) 
                                        {
                                            System.out.println("Opcion no valida: " + e.getMessage());
                                            continue; // Si hay una excepción, continúa con el ciclo.
                                        }
        
                                        switch (opcion7) 
                                        {
                                            case 1:
                                                // Agregar un nuevo contacto
                                                System.out.println("Ingrese el nombre de la persona:");
                                                String nombre = "";
                                                boolean inputValido20 = false;
                                                while (!inputValido20) 
                                                {
                                                    try 
                                                    {
                                                        nombre = scanner.nextLine();
                                                        inputValido20 = true; // Si no hay excepción, la entrada es válida
                                                    } 
                                                    catch (Exception e) 
                                                    {
                                                        System.out.println("Ingrese un valor valido");
                                                        scanner.nextLine(); 
                                                    }
                                                }
                                                System.out.println("Ingrese el numero de telefono de la persona:");
                                                String celular = "";
                                                boolean inputValido21 = false;
                                                while (!inputValido21) 
                                                {
                                                    try 
                                                    {
                                                        celular = scanner.nextLine();
                                                        inputValido21 = true; // Si no hay excepción, la entrada es válida
                                                    } 
                                                    catch (Exception e) 
                                                    {
                                                        System.out.println("Ingrese un valor valido");
                                                        scanner.nextLine(); 
                                                    }
                                                }
                                                System.out.println("Ingrese el email de la persona:");
                                                String email = "";
                                                boolean inputValido22 = false;
                                                while (!inputValido22) 
                                                {
                                                    try 
                                                    {
                                                        email = scanner.nextLine();
                                                        inputValido22 = true; // Si no hay excepción, la entrada es válida
                                                    } 
                                                    catch (Exception e) 
                                                    {
                                                        System.out.println("Ingrese un valor valido");
                                                        scanner.nextLine(); 
                                                    }
                                                }
                                                System.out.println("Ingrese en que empresa trabaja la persona:");
                                                String empresa = "";
                                                boolean inputValido23 = false;
                                                while (!inputValido23) 
                                                {
                                                    try 
                                                    {
                                                        empresa = scanner.nextLine();
                                                        inputValido23 = true;  // Si no hay excepción, la entrada es válida
                                                    } catch (Exception e) 
                                                    {
                                                        System.out.println("Ingrese un valor valido");
                                                        scanner.nextLine(); 
                                                    }
                                                }
                                                System.out.println(controlador.agregarContacto(nombre, celular, email, empresa)); // Agrega el contacto y lo muestra.
                                                break;
                                            case 2:
                                                // Muestra la lista de contactos almacenados
                                                System.out.println(controlador.mostrarContactos());
                                                break;
                                            case 3:
                                                // Llamar a un contacto
                                                System.out.println("Ingrese el nombre de la persona que quiere llamar:");
                                                String nombre1 = "";
                                                boolean inputValido24 = false;
                                                while (!inputValido24) 
                                                {
                                                    try 
                                                    {
                                                        nombre1 = scanner.nextLine();
                                                        inputValido24 = true; // Si no hay excepción, la entrada es válida
                                                    } 
                                                    catch (Exception e) 
                                                    {
                                                        System.out.println("Ingrese un valor valido");
                                                        scanner.nextLine(); 
                                                    }
                                                }
                                                System.out.println(controlador.llamarContacto(nombre1)); // Llama al contacto seleccionado
                                                break;
                                            case 4:
                                                // Finaliza una llamada activa
                                                System.out.println(controlador.finalizarLlamada());
                                                break;
                                            case 5:
                                                // Llama al último contacto llamado
                                                System.out.println(controlador.llamarUltimo());
                                                break;
                                            case 6:
                                                // Desconectar el teléfono
                                                tel = false;
                                                telefono = false;
                                                System.out.println("Se ha desconectado el telefono"); // Mensaje de desconexión
                                                break;
                                            default:
                                                System.out.println("Opcion no valida"); // Opción inválida
                                                break;
                                            }
                                        }
                                    break;
                                }
                                break;
                            case 4: //Modo Productividad
                                boolean tarjeta = true; // Bandera para continuar mostrando el menú de opciones de tarjetas de presentación
                                // Bucle que sigue ejecutándose mientras tarjeta sea verdadera
                                while (tarjeta) 
                                {
                                    // Se presentan las opciones del menú de tarjetas de presentación
                                    System.out.println("Seleccione una opcion:");
                                    System.out.println("1. Agregar tarjeta de presentacion");
                                    System.out.println("2. Mostrar tarjeta de presentacion");
                                    System.out.println("3. Mostrar tarjetas de presentacion");
                                    System.out.println("4. Regresar al menu anterior");
        
                                    // Se captura la opción elegida por el usuario
                                    int opcion8 = 0;
                                    boolean inputValido25 = false;
                                    // Bucle para validar la entrada de opción
                                    while (!inputValido25) 
                                    {
                                        try 
                                        {
                                            opcion8 = scanner.nextInt();
                                            scanner.nextLine();
                                            inputValido25 = true; // Si no hay excepción, la entrada es válida
                                        } 
                                        catch (Exception e) 
                                        {
                                            System.out.println("Ingrese un valor valido");
                                            scanner.nextLine(); 
                                        }
                                    }    
                                    try 
                                    {
                                        if (opcion8 > 0 && opcion8 < 5)
                                        {
                                            // Verifica si la opción es válida
                                        }
                                    } 
                                    catch (Exception e) 
                                    {
                                        System.out.println("Opcion no valida: " + e.getMessage());
                                        continue;
                                    }
    
                                    switch (opcion8) 
                                    {
                                        case 1: // Agregar una tarjeta de presentación
                                            // Se piden los detalles para agregar una tarjeta
                                            System.out.println("Ingrese el nombre de la persona:");
                                            String nombre = "";
                                            boolean inputValido26 = false;
                                            while (!inputValido26) 
                                            {
                                                try 
                                                {
                                                    nombre = scanner.nextLine(); 
                                                    inputValido26 = true; // Si no hay excepción, la entrada es válida
                                                } 
                                                catch (Exception e) 
                                                {
                                                    System.out.println("Ingrese un valor valido");
                                                    scanner.nextLine(); 
                                                }
                                            }
                                            // Similar para el número de teléfono, email y empresa
                                            System.out.println("Ingrese el numero de telefono de la persona:");
                                            String celular = "";
                                            boolean inputValido27 = false;
                                            while (!inputValido27) 
                                            {
                                                try 
                                                {
                                                    celular = scanner.nextLine();
                                                    inputValido27 = true; // Si no hay excepción, la entrada es válida
                                                } 
                                                catch (Exception e) 
                                                {
                                                    System.out.println("Ingrese un valor valido");
                                                    scanner.nextLine(); 
                                                }
                                            }
                                            System.out.println("Ingrese el email de la persona:");
                                            String email = "";
                                            boolean inputValido28 = false;
                                            while (!inputValido28) 
                                            {
                                                try 
                                                {
                                                    email = scanner.nextLine();
                                                    inputValido28 = true; // Si no hay excepción, la entrada es válida
                                                } 
                                                catch (Exception e) 
                                                {
                                                    System.out.println("Ingrese un valor valido");
                                                    scanner.nextLine(); 
                                                }
                                            }
                                            System.out.println("Ingrese en que empresa trabaja la persona:");
                                            String empresa = "";
                                            boolean inputValido29 = false;
                                            while (!inputValido29) 
                                            {
                                                try 
                                                {
                                                    empresa = scanner.nextLine();
                                                    inputValido29 = true; // Si no hay excepción, la entrada es válida
                                                } 
                                                catch (Exception e) 
                                                {
                                                    System.out.println("Ingrese un valor valido");
                                                    scanner.nextLine(); 
                                                }
                                            }
                                            // Se agrega la tarjeta de presentación y se muestra un mensaje de confirmación
                                            System.out.println(controlador.agregarTarjeta(nombre, celular, email, empresa));
                                            break;
                                        case 2: // Mostrar una tarjeta de presentación individual
                                            System.out.println("Ingrese el nombre de la persona");
                                            String nombre1 = ""; // Lee el nombre de la persona cuya tarjeta se quiere ver 
                                            boolean inputValido30 = false;
                                            while (!inputValido30) 
                                            {
                                                try 
                                                {
                                                    nombre1 = scanner.nextLine();
                                                    inputValido30 = true; 
                                                } 
                                                catch (Exception e) 
                                                {
                                                    System.out.println("Ingrese un valor valido");
                                                    scanner.nextLine(); 
                                                }
                                            }
                                             // Si se encuentra la tarjeta, se imprime; si no, se muestra un mensaje de error
                                            if (controlador.encontrarTarjeta(nombre1) != null)
                                            {
                                                System.out.println(controlador.imprimirTarjeta(controlador.encontrarTarjeta(nombre1)));
                                            }
                                            else
                                            {
                                                System.out.println("No se encontro la tarjeta en su lista.");
                                            }
                                            break;
                                        case 3: // Mostrar todas las tarjetas de presentación
                                            System.out.println(controlador.imprimirTarjetas());
                                            break;
                                        case 4: // Regresar al menú anterior
                                            tarjeta = false; // Cambia la bandera para salir del bucle
                                            break;
                                        default: // Si la opción no es válida, se muestra un mensaje
                                            System.out.println("Opcion no valida");
                                            break;
                                    }
                                }
                                break;
                            case 5: // Termina el modo
                                modo = false;
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    }
                    break;
                case 3: //Apagar la radio
                    radio = false;
                    System.out.println("Tenga un buen dia");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        scanner.close();
    }
}