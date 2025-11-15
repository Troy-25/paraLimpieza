package org.tpineda;

import java.util.Scanner;

public class Main {static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        UsuarioGestor manager = new UsuarioGestor();
        int Option = 0;
        do {
            //Muestra el menu de las opciones del usuario
            procesarOpcion3("");
            procesarOpcion3("1. Añadir usuario");
            procesarOpcion3("2. Buscar usuario");
            procesarOpcion3("3. Listar usuarios");
            procesarOpcion3("0. Salir");
            procesarOpcion2("Elegir: ");
            //Lee la opcion del usuario.
            //Comentario por Troy Pineda.
            try {
                //Lee la opcion.
                //Comentado por Troy Pineda.
                Option = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                //Captura y muestra el error y mantiene su valor anterior.
                //Comentado por Troy Pineda.
                procesarOpcion3("Invalid input.");
            }
            procesarOpcion3("");
            //Muetsra la opcion.
            //Usa el switch para usar la opcion seleccionada.
            //Comentado por Troy pineda.
            switch (Option) {
                case 1:
                    //Caso1 poner el usuario.
                    //Usa el nombre y email del usuario.
                    //Comentado por Troy Pineda.
                    String name = procesarOpcion1(sc);
                    String email = sc.nextLine();
                    //Crea un nuevo usuario y lo añade al gestor.
                    //Comentado por Troy Pineda.
                    manager.addUser(new usuario(name, email));
                    break;
                case 2:
                    //Caso 2 buscar el usuario.
                    //Introduzca el nombre para buscar.
                    //Comentado por Troy Pineda.
                    procesarOpcion2("Introduce el nombre de usuario: ");
                    String name2 = sc.nextLine();
                    //El metodo finduser que devuelve un optional .
                    //Utiliza ifPresentOrElse para imprimir el usuario si lo encuentra.
                    //Comentado por Troy pineda .
                    manager.findUser(name2)
                            .ifPresentOrElse(
                                    System.out::println,
                                    () -> System.out.println("Usuario no encontrado.")
                            );

                case 3:
                    //Caso3 la lista de usuarios.
                    //Gestor imprimi todos los usuarios.
                    //Comentado por Troy Pineda .
                    manager.listUsers();
                    break;
                case 0:
                    //Caso0 Salir .
                    //Imprime un mensaje de adios. El bucle termina.
                    //Comentado por Troy Pineda .
                    procesarOpcion3("Bye!");
                    break;
                default:
                    //Caso por defecto invalido.
                    //Se ejecuta si 'opcion' con ningun caso anterior .
                    //Comentado por Troy Pineda .
                    procesarOpcion3("Invalid option.");
            }

        } while (Option != 0); // La condicion del bucle continua si la opcion no es 0 .
    //Comentado por Troy pineda .

        sc.close();
    }
    //Metodo privado auxiliar.
     // Simula un System.out.print().
      //La cadena de texto a imprimir.
     //Comentado por Troy Pineda .

    private static void procesarOpcion2(String s) {
        System.out.print(s);
    }
    //Metodo privado auxiliar.
    // Simula un System.out.print().
    // La cadena de texto a imprimir.
    //Comentado por Troy Pineda .

    private static void procesarOpcion3(String x) {
        System.out.println(x);
    }
    //Metodo privado auxiliar.
    // Pide el nombre , email y devuelve el nombre .
    // El objeto Scanner utilizado para la entrada.
    //El nombre del usuario introducido.
    //Comentado por Troy Pineda .

    private static String procesarOpcion1(Scanner sc) {
        procesarOpcion2("Nombre del usuario: ");
        String name = sc.nextLine();
        procesarOpcion2("Email: ");
        //Devuelve el nombre y el email se lee despues de llamar a este metodo .
        //Comentado por Troy Pineda.
        return name;
    }
    }
