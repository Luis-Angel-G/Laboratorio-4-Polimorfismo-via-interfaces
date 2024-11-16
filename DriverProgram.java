import java.util.Scanner;

public class DriverProgram{
    public static void main(String[] args) {
        Radio rad = new RadioB();
        ControladorRadios controlador = new ControladorRadios(rad);
        Scanner scanner = new Scanner(System.in);
        boolean radio = false;
        boolean telefono = false;

        System.out.println("Bienvenido usuario, ¿desea encender la radio?\nIngrese una opcion:");
        System.out.println("1. Encender");
        System.out.println("2. Apagar");

        int opcion = 10;
        boolean inputValido = false;
        while (!inputValido) {
            System.out.print("Ingrese una opcion: ");
            try {
                opcion = scanner.nextInt();
                inputValido = true; 
            } catch (Exception e) {
                System.out.println("Ingrese un valor valido");
                scanner.nextLine(); 
            }
        }
        scanner.nextLine();
        try {
            if (opcion > 0 && opcion < 3){
                if (opcion == 1){
                    radio = true;
                } else{
                    System.out.println("Tenga un buen viaje");
                    radio = false;
                }
            }
        } catch (Exception e) {
            System.out.println("Opcion no valida: " + e.getMessage());
        }

        while (radio){
            System.out.println("Seleccione una opcion:");
            System.out.println("1. Subir volumen");
            System.out.println("2. Cambiar modo");
            System.out.println("3. Apagar");

            int opcion1 = 10;
            boolean inputValido2 = false;
            while (!inputValido2) {
                System.out.print("Ingrese una opcion: ");
                try {
                    opcion1 = scanner.nextInt();
                    inputValido2 = true; 
                } catch (Exception e) {
                    System.out.println("Ingrese un valor valido");
                    scanner.nextLine(); 
                }
            }
            scanner.nextLine();
            try {
                if (opcion1 > 0 && opcion1 < 4){
                }
            } catch (Exception e) {
                System.out.println("Opcion no valida: " + e.getMessage());
                continue;
            }
            
            switch (opcion1) {
                case 1:
                    System.out.println("Ingrese > para subir 1 de volumen o < para disminuirlo");
                    String volumen = "";
                    boolean inputValido3 = false;
                    while (!inputValido3) {
                        try {
                            volumen = scanner.nextLine();
                            inputValido3 = true; 
                        } catch (Exception e) {
                            System.out.println("Ingrese un valor valido");
                            scanner.nextLine(); 
                        }
                    }
                    try {
                        if (volumen.equals("<") || volumen.equals(">")){
                            System.out.println(controlador.ajustarVolumen(volumen));
                        }
                    } catch (Exception e) {
                        System.out.println("Opcion no valida: " + e.getMessage());
                        continue;
                    }
                    break;
                case 2:
                    boolean modo = true;
                    while (modo) {
                        System.out.println("Seleccione una opcion:");
                        System.out.println("1. Modo Radio");
                        System.out.println("2. Modo Reproduccion");
                        System.out.println("3. Modo Telefono");
                        System.out.println("4. Modo Productividad");
                        System.out.println("5. Regresar al menu anterior");
    
                        int opcion2 = 10;
                        boolean inputValido4 = false;
                        while (!inputValido4) {
                            try {
                                opcion2 = scanner.nextInt();
                                inputValido4 = true; 
                            } catch (Exception e) {
                                System.out.println("Ingrese un valor valido");
                                scanner.nextLine(); 
                            }
                        }
                        scanner.nextLine();
                        try {
                            if (opcion2 > 0 && opcion2 < 6){
                            }
                        } catch (Exception e) {
                            System.out.println("Opcion no valida: " + e.getMessage());
                            continue;
                        }
    
                        switch (opcion2) {
                            case 1:
                                boolean radi = true;
                                while (radi) {
                                    System.out.println(controlador.toStringRadio());
                                    System.out.println("Seleccione una opcion:");
                                    System.out.println("1. Cambiar de onda");
                                    System.out.println("2. Cambiar emisora");
                                    System.out.println("3. Guardar emisora");
                                    System.out.println("4. Cargar emisora");
                                    System.out.println("5. Regresar al menu anterior");
        
                                    int opcion3 = 10;

                                    boolean inputValido5 = false;
                                    while (!inputValido5) {
                                        try {
                                            opcion3 = scanner.nextInt();
                                            inputValido5 = true; 
                                        } catch (Exception e) {
                                            System.out.println("Ingrese un valor valido");
                                            scanner.nextLine(); 
                                        }
                                    }
                                    scanner.nextLine();
                                    try {
                                        if (opcion3 > 0 && opcion3 < 6){
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Opcion no valida: " + e.getMessage());
                                        continue;
                                    }
        
                                    switch (opcion3) {
                                        case 1:
                                            System.out.println(controlador.cambiarBanda());
                                            break;
                                        case 2:
                                            System.out.println(controlador.cambiarEmisora());
                                            break;
                                        case 3:
                                            System.out.println("Ingrese en que posicion quiere guardar la emisora");

                                            int guardar = 10;
                                            boolean inputValido6 = false;
                                            while (!inputValido6) {
                                                try {
                                                    guardar = scanner.nextInt();
                                                    inputValido6 = true; 
                                                } catch (Exception e) {
                                                    System.out.println("Ingrese un valor valido");
                                                    scanner.nextLine(); 
                                                }
                                            }
                                            scanner.nextLine();
                                            try {
                                                System.out.println(controlador.guardarEmisora(guardar));
                                            } catch (Exception e) {
                                                System.out.println("Opcion no valida: " + e.getMessage());
                                                continue;
                                            }
                                            break;
                                        case 4:
                                            System.out.println("Ingrese el numero de la emisora a cargar");
                                            int cargar = 0;
                                            boolean inputValido7 = false;
                                            while (!inputValido7) {
                                                try {
                                                    cargar = scanner.nextInt();
                                                    inputValido7 = true; 
                                                } catch (Exception e) {
                                                    System.out.println("Ingrese un valor valido");
                                                    scanner.nextLine(); 
                                                }
                                            }
                                            scanner.nextLine();
                                            try {
                                                System.out.println(controlador.cargarEmisora(cargar));
                                            } catch (Exception e) {
                                                System.out.println("Opcion no valida: " + e.getMessage());
                                                continue;
                                            }
                                            break;
                                        case 5:
                                            radi = false;
                                            break;
                                        default:
                                            System.out.println("Opcion no valida");
                                            break;
                                    }
                                }
                                break;
                            case 2:
                                boolean rep = true;
                                while (rep) {
                                    System.out.println(controlador.toStringReproduccion());
                                    System.out.println("Seleccione una opcion:");
                                    System.out.println("1. CD");
                                    System.out.println("2. MP3");
                                    System.out.println("3. Spotify");
                                    System.out.println("4. Regresar al menu anterior");
        
                                    int opcion4 = 0;
                                    boolean inputValido8 = false;
                                    while (!inputValido8) {
                                        try {
                                            opcion4 = scanner.nextInt();
                                            inputValido8 = true; 
                                        } catch (Exception e) {
                                            System.out.println("Ingrese un valor valido");
                                            scanner.nextLine(); 
                                        }
                                    }
                                    scanner.nextLine();        
                                    try {
                                        if (opcion4 > 0 && opcion4 < 5){
                                            controlador.cambiarConexion(opcion4);
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Opcion no valida: " + e.getMessage());
                                        continue;
                                    }
        
                                    int opcion5 = 0;
                                    switch (opcion4) {
                                        case 1:
                                            boolean cd = true;
                                            while (cd) {
                                                System.out.println("Seleccione una opcion:");
                                                System.out.println("1. Seleccionar una lista de reproduccion");
                                                System.out.println("2. Cambiar cancion");
                                                System.out.println("3. Escuchar cancion");
                                                System.out.println("4. Regresar al menu anterior");

                                                boolean inputValido9 = false;
                                                while (!inputValido9) {
                                                    try {
                                                        opcion5 = scanner.nextInt();
                                                        inputValido9 = true; 
                                                    } catch (Exception e) {
                                                        System.out.println("Ingrese un valor valido");
                                                        scanner.nextLine(); 
                                                    }
                                                }
                                                scanner.nextLine();
                                                try {
                                                    if (opcion5 > 0 && opcion5 < 5){
                                                    }
                                                } catch (Exception e) {
                                                    System.out.println("Opcion no valida: " + e.getMessage());
                                                    continue;
                                                }
            
                                                int lista = 0;
            
                                                switch (opcion5) {
                                                    case 1:
                                                        System.out.println("Seleccione una opcion:");
                                                        System.out.println("1. Ana Mena");
                                                        System.out.println("2. Clasica");

                                                        boolean inputValido10 = false;
                                                        while (!inputValido10) {
                                                            try {
                                                                lista = scanner.nextInt();
                                                                inputValido10 = true; 
                                                            } catch (Exception e) {
                                                                System.out.println("Ingrese un valor valido");
                                                                scanner.nextLine(); 
                                                            }
                                                        }
                                                        scanner.nextLine();
                                                        try {
                                                            if (lista > 0 && lista < 3){
                                                                System.out.println(controlador.seleccionarListaCD(lista));
                                                            }
                                                        } catch (Exception e) {
                                                            System.out.println("Opcion no valida: " + e.getMessage());
                                                            continue;
                                                        }
                                                        break;
                                                    case 2:
                                                        System.out.println("Ingrese > para avanzar de cancion o < para regresar");
                                                        String cambio = "";
                                                        boolean inputValido11 = false;
                                                        while (!inputValido11) {
                                                            try {
                                                                cambio = scanner.nextLine();
                                                                inputValido11 = true; 
                                                            } catch (Exception e) {
                                                                System.out.println("Ingrese un valor valido");
                                                                scanner.nextLine(); 
                                                            }
                                                        }
                                                        try {
                                                            if (cambio.equals("<") || cambio.equals(">")){
                                                                System.out.println(controlador.cambiarCancion(cambio));
                                                            }
                                                        } catch (Exception e) {
                                                            System.out.println("Opcion no valida: " + e.getMessage());
                                                            continue;
                                                        }
                                                        break;
                                                    case 3:
                                                        System.out.println(controlador.escucharCancion());
                                                        break;
                                                    case 4:
                                                        cd = false;
                                                        break;
                                                    default:
                                                        System.out.println("Opcion no valida");
                                                        break;
                                                }
                                            }
                                            break;
                                        case 2:
                                            boolean mp3 = true;
                                            while (mp3) {
                                                System.out.println("Seleccione una opcion:");
                                                System.out.println("1. Seleccionar una lista de reproduccion");
                                                System.out.println("2. Cambiar cancion");
                                                System.out.println("3. Escuchar cancion");
                                                System.out.println("4. Regresar al menu anterior");
            
                                                boolean inputValido12 = false;
                                                while (!inputValido12) {
                                                    try {
                                                        opcion5 = scanner.nextInt();
                                                        inputValido12 = true; 
                                                    } catch (Exception e) {
                                                        System.out.println("Ingrese un valor valido");
                                                        scanner.nextLine(); 
                                                    }
                                                }
                                                scanner.nextLine();
                                                try {
                                                    if (opcion5 > 0 && opcion5 < 5){
                                                    }
                                                } catch (Exception e) {
                                                    System.out.println("Opcion no valida: " + e.getMessage());
                                                    continue;
                                                }
            
                                                int lista1 = 0;
                                                switch (opcion5) {
                                                    case 1:
                                                        System.out.println("Seleccione una opcion:");
                                                        System.out.println("1. Emilia Mernes");
                                                        System.out.println("2. Pop");
            
                                                        boolean inputValido13 = false;
                                                        while (!inputValido13) {
                                                            try {
                                                                lista1 = scanner.nextInt();
                                                                inputValido13 = true;
                                                            } catch (Exception e) {
                                                                System.out.println("Ingrese un valor valido");
                                                                scanner.nextLine(); 
                                                            }
                                                        }
                                                        scanner.nextLine();
                                                        try {
                                                            if (lista1 > 0 && lista1 < 3){
                                                                System.out.println(controlador.seleccionarListaMP3(lista1));
                                                            }
                                                        } catch (Exception e) {
                                                            System.out.println("Opcion no valida: " + e.getMessage());
                                                            continue;
                                                        }
                                                        break;
                                                    case 2:
                                                        System.out.println("Ingrese > para avanzar de cancion o < para regresar");
                                                        String cambio = "";
                                                        boolean inputValido14 = false;
                                                        while (!inputValido14) {
                                                            try {
                                                                cambio = scanner.nextLine();
                                                                inputValido14 = true; 
                                                            } catch (Exception e) {
                                                                System.out.println("Ingrese un valor valido");
                                                                scanner.nextLine(); 
                                                            }
                                                        }
                                                        try {
                                                            if (cambio.equals("<") || cambio.equals(">")){
                                                                System.out.println(controlador.cambiarCancion(cambio));
                                                            }
                                                        } catch (Exception e) {
                                                            System.out.println("Opcion no valida: " + e.getMessage());
                                                            continue;
                                                        }
                                                        break;
                                                    case 3:
                                                        System.out.println(controlador.escucharCancion());
                                                        break;
                                                    case 4:
                                                        mp3 = false;
                                                        break;
                                                    default:
                                                        System.out.println("Opcion no valida");
                                                        break;
                                                }
                                            }
                                            break;
                                        case 3:
                                            boolean spotify = true;
                                            while (spotify) {
                                                System.out.println("Seleccione una opcion:");
                                                System.out.println("1. Seleccionar una lista de reproduccion");
                                                System.out.println("2. Cambiar cancion");
                                                System.out.println("3. Escuchar cancion");
                                                System.out.println("4. Regresar al menu anterior");
            
                                                boolean inputValido15 = false;
                                                while (!inputValido15) {
                                                    try {
                                                        opcion5 = scanner.nextInt();
                                                        inputValido15 = true; 
                                                    } catch (Exception e) {
                                                        System.out.println("Ingrese un valor valido");
                                                        scanner.nextLine(); 
                                                    }
                                                }
                                                scanner.nextLine();
                                                try {
                                                    if (opcion5 > 0 && opcion5 < 5){
                                                    }
                                                } catch (Exception e) {
                                                    System.out.println("Opcion no valida: " + e.getMessage());
                                                    continue;
                                                }
            
                                                int lista2 = 0;
            
                                                switch (opcion5) {
                                                    case 1:
                                                        System.out.println("Seleccione una opcion:");
                                                        System.out.println("1. Young Miko");
                                                        System.out.println("2. Rock");

                                                        boolean inputValido16 = false;
                                                        while (!inputValido16) {
                                                            try {
                                                                lista2 = scanner.nextInt();
                                                                inputValido16 = true; 
                                                            } catch (Exception e) {
                                                                System.out.println("Ingrese un valor valido");
                                                                scanner.nextLine(); 
                                                            }
                                                        }
                                                        scanner.nextLine();
                                                        try {
                                                            if (lista2 > 0 && lista2 < 3){
                                                                System.out.println(controlador.seleccionarListaSpotify(lista2));
                                                            }
                                                        } catch (Exception e) {
                                                            System.out.println("Opcion no valida: " + e.getMessage());
                                                            continue;
                                                        }
                                                        break;
                                                    case 2:
                                                        System.out.println("Ingrese > para avanzar de cancion o < para regresar");
                                                        String cambio = "";
                                                        boolean inputValido17 = false;
                                                        while (!inputValido17) {
                                                            try {
                                                                cambio = scanner.nextLine();
                                                                inputValido17 = true; 
                                                            } catch (Exception e) {
                                                                System.out.println("Ingrese un valor valido");
                                                                scanner.nextLine(); 
                                                            }
                                                        }
                                                        try {
                                                            if (cambio.equals("<") || cambio.equals(">")){
                                                                System.out.println(controlador.cambiarCancion(cambio));
                                                            }
                                                        } catch (Exception e) {
                                                            System.out.println("Opcion no valida: " + e.getMessage());
                                                            continue;
                                                        }
                                                        break;
                                                    case 3:
                                                        System.out.println(controlador.escucharCancion());
                                                        break;
                                                    case 4:
                                                        spotify = false;
                                                        break;
                                                    default:
                                                        System.out.println("Opcion no valida");
                                                        break;
                                                }
                                            }
                                            break;
                                        case 4:
                                            rep = false;
                                            break;
                                        default:
                                            System.out.println("Opcion no valida");
                                            break;
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("Desea conectar el telefono?\nIngrese una opcion:");
                                System.out.println("1. Conectar");
                                System.out.println("2. Desconectar");
                                int opcion6 = 0;
                                boolean inputValido18 = false;
                                while (!inputValido18) {
                                    try {
                                        opcion6 = scanner.nextInt();
                                        inputValido18 = true; 
                                    } catch (Exception e) {
                                        System.out.println("Ingrese un valor valido");
                                        scanner.nextLine(); 
                                    }
                                }
                                scanner.nextLine();
                                try {
                                    if (opcion6 > 0 && opcion6 < 3){
                                        if (opcion6 == 1){
                                            telefono = true;
                                        } else{
                                            telefono = false;
                                            break;
                                        }
                                        controlador.encenderTelefono(telefono);
                                    }else{
                                        System.out.println("Opcion no valida, regresando al menu anterior");
                                        break;
                                    }
                                } catch (Exception e) {
                                    System.out.println("Opcion no valida: " + e.getMessage());
                                    continue;
                                }
    
                                while (telefono){
                                    boolean tel = true;
                                    while (tel) {
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
                                        while (!inputValido19) {
                                            try {
                                                opcion7 = scanner.nextInt();
                                                inputValido19 = true; 
                                            } catch (Exception e) {
                                                System.out.println("Ingrese un valor valido");
                                                scanner.nextLine(); 
                                            }
                                        }
                                        scanner.nextLine();
                                        try {
                                            if (opcion7 > 0 && opcion7 < 7){
                                            }
                                        } catch (Exception e) {
                                            System.out.println("Opcion no valida: " + e.getMessage());
                                            continue;
                                        }
        
                                        switch (opcion7) {
                                            case 1:
                                                System.out.println("Ingrese el nombre de la persona:");
                                                String nombre = "";
                                                boolean inputValido20 = false;
                                                while (!inputValido20) {
                                                    try {
                                                        nombre = scanner.nextLine();
                                                        inputValido20 = true; 
                                                    } catch (Exception e) {
                                                        System.out.println("Ingrese un valor valido");
                                                        scanner.nextLine(); 
                                                    }
                                                }
                                                System.out.println("Ingrese el numero de telefono de la persona:");
                                                String celular = "";
                                                boolean inputValido21 = false;
                                                while (!inputValido21) {
                                                    try {
                                                        celular = scanner.nextLine();
                                                        inputValido21 = true; 
                                                    } catch (Exception e) {
                                                        System.out.println("Ingrese un valor valido");
                                                        scanner.nextLine(); 
                                                    }
                                                }
                                                System.out.println("Ingrese el email de la persona:");
                                                String email = "";
                                                boolean inputValido22 = false;
                                                while (!inputValido22) {
                                                    try {
                                                        email = scanner.nextLine();
                                                        inputValido22 = true; 
                                                    } catch (Exception e) {
                                                        System.out.println("Ingrese un valor valido");
                                                        scanner.nextLine(); 
                                                    }
                                                }
                                                System.out.println("Ingrese en que empresa trabaja la persona:");
                                                String empresa = "";
                                                boolean inputValido23 = false;
                                                while (!inputValido23) {
                                                    try {
                                                        empresa = scanner.nextLine();
                                                        inputValido23 = true; 
                                                    } catch (Exception e) {
                                                        System.out.println("Ingrese un valor valido");
                                                        scanner.nextLine(); 
                                                    }
                                                }
                                                System.out.println(controlador.agregarContacto(nombre, celular, email, empresa));
                                                break;
                                            case 2:
                                                System.out.println(controlador.mostrarContactos());
                                                break;
                                            case 3:
                                                System.out.println("Ingrese el nombre de la persona que quiere llamar:");
                                                String nombre1 = "";
                                                boolean inputValido24 = false;
                                                while (!inputValido24) {
                                                    try {
                                                        nombre1 = scanner.nextLine();
                                                        inputValido24 = true; 
                                                    } catch (Exception e) {
                                                        System.out.println("Ingrese un valor valido");
                                                        scanner.nextLine(); 
                                                    }
                                                }
                                                System.out.println(controlador.llamarContacto(nombre1));
                                                break;
                                            case 4:
                                                System.out.println(controlador.finalizarLlamada());
                                                break;
                                            case 5:
                                                System.out.println(controlador.llamarUltimo());
                                                break;
                                            case 6:
                                                tel = false;
                                                telefono = false;
                                                System.out.println("Se ha desconectado el telefono");
                                                break;
                                            default:
                                                System.out.println("Opcion no valida");
                                                break;
                                            }
                                        }
                                    break;
                                }
                                break;
                            case 4:
                                boolean tarjeta = true;
                                while (tarjeta) {
                                    System.out.println("Seleccione una opcion:");
                                    System.out.println("1. Agregar tarjeta de presentacion");
                                    System.out.println("2. Mostrar tarjeta de presentacion");
                                    System.out.println("3. Mostrar tarjetas de presentacion");
                                    System.out.println("4. Regresar al menu anterior");
        
                                    int opcion8 = 0;
                                    boolean inputValido25 = false;
                                    while (!inputValido25) {
                                        try {
                                            opcion8 = scanner.nextInt();
                                            inputValido25 = true; 
                                        } catch (Exception e) {
                                            System.out.println("Ingrese un valor valido");
                                            scanner.nextLine(); 
                                        }
                                    }
                                    scanner.nextLine();    
                                    try {
                                        if (opcion8 > 0 && opcion8 < 5){
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Opcion no valida: " + e.getMessage());
                                        continue;
                                    }
    
                                    switch (opcion8) {
                                        case 1:
                                            System.out.println("Ingrese el nombre de la persona:");
                                            String nombre = "";
                                            boolean inputValido26 = false;
                                            while (!inputValido26) {
                                                try {
                                                    nombre = scanner.nextLine();
                                                    inputValido26 = true; 
                                                } catch (Exception e) {
                                                    System.out.println("Ingrese un valor valido");
                                                    scanner.nextLine(); 
                                                }
                                            }
                                            System.out.println("Ingrese el numero de telefono de la persona:");
                                            String celular = "";
                                            boolean inputValido27 = false;
                                            while (!inputValido27) {
                                                try {
                                                    celular = scanner.nextLine();
                                                    inputValido27 = true; 
                                                } catch (Exception e) {
                                                    System.out.println("Ingrese un valor valido");
                                                    scanner.nextLine(); 
                                                }
                                            }
                                            System.out.println("Ingrese el email de la persona:");
                                            String email = "";
                                            boolean inputValido28 = false;
                                            while (!inputValido28) {
                                                try {
                                                    email = scanner.nextLine();
                                                    inputValido28 = true; 
                                                } catch (Exception e) {
                                                    System.out.println("Ingrese un valor valido");
                                                    scanner.nextLine(); 
                                                }
                                            }
                                            System.out.println("Ingrese en que empresa trabaja la persona:");
                                            String empresa = "";
                                            boolean inputValido29 = false;
                                            while (!inputValido29) {
                                                try {
                                                    empresa = scanner.nextLine();
                                                    inputValido29 = true; 
                                                } catch (Exception e) {
                                                    System.out.println("Ingrese un valor valido");
                                                    scanner.nextLine(); 
                                                }
                                            }
                                            System.out.println(controlador.agregarTarjeta(nombre, celular, email, empresa));
                                            break;
                                        case 2:
                                            System.out.println("Ingrese el nombre de la persona");
                                            String nombre1 = "";
                                            boolean inputValido30 = false;
                                            while (!inputValido30) {
                                                try {
                                                    nombre1 = scanner.nextLine();
                                                    inputValido30 = true; 
                                                } catch (Exception e) {
                                                    System.out.println("Ingrese un valor valido");
                                                    scanner.nextLine(); 
                                                }
                                            }
                                            if (controlador.encontrarTarjeta(nombre1) != null){
                                                System.out.println(controlador.imprimirTarjeta(controlador.encontrarTarjeta(nombre1)));
                                            }else{
                                                System.out.println("No se encontro la tarjeta en su lista.");
                                            }
                                            break;
                                        case 3:
                                            System.out.println(controlador.imprimirTarjetas());
                                            break;
                                        case 4:
                                            tarjeta = false;
                                            break;
                                        default:
                                            System.out.println("Opcion no valida");
                                            break;
                                    }
                                }
                                break;
                            case 5:
                                modo = false;
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    }
                    break;
                case 3:
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